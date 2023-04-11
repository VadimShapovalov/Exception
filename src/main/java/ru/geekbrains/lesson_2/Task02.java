package ru.geekbrains.lesson_2;

import java.util.Random;

/*
    Исправьте код:
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

 Не совсем понял задачу, тут только часть метода, который всегда будет выбрасывать исключение,
 так как на ноль делить нельзя. Еще есть ссылка на несуществующий массив. Решил написать метод, который будет
 выбрасывать два рандомных исключения: 1) деление на ноль 2) выход за пределы массива.

 */
public class Task02 {

    public static void main(String[] args) {
        division();
    }
     public static void division() {
         int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,};
         Random random = new Random();
         try {
             int devider = random.nextInt(4); // создаем делитель, который с вероятностью 25% будет "ноль".
             int deviation = random.nextInt(2); // создаем отклонение, которое в 50% будет давать выход за пределы массива.
             double catchedRes1 = intArray[8 + deviation] / devider;
             System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
             System.out.println("На ноль делить нельзя.");
         } catch (ArrayIndexOutOfBoundsException ex) {
             System.out.printf("Вы вышли за пределы массива. Размер массива %d.", intArray.length);
         }
     }

}
