package ru.gb.girenko.homework6;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    public void run() {
        int l = request();
        if(l> 500){
            System.out.println("Собака столько не пробежит!!!");
        }else {
            System.out.println("Dog " + getName() + " run: " + l + "m");
        }
    }
    public void swim(){
        int l = request();
        if(l> 10){
            System.out.println("Собака столько не проплывет!!!");
        }else {
            System.out.println("Dog " + getName() + " swim: " + l + "m");
        }
    }
}
