package ru.gb.girenko.homework6;

import java.util.Scanner;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        int l = request();
        if(l> 200){
            System.out.println("Кот столько не пробежит!!!");
        }else {
            System.out.println("Cat " + getName() + " run: " + l + "m");
        }
    }
    public void swim(){
        int l = request();
        System.out.println("Cat "+getName()+" swim: "+ l + "m");
    }
}
