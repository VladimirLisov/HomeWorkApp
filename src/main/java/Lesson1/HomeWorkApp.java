package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple\n");
    }
    private static void checkSumSign() {
        int a = 3;
        int b = -6;
        int i = a+b;
        if ( i>= 0 ) {
            System.out.println("Сумма положительная\n");
        }
        else {
            System.out.println("Сумма отрицательная\n");
        }
    }
    private static void printColor() {
        int value;
        value = 999;
        if (value <= 0) {
            System.out.println("Красный\n");
        }
        if (value > 0 & value <= 70) {
            System.out.println("Желтый\n");
        }
        if (value > 99) {
            System.out.println("Зеленый\n");
        }
    }
    private static void compareNumbers() {
        int a = 111;
        int b = 11;
        if (a >= b){
            System.out.println("a >= b\n");
        }
        if (a < b){
            System.out.println("a < b\n");
        }
    }
}


