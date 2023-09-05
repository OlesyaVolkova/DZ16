import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Массив: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        System.out.print("Введите количество сдвигов: ");
        int k = kb.nextInt();
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Сдвиг влево: ");
        for (int a = 0; a < k; a++) {
            int left = arr[0];
            for (int b = 0; b < arr.length - 1; b++)
                arr[b] = arr[b + 1];
            arr[arr.length - 1] = left;
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Сдвиг вправо: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < k; i++) {
            int right = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = right;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Сортировка массива в порядке возрастания");
        System.out.println("Массив: [8, 9, 125, 2, 1, 80, 10]");
        int[] array = {8, 9, 125, 2, 1, 80, 10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}