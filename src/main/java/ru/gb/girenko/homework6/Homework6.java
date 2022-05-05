package ru.gb.girenko.homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        choiceDis();
    }

    public static void choiceCat(){
        Cat[] cat= new Cat[10];
        cat[0] = new Cat("Мурзик");
        cat[1] = new Cat("Барсик");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дисциплину (1 - run; 2 - swim): ");
        String s = scanner.nextLine();
        int dis = Integer.parseInt(s);
        int n = 0;
        if(dis == 1){
            for (int i = 0; i < cat.length ; i++) {
                if(cat[i]!=null) {
                    cat[i].run();
                    n=i+1;
                }else {
                    break;
                }
            }
        }else if (dis == 2) {
            System.out.println( "Коты не умеют плавать!!!");
        }
        System.out.println("Количество котов: "+n);
    }

    private static void choiceDog() {
        Dog[] dog = new Dog[10];
        dog[0] = new Dog("Бобик");
        dog[1] = new Dog("Мухтар");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дисциплину (1 - run; 2 - swim): ");
        String s = scanner.nextLine();
        int dis = Integer.parseInt(s);
        int n = 0;
        if(dis == 1){
            for (int i = 0; i < dog.length ; i++) {
                if(dog[i]!=null){
                    dog[i].run();
                    n=i+1;
                }else {
                    break;
                }
            }
        }else if (dis == 2) {
            for (int i = 0; i < dog.length; i++) {
                if(dog[i]!=null) {
                    dog[i].swim();
                    n=i+1;
                }else {
                    break;
                }
            }
        }
        System.out.println("Количество собак: "+n);
    }

    public static void choiceDis (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите животных (1 - коты; 2 - собаки): ");
        String s = scanner.nextLine();
        int breed = Integer.parseInt(s);
        if( breed == 1) {
            choiceCat();
        } else if( breed == 2) {
            choiceDog();
        }
    }
}
