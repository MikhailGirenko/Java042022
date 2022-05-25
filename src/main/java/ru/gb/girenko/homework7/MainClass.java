package ru.gb.girenko.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat=new Cat[4];
        cat[0] = new Cat("Murka",10);
        cat[1] = new Cat("Barsik",5);
        cat[2] = new Cat("Pushok",10);
        cat[3] = new Cat("Vaska",12);
        Plate plate = new Plate(11);
        for (int i = 0; i < cat.length; i++) {
            while (cat[i].getAppetite()>plate.getFood()){
                plate.addingFood();
            }
            cat[i].eat(plate);
            System.out.println(plate);
        }
        System.out.println();
        System.out.println("Все коты сыты!!!");
    }
}

