package ru.gb.girenko.homework3;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
       arrayZeroOne();
       System.out.println();
       System.out.println();
       array100();
       System.out.println();
       System.out.println();
       sixArray();
       System.out.println();
       System.out.println();
       fourthTask();
       System.out.println();
       System.out.print(Arrays.toString(fifthTask(5,25)));
       System.out.println();
       System.out.println();
       sixthTask();
       System.out.println();
       int arr[]={1,2,3,3,2,1,5};
       System.out.print(Arrays.toString(arr));
       System.out.println();
       System.out.println(seventhTask(arr));
    }
    public static void arrayZeroOne() {
        int [] nums = {0,0,0,1,0,1,0,1,0,1,0,1,1};
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
                nums[i]=1;
            }else {
                nums[i]=0;
            }
            System.out.print(nums[i] + ", ");
        }
    }

    public static void array100() {
        int[] arr = new int[100];
        for(int i = 0, j=1; i<arr.length;i++, j++){
            arr[i]=j;
            }
        System.out.print(Arrays.toString(arr));
    }
    public static void sixArray(){
       int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr));
        System.out.println();
       for(int i = 0; i<arr.length; i++){
           if(arr[i]<6){
               arr[i]=arr[i]*2;
           }
       }
        System.out.print(Arrays.toString(arr));
    }
    public static void fourthTask(){
        int[][]x = new int[4][4];

        for(int i = 0; i< x.length;i++){
            for (int j=0, y= x.length-1; j< x[i].length; j++, y--){
                if(i==j || i==y){
                    x[i][j]=1;
                }
                System.out.print(x[i][j]+", ");
            }
            System.out.println();
        }
    }
    public static int[] fifthTask(int len, int initialValue){
        int arr[] = new int[len];
        for (int i=0;i< arr.length;i++){
            arr[i]=initialValue;
        }
        return arr;
    }
    public static void sixthTask (){
        int [] a = new int[10];
        for(int i=0; i< a.length;i++){
         a[i]=new Random().nextInt(100);
        }
        System.out.print(Arrays.toString(a));
        System.out.println();
        int max =0, min=0;
        for(int i=0;i<a.length;i++){
            if (a[i] > a[max]){
                max=i;
            }else if(a[i]<a[min]){
                min=i;
            }
        }
        System.out.println("Число максимальное = "+a[max]);
        System.out.println("Число минимальное = "+a[min]);
    }
    public static boolean seventhTask(int arr[]){
        int left = 0, right = 0;
        for (int i = 0; i< arr.length/2; i++){
            left=left+arr[i];
        }
        for(int i = arr.length/2; i<arr.length; i++){
            right=right+arr[i];
        }
        boolean reply = left == right;
        return reply;
    }
}
