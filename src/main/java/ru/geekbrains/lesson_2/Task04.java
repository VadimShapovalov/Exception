package ru.geekbrains.lesson_2;
import java.util.Scanner;
/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task04 {

    public static void main(String[] args) {

        System.out.println(message());
    }
    public static String message() {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        while (message.isEmpty()) {
            try {
                System.out.println("Напишите Ваше сообщение: ");
                message = scanner.nextLine();
                if (message.isEmpty()) {
                    throw new EmptyStringException();
                }
            } catch (EmptyStringException e) {
                System.out.println("Пустую строку вводить нельзя. Повторите попытку");
            }
        }
            scanner.close();
            return message;
        }
        static class EmptyStringException extends Exception { // не знаю, это нормально, что класс исключения статический.

//            public EmptyStringException(String message) {
//                super(message);
//            }
        }
    }

