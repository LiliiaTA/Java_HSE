package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] animals=
                {"Крыса", "Корова", "Тигр", "Заяц", "Дракон",
                        "Змея", "Лошадь", "Овца", "Обезьяна", "Петух",
                        "Собака", "Свинья"};

        String[] colors = {"зеленый", "красный", "желтый",
                "белый", "синий"};

        int n = input("n=");
        System.out.println(animals[(n - 4) % 12]);
        System.out.println(colors[(n - 4) % 10 / 2]);
    }

    /**
     * Заполнение массива случайными числами
     * @param array Массив для заполнения
     */
    private static void generateRandomArray(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(100);
    }

    static void printArray(int[] A){
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(A[i]+", ");
//        }
        System.out.print(Arrays.toString(A));
    }

    static int input(String prompt){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt())
                return sc.nextInt();

            System.out.println("Ошибка. Повторите ввод.");
            sc.nextLine();
        }
    }

    static double inputDouble(String prompt){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt())
                return sc.nextInt();

            System.out.println("Ошибка. Повторите ввод.");
            sc.nextLine();
        }
    }

}
