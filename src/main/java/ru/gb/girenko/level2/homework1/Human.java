package ru.gb.girenko.level2.homework1;

public class Human implements Action {
    String name;

    public Human(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }
}
