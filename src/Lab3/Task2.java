package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    static final Scanner sc = new Scanner(System.in);

    static int[][] inputMatrix() {
        System.out.print("\nВведите кол-во строк: ");
        int i = sc.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int j = sc.nextInt();
        int[][] mat = new int[i][j];
        System.out.println("\nВведите значения матрицы:");
        for (int a = 0; a < i; a++) {
            System.out.printf("Введите %d-й ряд: ", a + 1);
            for (int b = 0; b < j; b++) {
                mat[a][b] = sc.nextInt();
            }
        }
        System.out.println("\nВаша матрица:");
        for (int a = 0; a < i; a++) {
            System.out.println(Arrays.toString(mat[a]));
        }
        return mat;
    }

    static void nonZeroRows(int[][] mat) {
        int countRow = 0;
        int countEl = 0;
        for (int a = 0; a < mat.length; a++ ) {
            for (int b = 0; b < mat[a].length; b++) {
                if (mat[a][b] == 0) {   //если в рядке есть 0
                    countEl++;          //записываем в счетчик нулей
                }
            }
            if (countEl == 0) {         //если нулей нет
                countRow++;             //добавляем 1 в счетчик строк без нулей
            }
            countEl = 0;                //обнуляем счетчик нулей
        }
        if (countRow == 0) {
            System.out.println("\nСтрок без нулевых элементов не встречается.");
        } else {
            System.out.printf("\nКоличество строк без нулевых эл-ов: %d\n", countRow);
        }
    }

    static void frequentMax(int[][] mat) {
        int max = mat[0][0], temp1 = mat[0][0], temp2;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                temp2 = mat[i][j];
                mat[i][j] = 0;
                for (int k = 0; k < mat.length; k++) {
                    for (int f = 0; f < mat[i].length; f++)
                        if (temp2 == mat[k][f])
                            max = mat[k][f];
                    if (temp1 > max)
                        max = temp1;
                }
                temp1 = max;
                mat[i][j] = temp2;
            }
        }
        System.out.printf("\nМаксимальное число, встречающееся больше 1 раза: %d", max);
    }
}

//Вариант 1 (зад.2)
//        Дана целочисленная прямоугольная матрица. Определить:
//        1) количество строк, не содержащих ни одного нулевого элемента;
//        2) максимальное из чисел, встречающихся в заданной матрице более одного раза.