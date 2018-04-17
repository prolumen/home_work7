package home_work7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExeption{
    private int a, b, c;
    MyExeption() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите число для деления:");
            a = scan.nextInt();
            System.out.println("Введите число делитель:");
            b = scan.nextInt();
            System.out.println("Тест на корректный ввод успешен");
//            if (b==0) throw new NullPointerException("b = null");
//            System.out.println("test");
            System.out.println(c = a/b);
            System.out.println("Делитель не равен нулю");

        } catch (InputMismatchException e){
            System.out.println("Ошибка, не корректный ввод");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("Ошибка деления на ноль");
        } finally {
            System.out.println("ПРограмма завершена");

        }
    }

    public static void main(String[] args) {
        MyExeption me = new MyExeption();
    }
}
