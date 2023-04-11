package ru.geekbrains.lesson_2;

import java.util.Scanner;


public class Lesson02 {
    public static void main(String[] args) {
        System.out.println(number());
    }

    // InputMismatchException
 /*
 TASK № 1

Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
    public static float number() { // т.к в задание ошибкой считается текст, ввод целого числа за ошибку не считаем.
        Scanner scanner = new Scanner(System.in);
        Float num = null;
        while (num == null) {
            try {
                System.out.println("Введите дробное число: ");
                //num = scanner.nextFloat();   // Почему-то при таком варианте программа не ждет ввода, а запускает
                // бесконечный цикл
                num = Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка, вы не ввели число. Пожалуйста, повторите, попытку.");
            }
        }
        scanner.close();
        return num;
    }
    /*
    Исправьте код:
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
    */








    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
}

