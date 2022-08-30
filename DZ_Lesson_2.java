package Lesson_2;

public class DZ_Lesson_2 {
    public static void main (String[] args){
        System.out.println(boolean_2_int(10, 10));
        Positive_Negative (-10);
        System.out.println(Positive_Negative_boolean(-10));
        PrintWord ("Слово", 3);
        System.out.println(Year(500));
    }

    public static boolean boolean_2_int (int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20)
            return true;
        else
            return false;
    }

    public static void Positive_Negative (int a){
        if (a <= 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean Positive_Negative_boolean (int a){
        if (a <= 0) {
            return true;
        } else
            return false;
    }

    public static void PrintWord (String word, int a){
        for (int i = 0; i < a; i++){
            System.out.println(word);
        }
    }

    public static boolean Year(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
