package com.UoK.task1;
import java.util.Scanner;

public class Main {

    // Addition
    public static double addition(double a, double b){

        double sum = a + b;
        return sum;
    }

    // Subtraction
    public static double subtraction(double a, double b){

        double dif = a - b;
        return dif;
    }

    //multiplication
    public static double multiplication(double a, double b){

        double product = a * b;
        return product;
    }

    //division
    public static double division(double a, double b){

        double div = a / b;
        return div;
    }


    public static void main(String[] args) {
        int operator;
        double number1, number2, result = 0;

        // creating an object of Scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t*****  Hello there! What do you want me to perform?  *****");
        System.out.println("-- Press number 1 to add");
        System.out.println("-- Press number 2 to subtract");
        System.out.println("-- Press number 3 to multiply");
        System.out.println("-- Press number 4 to divide ");

        // taking the operator as input
        operator = input.nextInt();

        // input numbers
        System.out.println("\nEnter first number -> ");
        number1 = input.nextDouble();

        System.out.println("\nEnter second number -> ");
            number2 = input.nextDouble();

        switch (operator) {


            case 1:
                result = addition(number1, number2);
                break;

            case 2:
                result = subtraction(number1, number2);

                break;

            case 3:
                result = multiplication(number1, number2);

                break;

            case 4:
                result = division(number1, number2);

                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.println("\t\t---Answer is " + result + "---");
        System.out.println("\n\tThank you for using our calculator! See you again.");

        input.close();

    }
}
