package ru.gb.girenko.homework7;

import java.util.Scanner;
import java.util.SortedMap;

public class Plate {
    private int food;
    public Plate(int food){
        this.food=food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n){
        if(food>=n){
           food-=n;
           return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "В тарелке осталось: " + food + " еды.";
    }

    public void addingFood(){
        Scanner in = new Scanner(System.in);
        System.out.print("Еще еды(max:200): ");
        int plusFood = in.nextInt();
        if(plusFood>0 && plusFood<=200) {
            food += plusFood;
        }else{
            System.out.println("Ошибка! Число не может быть отрицательным и больше 200.");
        }
    }
}
