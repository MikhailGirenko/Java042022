package ru.gb.girenko.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka",11,false);
        Plate plate = new Plate(10);
        cat.eat(plate);
        System.out.println(Cat.isSatiety());
        plate.info();
    }
}

