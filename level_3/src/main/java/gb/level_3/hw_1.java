package gb.level_3;

import java.util.Arrays;

public class hw_1 {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ints));
        swap(ints, 3,4);
        System.out.println(Arrays.toString(ints));


    }

    public static <T> void swap(T[] array, int first, int second){
        if(first<0 || second<0){
            throw  new IllegalArgumentException();
        }
        if(array == null){
            throw new IllegalArgumentException();
        }
        int length = array.length;
        if(first>length || second> array.length){
            throw new IllegalArgumentException();
        }

        T tmp =array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
