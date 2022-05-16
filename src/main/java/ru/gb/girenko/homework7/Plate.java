package ru.gb.girenko.homework7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food=food;
    }
    public void decreaseFood(int n){
        if(food>=n){
           food-=n;
           Cat.setSatiety(true);
        }else {
            Cat.setSatiety(false);
        }
    }
    public void info(){
        if(!Cat.isSatiety()){
            System.out.println("Мало еды!!!!!");
            System.out.println("В тарелке: " + food);
        }else {
            System.out.println("Поел!!!, в тарелке осталось: "+food);
        }
    }
}
