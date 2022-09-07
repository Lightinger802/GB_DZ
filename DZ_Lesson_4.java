package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class DZ_Lesson_4 {
    private static final int Size = 3;
    public static final int SizeWin = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_Human = 'X';
    public static final char DOT_AI = 'O';

    private static final char[][] MAP = new char[Size][Size];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    public static final String Header_Fist_Symbol = "№";
    public static final String Empty_Symbol = " ";


    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame(){
        initMap();
        printMap();
        playGame();
    }

    private static void printMap(){
        printHead();
        printBody();

    }

    private static void initMap(){
        for (int i = 0; i < Size; i++){
            for (int j = 0; j < Size; j++){
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printHead(){
        System.out.print(Header_Fist_Symbol + Empty_Symbol);
        for (int i = 0; i < Size; i++){
            System.out.print(i + 1 + Empty_Symbol);
        }
        System.out.println();
    }

    private static void printBody(){
        for (int i = 0; i < Size; i++){
            System.out.print(i + 1 + Empty_Symbol);
            for (int j = 0; j < Size; j++){
                System.out.print(MAP[i][j] + Empty_Symbol);
            }
            System.out.println();
        }
    }
    private static void playGame(){
        while (true){
            humanTurn();
            printMap();
            if (checkEnd(DOT_Human)){
                break;
            }
            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)){
                break;
            }
        }
    }

    private static void humanTurn(){
        System.out.println("\nХод Человека");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.println("Введите координату строки от 1 до 3");
            rowNumber = in.nextInt() - 1;

            System.out.println("Введите координату колонки от 1 до 3");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)){
                break;
            }
            System.out.printf("Ошибка! Ячейка с координатами %s:%s уже используется", rowNumber + 1 , columnNumber + 1);
            System.out.println();

        }

        MAP[rowNumber][columnNumber] = DOT_Human;
    }

    private static void aiTurn(){
        System.out.println("\nХод Компьютера");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(Size);
            columnNumber = random.nextInt(Size);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
    }

    public static boolean isCellFree(int rowNumber, int columnNumber){
        return MAP [rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol){
        if (checkWinHorizontal(symbol)){
            if (symbol == DOT_Human){
                System.out.println("Ура Вы победили");
            } else {
                System.out.println("Победил компьютер");
            }
            return true;
        }
        
        if (checkWinVertical(symbol)){
            if (symbol == DOT_Human){
                System.out.println("Ура Вы победили");
            } else {
                System.out.println("Победил компьютер");
            }
            return true;
        }

        if (checkWinDiagonal(symbol)){
            if (symbol == DOT_Human){
                System.out.println("Ура Вы победили");
            } else {
                System.out.println("Победил компьютер");
            }
            return true;
        }

        if (checkDraw()){
            System.out.println("Наступила ничья");
            return true;
        }
        return false;
    }

    private static boolean checkWinHorizontal(char symbol) {
        int checkSymbol;
        for (int i = 0; i < Size; i++) {
            checkSymbol = 0;
            for (int j = 0; j < Size; j++) {
                if (MAP[i][j] == symbol) {
                    checkSymbol++;
                } else checkSymbol = 0;
            }
            if (checkSymbol == SizeWin) {
                return true;
            }
        }
        return false;

    }
    private static boolean checkWinVertical(char symbol) {
        int checkSymbol;
        for (int i = 0; i < Size; i++) {
            checkSymbol = 0;
            for (int j = 0; j < Size; j++) {
                if (MAP[j][i] == symbol) {
                    checkSymbol++;
                } else checkSymbol = 0;
            }
            if (checkSymbol == SizeWin) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWinDiagonal(char symbol){
        int checkSymbol = 0;
        for (int i = 0; i < Size; i++) {
                if (MAP[i][i] == symbol) {
                    checkSymbol++;
                } else checkSymbol = 0;
            }
            if (checkSymbol == SizeWin) {
                return true;
            }
        for (int i = 0; i < Size; i++) {
            if (MAP[Size - 1 - i][i] == symbol) {
                checkSymbol++;
            } else checkSymbol = 0;
        }
        if (checkSymbol == SizeWin) {
            return true;
        }
        return false;
    }

    private static boolean checkDraw(){
        for (char[] chars : MAP){
            for (char symbol : chars){
                if (symbol == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

}
