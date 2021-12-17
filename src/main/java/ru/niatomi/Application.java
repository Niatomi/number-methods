package ru.niatomi;

import java.util.Scanner;

public class Application
{
    /**
     * Метод для получения суммы цифр числа
     * @param num число из которого берутся цифры
     * @return sum сумма цифр
     */
    public static int sumOfPart(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    /**
     * Метод для определения числа на счастливость
     * @param num проверяемое число
     * @return true - число счасливое
     * @return false - несчастливое или не 6-ти значное
     */
    public static boolean isHappy(int num) {
        if ((100000 <= num) && (999999 >= num) && (sumOfPart(num / 1000) == sumOfPart(num % 1000))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Сумма всех счастливых чисел
     * @return возврат суммы всех 6-ти значных чисел
     */
    public static int sumOfHappyNum() {
        int sum = 0;
        for (int i = 100000; i < 1000000; i++) {
            if (isHappy(i)) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Проверяет число на простату
     * @param num проверяемое число
     * @return
     */
    public static boolean isSimple(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Вычисление суммы всех простых чисел
     * @return
     */
    public static int sumOfSimple() {
        int sum = 0;
        for (int i = 1000; i <= 2000; i++) {
            if (isSimple(i)) {
                sum += i;
            }
        }
        return sum;

    }
    /**
     * Метод с которого начинается программа.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Задание 1
        System.out.print("Число для определения на счастливость: ");
        int num = sc.nextInt();
        System.out.println(isHappy(num));

        //Задание 2
        System.out.println("Cумма всех шестизначных счасливых чисел: " + sumOfHappyNum());

        //Задание 3
        System.out.print("Определение простоты числа: ");
        num = sc.nextInt();
        System.out.println(isSimple(num));

        //Задание 4
        System.out.print("Cумма всех простых чисел: " + sumOfSimple());

    }
}
