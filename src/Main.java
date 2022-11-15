public class Main {
    public static void main(String[] args) {

        System.out.println("    Массивы, часть 1.");
        System.out.println();
        System.out.println("    Черновик");
        System.out.println();
        int[] weights = {85, 84, 86, 83, 82, 81, 83, 80, 85, 86, 83, 0};
        int novemberWeight = weights[10];
        System.out.println("Вес в ноябре равен " + novemberWeight + " кг");
        System.out.println(weights[10]);
        System.out.println(weights[5]);
        int november = 10;
        System.out.println(weights[november]);

        // Массивы чать 1. ДЗ.
        //Задание 1.
        System.out.println();
        System.out.println("    Задание 1");
        System.out.println();

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {3, 2, 1};

        //Задание 2.
        System.out.println();
        System.out.println("    Задание 2");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        //Задание 3.
        System.out.println();
        System.out.println("    Задание 3");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        //Задание 4.
        System.out.println();
        System.out.println("    Задание 4");
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 > 0) {
                arr1[i] += 1;
            }
            System.out.println(arr1[i]);
        }
    }
}
