package ru.gb.girenko.homework7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat=new Cat[4];
        cat[0] = new Cat("Murka",10,false);
        cat[1] = new Cat("Barsik",5,false);
        cat[2] = new Cat("Pushok",10,false);
        cat[3] = new Cat("Vaska",12,false);
        Plate plate = new Plate(12);
        for (int i = 0; i < cat.length; i++) {
            System.out.println("Кот: "+cat[i].getName());
            while (cat[i].getAppetite()>plate.getFood()){
                plate.addingFood();
            }
            cat[i].eat(plate);
        }

    }
}

