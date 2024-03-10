import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int[] expenses;
        int n = 5; // n - количество элементов массива
        int a = 100000; // a - начальное значение случайных чисел
        int b = 200000; // b - конечное значение случайных чисел (не включает)
        expenses = generateRandomArray(n, a, b);
        //System.out.println(Arrays.toString(expenses));
        int sum = 0;
        for (int i: expenses) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        int min = expenses[0]; // Знаем, что массив имеет как минимум 1 элемент
        int max = expenses[0];
        for (int i: expenses) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей. Максимальная сумма трат за месяц составила " + max + " рублей");
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        sum = 0; // Переменные используем из 1 задачи, расчет суммы повторяем для удобного представления
        double average;
        for (int i: expenses) {
            sum += i;
        }
        average = (double) sum / (double) expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
    private static int[] generateRandomArray(int n, int a, int b) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(b - a) + a;
        }
        return arr;
    }
}