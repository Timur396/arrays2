
public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        System.out.println("Задача №1");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма затрат за месяц составила  рублей " + sum);

        System.out.println("Задача №2");
        int min = array[0];
        int max = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        System.out.println("Задача №3");
        int ammountOfExpenses = 0;
        for (int element : array) {
            ammountOfExpenses = ammountOfExpenses + element;
        }
        double average = (double) ammountOfExpenses / 30;
        System.out.println(average);

        System.out.println("Задача№4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i>=0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}



