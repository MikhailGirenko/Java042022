package ru.gb.girenko.homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(firstTask(16,5));
        System.out.println(secondTask(-3));
        System.out.println(thirdTask(-10));
        fourthTask(4,"Hello!");
    }
    public static boolean firstTask(int a, int b ){
        if (a+b >= 10 && a+b <= 20){
            return true;
        }else {
            return false;
        }
    }
    public static String secondTask(int a){
        if(a>=0){
            return "Число положительное!";
        }else {
            return "Число отрицательное!";
        }
    }
    public static boolean thirdTask(int a){
        if (a>= 0) {
            return false;
        }else {
            return true;
        }
    }
    public static void fourthTask(int a, String text) {
       for(int i=0; i<a; i++){
           System.out.println(text);
       }
    }
}
