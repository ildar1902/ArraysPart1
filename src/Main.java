public class Main {
    public static void main(String[] args) {

        System.out.println("    Массивы, часть 1.");
        System.out.println();
        System.out.println("    Черновик");
        System.out.println();
        int [] weights = {85, 84, 86, 83, 82, 81, 83, 80, 85, 86, 83, 0};
        weights [10] = 83;
        int novemberWeight = weights[10];
        System.out.println("Вес в ноябре равен " + novemberWeight + " кг");
        System.out.println(weights[10]);
        System.out.println(weights[5]);
        int november = 10;
        System.out.println(weights[november]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
                              }

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
        int [] arr3 = {3, 2, 1};

        //Задание 2.
        System.out.println();
        System.out.println("    Задание 2");
        System.out.println();
        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
        System.out.println(arr3[0] + ", " + arr3[1] + ", " + arr3[2]);

        //Задание 3.
        System.out.println();
        System.out.println("    Задание 3");
        System.out.println();
        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0]);
        System.out.println(arr2[2] + ", " + arr2[1] + ", " + arr2[0]);
        System.out.println(arr3[2] + ", " + arr3[1] + ", " + arr3[0]);


    }
}