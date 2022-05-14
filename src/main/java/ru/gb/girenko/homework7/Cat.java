package ru.gb.girenko.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat (String name, int appetite, boolean satiety){
        this.name=name;
        this.appetite=appetite;
        this.satiety=satiety;
    }
    public void eat(Plate p){
        p.decreaseFood(appetite);
        satiety =  p.satietyCat(satiety);
    }

    public boolean isSatiety() {
        return satiety;
    }
}
