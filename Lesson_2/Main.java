package Lesson_2;

public class Main {

    public static void main(String[] args) {
        String[][] a = {{"3", "2", "4", "9"},
                        {"1", "1", "1", "1"},
                        {"3", "3", "3", "3"},
                        {"2", "2", "2", "2"}};
        try {
            System.out.println("Сумма равна " + dualArray(a));
        } catch (MyArrayDataException | MyArraySizeException ex){
            ex.printStackTrace();
        }
    }

    public static int dualArray(String[][] a) throws MyArraySizeException{
        if (a.length != 4) throw new MyArraySizeException("Неверное количество строк");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != 4) throw new MyArraySizeException(String.format("Неверное количетсво столбцов в %s строке", i + 1));
            for (int j = 0; j < a.length; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    } 
    static class MyArraySizeException extends Exception{
        MyArraySizeException(String alert){
            super(alert);
        }
    }

     static class MyArrayDataException extends NumberFormatException{
        MyArrayDataException(int row, int col) {
            super(String.format("Не корректные данные в строке %d , столбце %d", row + 1, col + 1));
        }
    }
}
