package com.company;

import java.util.Scanner;

public class Main {

    public static Boolean operationSuccess;

    public static void main(String[] args) {

        System.out.print("Please, select task");

        Scanner inputValue = new Scanner(System.in);
        String inputName = inputValue.nextLine();
        helloUser(inputName);
        inputValue.close();

    }

    public static void helloUser(String inputName) {

        System.out.println("Please, enter user name: ");

        if (inputName.matches("^[a-zA-Z]+$")) {
            System.out.println("Hello " + inputName);
            operationSuccess = true;
        } else {
            System.out.println("Oops! Wrong name. Check input.");
            operationSuccess = false;
        }
    }
}
