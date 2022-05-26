package ru.gb.girenko.level2.homework1;

public class Robot implements Action {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}
