package ru.gb.girenko.homework7;

public class Cat {
    private String name;
    private int appetite;
    private static boolean satiety;
    public Cat (String name, int appetite, boolean satiety){
        this.name=name;
        this.appetite=appetite;
        this.satiety=satiety;
    }
    public void eat(Plate p){
        p.decreaseFood(appetite);
        p.info();
    }

    public static boolean isSatiety() {
        return satiety;
    }

    public static void setSatiety(boolean satiety) {
        Cat.satiety = satiety;
    }

    public String getName() {
        return name;
    }
}
