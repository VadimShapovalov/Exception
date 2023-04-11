package ru.geekbrains.lesson_2;

import java.util.Scanner;

/*
 TASK № 1

Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task01 {
    public static void main(String[] args) {
        System.out.println(number());
    }
     public static float number() { // т.к в задание ошибкой считается текст, ввод целого числа за ошибку не считаем.
        Scanner scanner = new Scanner(System.in);
        Float num = null;
        while (num == null) {
            try {
                System.out.println("Введите дробное число: ");
                //num = scanner.nextFloat();   // Почему-то при использовании nextFloat программа не ждет ввода числа,
                // а запускает бесконечный цикл. Лечится если использовать nextLine.
                num = Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка, вы не ввели число. Пожалуйста, повторите, попытку.");
            }
        }
        scanner.close();
        return num;
    }


}

