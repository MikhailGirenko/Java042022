package ru.gb.girenko.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka",5);
        Plate plate = new Plate(4);
        plate.info();
        cat.eat(plate);
        plate.info();

    }
}
