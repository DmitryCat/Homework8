public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] weight = new int[]{1, 2, 3};
        float[] flaction = new float[]{1.57f, 7.654f, 9.986f};
        int[] arr = {1, 2, 3, 4, 5};
        // Задание 2
        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.print(weight[weight.length - 1]);
        System.out.println();
        for (int i = 0; i < flaction.length - 1; i++) {
            System.out.print(flaction[i] + ", ");
        }
        System.out.print(flaction[flaction.length - 1]);
        System.out.println();
        // задание 3
        for (int i = 2; i > 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[weight.length - 3]);
        for (int i = 2; i > 0; i--) {
            System.out.print(flaction[i] + ", ");
        }
        System.out.println(flaction[flaction.length - 3]);
        // задание 4
        for (int i = 0; i < 4; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
                System.out.print(weight[i] + " ");
            }
        }
    }
}
