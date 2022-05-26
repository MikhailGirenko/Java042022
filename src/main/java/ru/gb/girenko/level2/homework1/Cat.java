package ru.gb.girenko.level2.homework1;

public class Cat implements Action {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
}
