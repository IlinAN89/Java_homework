package Java_homework.Java_homework;

public class HomeWorkApp_2 {
    public static void main(String[] args) {
        System.out.println(sumResult(5, 16));
        System.out.println("********************");
        System.out.println(whatNumber(-1));
        System.out.println("********************");
        System.out.println(positiveNumber(7));
        System.out.println("********************");
        System.out.println(printQuantity("Изучаем Java", 2));
        System.out.println("********************");
        System.out.println(isleapYear(2024));
        System.out.println("********************");
    }

    private static boolean isleapYear(int year) {
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

    private static String printQuantity(String text, int A) {
        for (int i = 1; i < A; i++) {
            System.out.println(text);
        } return text;
    }

    private static String positiveNumber(int A) {
        if (A >= 0) {
            return "true";
        } else {
            return "false";
        }
    }

    private static String whatNumber(int A) {
        if (A >= 0) {
            return "положительное";
        } else {
            return "отрицательное";
        }
    }

    private static String sumResult(int A, int B) {
        int sum = A + B;
        if (sum >= 10 && sum <=20) {
            return "true";
        } else {
            return "false";
        }
    }

}
