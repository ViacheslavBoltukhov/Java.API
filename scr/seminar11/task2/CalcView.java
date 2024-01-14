package scr.seminar11.task2;

import java.util.Scanner;

public class CalcView {
    private Scanner scanner;

    public CalcView() {
        scanner = new Scanner(System.in);
    }
    public String getUserChois(){
        System.out.println("Ваш выбор");
        return scanner.next();
    }

    public double getUserInputNumber1(){
        System.out.println("Введите первое число: ");
        return scanner.nextDouble();
    }
    public double getUserInputNumber2(){
        System.out.println("Введите первое число: ");
        return scanner.nextDouble();
    }
}
