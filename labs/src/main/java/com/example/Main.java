package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Terminal Calculator");
        System.out.println("Enter expression:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int num1, num2, result;
        String[] parts = str.split(" ");
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
            

            switch (parts[1]) {
                case "+":
                    result = num1 + num2;
                    System.out.println(result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println(result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println(result);
                    break;

                case "/":
                    result = num1 / num2;
                    if (num2 != 0) {
                       System.out.println(result); 
                    }
                    else {
                        System.out.println("Division is not possible");
                    }
                    break;
                    
                default:
                    System.out.println("The action cannot be performed");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input");
        }
        in.close();
    }
}