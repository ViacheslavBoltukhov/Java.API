package src.homeWork13;

import java.util.Scanner;

public class ViewCalculator {
    private final Scanner iScanner = new Scanner(System.in);
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            boolean flag = true;
            Complex firstArg = promptComplex("Введите пеpвый аpгумент: ");
            Calculable calculator = calculableFactory.create(firstArg);
            String cmd = prompt("Введите команду (+, -, *, /): ");
            switch (cmd) {
                case "+": {
                    Complex arg = promptComplex("Введите втоpой аpгумент: ");
                    calculator.sum(arg);
                    break;
                }
                case "-": {
                    Complex arg = promptComplex("Введите втоpой аpгумент: ");
                    calculator.minus(arg);
                    break;
                }
                case "*": {
                    Complex arg = promptComplex("Введите втоpой аpгумент: ");
                    calculator.multi(arg);
                    break;
                }
                case "/": {
                    Complex arg = promptComplex("Введите втоpой аpгумент: ");
                    calculator.div(arg);
                    break;
                }
                default:
                    System.out.println("Некорректный ввод");
                    flag = false;
                    break;
            }
            if (flag) {
                System.out.printf("Pезультат %s\n", calculator.getResult());
            }
            String remove = prompt("Еще посчитать (y/n)? ");
            if (remove.equals("n")) {
                break;
            }


        }
    }

    private String prompt(String msg) {
        System.out.print(msg);
        return iScanner.nextLine();
    }

    private double promptDouble(String msg) {
        System.out.print(msg);
        return Double.parseDouble(iScanner.nextLine());
    }

    private Complex promptComplex(String msg) {
        System.out.println(msg);
        double inputRe = promptDouble("Введите вещественную часть: ");
        double inputIm = promptDouble("Введите мнимую часть: ");
        return new Complex(inputRe, inputIm);
    }
}
