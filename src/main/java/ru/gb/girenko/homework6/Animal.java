package ru.gb.girenko.homework6;

import java.util.Scanner;

public class Animal {


    private String name;
    private int l;

    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    public void run (){

    }
    public void swim (){

    }
    public int request(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите растояние (m): ");
        String s = scanner.nextLine();
        return l = Integer.parseInt(s);
    }

}
