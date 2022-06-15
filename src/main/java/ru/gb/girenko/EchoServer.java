package ru.gb.girenko;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {



    public static void main(String[] args) {
        try (ServerSocket serverSocket=new ServerSocket(8189)) {
            System.out.println("Ждем подключение");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String massage = in.readUTF();
                if("/end".equalsIgnoreCase(massage)){
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента : "+massage);
                out.writeUTF("[echo] " +massage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
