package ru.gb.girenko.level2.homework1;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot("R2-D2");
        Cat cat = new Cat("Vaska");
        Human human = new Human("Ivan");
        human.jump();
        human.run();
        cat.jump();
        cat.run();
        robot.run();
        robot.jump();
    }
}
