package Java_homework.Java_homework;

public class HomeWorkApp_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        getArray1(array1);
        print();
        int[] array2 = new int[100];
        getArray2(array2);
        print();
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        getArray3(array3);
        print();
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        getArray4(array4);
        print();
        getArray5(5, 3);
        print();
        int[] array6 = {2, 10, 11, 5, 1};
        getArray6(array6);
        print();
    }


    private static void print() {
        System.out.println();
        System.out.println("***************************************");
    }

    private static void getArray1(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                System.out.print(array1[i] - 1 + " | ");
            } else
                System.out.print(array1[i] + 1 + " | ");
        }
    }

    private static void getArray2(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            System.out.print(array2[i] + " | " );
        }
    }

    private static void getArray3(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                System.out.print(array3[i] * 2 + " | ");
            } else
                System.out.print(array3[i] + " | ");
        }
    }

    private static void getArray4(int[][] array4) {
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                } System.out.print(array4[i][j] + " | ");
            } System.out.println();
        }
    }

    private static void getArray5(int len, int initialValue) {
        int[] array5 = new int[len];
        for (int i = 0; i < len; i++) {
            array5[i] = initialValue;
            System.out.print("[" + i + "]" + array5[i] + " ");
        }
    }

    private static void getArray6(int[] array6) {
        int max = array6[0];
        int min = array6[0];
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > max) {
                max = array6[i];
            }
        }
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] < min) {
                min = array6[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
