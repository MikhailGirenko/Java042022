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
       diagonalsX();
       System.out.println();
       System.out.print(Arrays.toString(lenIValue(5,25)));
       System.out.println();
       System.out.println();
       minMax();
       System.out.println();
       int[] arr ={1,2,3,5,4,8,7,1,9,6};
       System.out.print(Arrays.toString(arr));
       System.out.println();
       System.out.println(equalParts(arr));
       System.out.println();
       int[] arr2 ={1,2,3,5,4,8,7,1,9,6};
       System.out.println(Arrays.toString(arr2));
       cycleOffset(arr2,3);

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
    public static void diagonalsX(){
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
    public static int[] lenIValue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i=0;i< arr.length;i++){
            arr[i]=initialValue;
        }
        return arr;
    }
    public static void minMax (){
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
    public static boolean equalParts(int[] arr){
        int left=0;
        for (int i=0;i<arr.length;i++){
            int right=0;
            left=left+arr[i];
            for(int j=i+1;j< arr.length;j++){
                right=right+arr[j];
            }
            if(left==right){
                return true;
            }
        }
        return false;
    }
    public static void cycleOffset(int[] arr2,int n){
            if(n> arr2.length) {
                n=Math.abs(n%arr2.length);
            }else {
            }
            if(n>0){
                for (int i = 0; i < n; i++) {
                    int memory = arr2[0];
                    arr2[0]=arr2[arr2.length-1];
                    for (int j = 1; j < arr2.length-1 ; j++) {
                        arr2[arr2.length-j]=arr2[arr2.length-j-1];
                    }
                    arr2[1]=memory;
                }
            }else if (n<0){
                for (int i = 0; i < n; i--) {
                    int memory = arr2[arr2.length-1];
                    arr2[arr2.length-1]=arr2[0];
                    for (int j = 1; j < arr2.length-1; j++) {
                        arr2[j-1] = arr2[j];
                    }
                    arr2[arr2.length-2]=memory;
                }
            }
        System.out.print(Arrays.toString(arr2));
    }
}
