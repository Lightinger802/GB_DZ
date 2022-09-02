package Lesson_3;

import java.util.Arrays;

public class DZ_Lesson_3 {
    public static void main (String[] args){
        Array_0_1();
        Array_100_Length();
        Array_Multiple();
        Array_Diagonal();
        Array_Method(5, 1);
        Array_Min_Max();
        int Array_0[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Array_Match(Array_0));
        int Array_00[] = {4, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 10};
        ArrayShift(Array_00, 2);
    }

    public static void Array_0_1(){
        int[] array_1 = {1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < array_1.length; i++){
            if (array_1[i] == 0) {
                array_1[i] = 1;
            } else array_1[i] = 0;
        }
        System.out.println(Arrays.toString(array_1));
    }

    public static void Array_100_Length(){
        int[] array_2 = new int[100];
        for(int i = 0; i < array_2.length; i++) {
            array_2[i] = i + 1;
        }
        System.out.println(Arrays.toString(array_2));
    }

    public  static void Array_Multiple(){
        int[] array_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array_3.length; i++){
            if (array_3[i] < 6) array_3[i] = array_3[i] * 2;
        }
        System.out.println(Arrays.toString(array_3));
    }

    public static void Array_Diagonal(){
        int[][] array_4 = new int[5][5];
        for(int i = 0; i < array_4.length; i++){
            for(int j = 0; j < array_4[i].length; j++){
                if (i == j) array_4[i][j] = 1;
                if (j == (array_4[i].length - (i + 1))) array_4[i][j] = 1;
            }
        }
    }

    public static int[] Array_Method(int len, int initialValue){
        int[] array_5 = new int [len];
        for (int i = 0; i < array_5.length; i++){
        array_5[i] = initialValue;
        }
        return array_5;
    }

    public static void Array_Min_Max(){
        int[] array_6 = {2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int a = array_6[0];
        int b = array_6[0];
        for (int i = 0; i < array_6.length; i++){
            if (array_6[i] > a) a = array_6[i];
            if (array_6[i] < b) b = array_6[i];
        }
        System.out.println("Максисмальное значение массива " + a);
        System.out.println("Минимальное значение массива " + b);
    }

    public static boolean Array_Match(int A[]){
        int a = 0;
        int b = 0;
        for (int i = 0; i < A.length; i++){
            if (i < A.length / 2) {
                a = a + A[i];
            } else b = b + A[i];
        }
        if (a == b) return true;
        else return false;
    }

    public static void ArrayShift (int A[], int n){
        int shift_element = 0;
        if (n > 0) {
        for (int i = 0; i < n; i++){
            shift_element = A[A.length - 1];
            for (int j = A.length - 2; j >= 0; j--) {
                A[j + 1] = A[j];
            }
                A[0] = shift_element;
            }
        } else if (n < 0) {
            int n1 = n * (-1);
            for (int i = 0; i < n1; i++) {
                    shift_element = A[0];
                    for (int j = 0; j < A.length - 1; j++) {
                        A[j] = A[j + 1];
                    }
                    A[A.length - 1] = shift_element;
                }
            }
        System.out.println(Arrays.toString(A));
        }

}