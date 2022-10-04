package Lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] intArr = new Integer[2];

        intArr[0] = 1;
        intArr[1] = 2;

        swap(intArr, 0, 1);
        System.out.println(Arrays.deepToString(intArr));

        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);
    }

    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
