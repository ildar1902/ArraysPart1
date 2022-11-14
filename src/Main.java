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
    }
}