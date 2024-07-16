package com.example;

import java.util.Scanner;

public class Calculator {
    private int num1, num2;
    private String op;

    public Calculator() {
        this.calcul();
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int mult() {
        return num1 * num2;
    }

    public int div() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Деление на 0 невозможно");
        }
    }

    public void calculate() {

        switch (op) {
            case "+":
                System.out.println(this.add());
                break;

            case "-":
                System.out.println(this.subtract());
                break;

            case "*":
                System.out.println(this.mult());
                break;

            case "/":
                System.out.println(this.div());
                break;

            default:
                System.out.println("Невоможно выполнить действие");
                break;
        }
    }

    public void calcul() {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Консольный калькулятор");
            System.out.println("Введите выражение:");
            String str = in.nextLine();
            String[] parts = str.split(" ");
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
            op = parts[1];
            in.close();
        } catch (NumberFormatException e) {
            System.out.println("Невозможно провести вычисление");
        }
    }

}
