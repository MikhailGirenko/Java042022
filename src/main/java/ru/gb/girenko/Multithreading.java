package ru.gb.girenko;

public class Multithreading {

    static int size = 10000000;
    static int b = size/2;
    static float [] arr = new float[size];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1.0f;
        }
        firstMethod();
        secondMethod();
    }

    private static void firstMethod(){

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(float) (arr[i]*Math.sin(0.2f+i/5)*Math.cos(0.4f+i/2));
        }
        System.out.println( "Первый метод: " + (System.currentTimeMillis()-a)+" ms.");
    }




    private static void secondMethod(){
        float [] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1.0f;
        }
        long a = System.currentTimeMillis();
        float[] arr1 = new float[b];
        float[] arr2 = new float[b];
        System.arraycopy(arr,0,arr1,0,size/2);
        System.arraycopy(arr,b,arr2,0,b);
        MyThread t1 = new MyThread(arr1);
        MyThread t2 = new MyThread(arr2);
        t1.start();
        t2.start();

    }
}
