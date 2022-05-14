package ru.gb.girenko.homework7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food=food;
    }

    public void decreaseFood(int n){
        food-=n;
    }
    public void info(){
        if(food<0){
            System.out.println("Коту мало еды!!!!!");
        }else {
            System.out.println("Plate: " + food);
        }
    }
}
