package Lab3;

public class Lab3 {
    public static void main(String[] args) {
        double[] task1 = Task1.inputArray();
        Task1.sumOfNegative(task1);
        Task1.getProduct(task1);

        int[][] task2 = Task2.inputMatrix();
        Task2.nonZeroRows(task2);
        Task2.frequentMax(task2);
    }
}