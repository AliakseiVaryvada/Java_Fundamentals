package com.company;

import java.util.Scanner;

public class Main {

    public static Boolean operationSuccess;

    public static void main(String[] args) {

        System.out.print("Please, select task");

        System.out.println("Task 1. Please, enter user name: ");
        Scanner inputValueFirst = new Scanner(System.in);
        String inputName = inputValueFirst.nextLine();
        helloUser(inputName);
        inputValueFirst.close();

        if(args.length!=0) {
        System.out.print("Task 2. Reverse Arguments: ");
            for (int i = args.length - 1; i > -1; i--) {
                System.out.println("arg = " + args[i]);
            }
        }else{
            System.out.print("Task 2. Arguments list is empty :(");
        }
    }

    public static void helloUser(String inputName) {

        if (inputName.matches("^[a-zA-Z]+$")) {
            System.out.println("Hello " + inputName);
            operationSuccess = true;
        } else {
            System.out.println("Oops! Wrong name. Check input.");
            operationSuccess = false;
        }
    }

}
