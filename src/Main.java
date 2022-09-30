import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner console = new Scanner(System.in);
    private final static String delimiter = "=================================";

    public static void main(String[] args) {

        dz0();
        System.out.println(delimiter);

        dz1();
        System.out.println(delimiter);

        dz2();
        System.out.println(delimiter);

        dz3();
        System.out.println(delimiter);

        dz4();
        System.out.println(delimiter);

        dz5();
        System.out.println("\n" + delimiter);

        dz6();
        System.out.println(delimiter);

        dz7();
        System.out.println(delimiter);

        console.close();
    }

        private static void dz7() {

        System.out.println("7.Реализуйте алгоритм сортировки пузырьком.");

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

        private static void dz6() {

        System.out.println("""
                6. Создайте массив строк. Заполните его произвольными именами
                людей.
                Отсортируйте массив.
                Результат выведите на консоль.""");

        String[] names = {"Святослав", "Ольга", "Мария", "Денис", "Александр", "Валерия"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }

        private static void dz5() {

        System.out.println("""
                5. Создайте массив и заполните массив.
                Выведите массив на экран в строку.
                Замените каждый элемент с нечётным индексом на ноль.
                Снова выведете массив на экран на отдельной строке.""");

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

        private static void dz4() {

        System.out.println("""
                4. Создайте массив из n случайных целых чисел и выведите его на экран.
                Размер массива пусть задается с консоли и размер массива может быть
                больше 5 и меньше или равно 10.
                Если n не удовлетворяет условию - выведите сообщение об этом.
                Если пользователь ввёл не подходящее число, то программа должна
                просить пользователя повторить ввод.
                Создайте второй массив только из чётных элементов первого массива,
                если они там есть, и вывести его на экран.""");

        while (!console.hasNextInt()) {
            System.out.println("Пожалуйства, введите верное значение");
            console.next();
        }
        int n = console.nextInt();

        while (n <= 5 || n > 10) {
            System.out.println("Введите значение больше 5, но меньше или равно 10");
            while (!console.hasNextInt()) {
                System.out.println("Пожалуйства, введите верное значение");
                console.next();
            }
            n = console.nextInt();
            if (n > 5 && n <= 10) {
                break;
            }
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int[] temp = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                temp[j] = array[i];
                j++;
            }
        }
        array = new int[j];

        if (array.length > 0) {
            System.arraycopy(temp, 0, array, 0, array.length);
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Все числа в массиве - нечётные");
        }

    }

        private static void dz3 () {

            System.out.println("""
                    3. Создайте 2 массива из 5 чисел.
                    Выведите массивы на консоль в двух отдельных строках.
                    Посчитайте среднее арифметическое элементов каждого массива и
                    сообщите, для какого из массивов это значение оказалось больше (либо
                    сообщите, что их средние арифметические равны).""");

            int[] array1 = new int[5];
            int[] array2 = new int[5];

            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < array1.length; i++) {
                array1[i] = (int) (Math.random() * 10);
                array2[i] = (int) (Math.random() * 10);

                sum1 += array1[i];
                sum2 += array2[i];
            }

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

            double average1 = (double) sum1 / array1.length;
            double average2 = (double) sum2 / array2.length;

            System.out.println("Average1 = " + average1);
            System.out.println("Average2 = " + average2);

            if (average1 > average2) {
                System.out.println("average1 > average2");
            } else if (average2 > average1) {
                System.out.println("average2 > average1");
            } else {
                System.out.println("average1 = average2");
            }

        }

        private static void dz2 () {

            System.out.println("""
                    2. Создайте и заполните массив случайным числами и выведете
                    максимальное, минимальное и среднее значение.
                    Для генерации случайного числа используйте метод Math.random().
                    Пусть будет возможность создавать массив произвольного размера.
                    Пусть размер массива вводится с консоли.""");

            while (!console.hasNextInt()) {
                System.out.println("Пожалуйства, введите верное значение");
                console.next();
            }

            int size = console.nextInt();

            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) ((Math.random() * 100));
            }

            int min = 100;
            int max = 0;
            int sum = 0;

            for (int element : array) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
                sum += element;
            }

            System.out.println(Arrays.toString(array));

            Arrays.sort(array);

            int midian = array[array.length / 2];

            System.out.printf("Max = %d\nMin = %d\nAverage = %d\n", max, min, midian);

        }

        private static void dz1 () {

            System.out.println("""
                    1. Создайте массив целых чисел. Удалите все вхождения заданного
                    числа из массива.
                    Пусть число задается с консоли (класс Scanner). Если такого числа нет -
                    выведите сообщения об этом.
                    В результате должен быть новый массив без указанного числа.""");

            int[] array = new int[5];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }

            System.out.println(Arrays.toString(array) + "\nДлина: " + array.length);

            while (!console.hasNextInt()) {
                System.out.println("Пожалуйства, введите верное значение");
                console.next();
            }

            int number = console.nextInt();

            int[] temp = new int[array.length];
            int j = 0;

            for (int element : array) {
                if (element != number) {
                    temp[j] = element;
                    j++;
                }
            }
            array = new int[j];

            if (j == temp.length) {
                System.out.println("Заданного числа в массиве нет");
            } else {
                System.arraycopy(temp, 0, array, 0, array.length);
                System.out.println(Arrays.toString(array) + "\nДлина: " + array.length);
            }


        }

        private static void dz0 () {

            System.out.println("""
                    0. Создайте массив целых чисел. Напишете программу, которая выводит
                    сообщение о том, входит ли заданное число в массив или нет.
                    Пусть число для поиска задается с консоли (класс Scanner).""");

            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(array));

            while (!console.hasNextInt()) {
                System.out.println("Пожалуйства, введите верное значение");
                console.next();
            }

            int number = console.nextInt();

            Arrays.sort(array);

            if (Arrays.binarySearch(array, number) > -1) {
                System.out.println("Элемент найден");
            } else {
                System.out.println("Элемент не найден");
            }
        }
    }