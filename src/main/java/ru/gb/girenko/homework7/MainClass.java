package ru.gb.girenko.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka",5,false);
        Plate plate = new Plate(10);
        System.out.println(cat1.isSatiety());
        plate.info();
        cat1.eat(plate);
        System.out.println(cat1.isSatiety());
        plate.info();

    }
}
