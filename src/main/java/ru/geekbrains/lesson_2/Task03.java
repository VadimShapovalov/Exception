package ru.geekbrains.lesson_2;

/*
Задание 3
Исправьте код:

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 */

public class Task03 {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9; // здесь метод выбросит исключение, так как будет выход за пределы массива

        } catch (NullPointerException ex) { // если в printSum поместить null, то выбросит это исключение
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // поставил в конец, так как поймает всё (родитель всех исключений).
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b)  { // throws FileNotFoundException - здесь был вот такой проброс
        System.out.println(a + b);                       // исключения наверх, но я не понимаю при чем тут отсутствие файла.
                                                        // Поэтому просто убрал.
    }

}
