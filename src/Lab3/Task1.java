package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //для считывания с клавиатуры
    static final Scanner sc = new Scanner(System.in);

    static double[] inputArray() {
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        System.out.printf("Введите %d значений массива:\n", size);
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println("Ваш массив:");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static void sumOfNegative(double[] arr) {
        double sum = 0;
        for (double n : arr) {
            if (n < 0) sum += n;
        }
        if (sum == 0) {
            System.out.println("Отрицательных чисел нет");
            return;
        }
        System.out.printf("Сумма отрицательных чисел равна %.2f\n", sum);
    }

    static void getProduct(double[] arr) {
        double min = arr[0];
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("\nМаксимальный элемент: %.2f\n", max);
        System.out.printf("Минимальный элемент: %.2f\n", min);
        double prod = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == max && arr[i + 1] == min) {
                prod *= arr[i];
            }
        }
        if (prod == 1) { //если произведение не менялось
            System.out.println("Чисел между макс. и мин. элементом нет");
            return;
        }
        System.out.printf("\nПроизведение чисел между макс. и мин. элементом: %.2f", prod);
    }
}

// Вариант 1 (зад.1)
//         В одномерном массиве, состоящем из n вещественных элементов, вычислить:
//         1) сумму отрицательных элементов массива;
//         2) произведение элементов массива, расположенных между максимальным и минимальным элементами.