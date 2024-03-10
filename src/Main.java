public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int[] expenses = new int[5];
        expenses[0] = 100;
        expenses[1] = 200;
        expenses[2] = 300;
        expenses[3] = 400;
        expenses[4] = 500;
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
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
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
}