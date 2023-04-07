package ru.geekbrains.lesson_1;

import java.util.Random;

public class Program {

    public static void main(String[] args) {

        int[] array1 = creatArray();
        int[] array2 = creatArray();
        System.out.println("Первый массив:");
        printArray(array1);
        System.out.println();
        System.out.println("Второй массив:");
        printArray(array2);
        System.out.println();
        getSubtractionArrays(array1, array2);
        System.out.println();
        getDivisionArrays(array1, array2);
    }
/*
Вспомогательный метод для создания случайного массива с переменным размером.
 */
    public static int[] creatArray() {
        Random random = new Random();
        int size = 8;
        if (random.nextInt(2) == 1) {
            size = random.nextInt(2) + 7;
        }
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(1, 10);
        }
        return newArray;
    }
/*
Вспомонательный метод для печати массива.
 */
    public static void printArray(int[] array) {
        for (int num: array) {
            System.out.printf("%d\t",num);
        }
        System.out.println();
    }

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
    public static int [] getSubtractionArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {    // проверяем массивы на  null.
            System.out.println("Один или оба массива отсутствуют");
            return null;
        } else if (arr1.length != arr2.length) {    // проверяем, равны ли размеры массивов
            System.out.println("Длина массивов должна быть одинаковой");
            System.out.printf("Длинна первого массива: %d. Длина второго массива: %d.\n", arr1.length, arr2.length);
            return null;
        } else {
            int[] res = new int[arr1.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr1[i] - arr2[i];
                System.out.printf("%d\t", res[i]);
            }
            System.out.println();
            return res;
        }
    }
/*
* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */


    public static float[] getDivisionArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {    // проверяем массивы на  null.
            throw new RuntimeException("Один или оба массива отсутствуют"); // выбрасываем исключение.

        } else if (arr1.length != arr2.length) {    // проверяем, равны ли размеры массивов
            throw new RuntimeException("Длина массивов должна быть одинаковой");
        } else {
            float[] res = new float[arr1.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = arr1[i] / (float)arr2[i]; // для нормального деления превращаем в float.
                System.out.printf("%.2f\t", res[i]);
            }
            System.out.println();
            return res;
        }
    }

}
