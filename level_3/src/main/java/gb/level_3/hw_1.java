package gb.level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw_1 {
    public static void main(String[] args) {
        //task1task2();

        Box<Orange>oranges = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<Apple>apples = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );
        Box<GoldenApple>goldenAppleBox= new Box<>(
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple()
        );

        System.out.println(goldenAppleBox.getWeight());

        goldenAppleBox.moveTo(apples);



    }
    private static void task1task2(){
        Integer[] ints = new Integer[]{0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ints));
        swap(ints, 3,4);
        System.out.println(Arrays.toString(ints));

        List<Integer>ints2 = new ArrayList<>();
        for (Integer number: ints){
            ints2.add(number);
        }
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
