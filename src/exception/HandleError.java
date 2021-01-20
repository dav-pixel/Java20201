package exception;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за приделами массива: " + e);
        }
        System.out.println("После блоков оператора try/catch.");


    }
}

