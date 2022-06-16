package ru.gb.girenko;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    private DataOutputStream out;
    private DataInputStream in;


    public static void main(String[] args) {
        new EchoServer().openConnection();
    }
    private void sendMessage (String message){
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void message(){
        new Thread(()->{
            Scanner scanner = new Scanner(System.in);
            while (true){
                sendMessage(scanner.nextLine());
            }
        }).start();
    }

    private void openConnection(){
        try (ServerSocket serverSocket=new ServerSocket(8189)) {
            System.out.println("Ждем подключение");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String message = in.readUTF();
                if("/end".equalsIgnoreCase(message)){
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента : "+message);
                message();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
