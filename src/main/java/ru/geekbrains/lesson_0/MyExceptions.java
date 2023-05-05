package ru.geekbrains.lesson_3;

public abstract class MyExceptions extends Exception{

}
class CorrectDataException extends RuntimeException {
    public CorrectDataException(String message) {
        super(message);
    }
}

class WrongAmountOfData extends MyExceptions {

}
