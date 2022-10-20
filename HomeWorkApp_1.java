package homework_1;

public class HomeWorkApp_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int varA = -6;
        int varB = 5;
        int sumSign = varA + varB;

        if (sumSign >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sumSign < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 105;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = -7;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
