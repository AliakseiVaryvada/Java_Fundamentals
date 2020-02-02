package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.text.DateFormatSymbols;

public class Main {

    public static Boolean operationSuccess;

    public static void main(String[] args) {

        Scanner selectTask = new Scanner(System.in);
        String taskSelect = "";

        while (!taskSelect.equalsIgnoreCase("q")) {

            System.out.println("Please, enter task number(1-5) or q for exit: ");

            taskSelect = selectTask.nextLine();

            int taskNumber = 0;


            if (taskSelect.matches("^[0-9]+$")) {
                taskNumber = Integer.parseInt(taskSelect);
            }


            if (taskNumber == 1) {
                System.out.println("Task 1. Please, enter user name: ");
                Scanner inputValueName = new Scanner(System.in);
                String inputName = inputValueName.nextLine();
                helloUser(inputName);
            } else if (taskNumber == 2) {

                if (args.length != 0) {
                    System.out.println("Task 2. Reverse Arguments: ");
                    for (int i = args.length - 1; i > -1; i--) {
                        System.out.println("arg = " + args[i]);
                    }
                } else {
                    System.out.println("Task 2. Arguments list is empty :(");
                }
            } else if (taskNumber == 3) {
                Scanner inputValueLength = new Scanner(System.in);
                System.out.println("Task 3. Enter Array Length: ");
                if (!inputValueLength.hasNextInt()) {
                    System.out.println("Argument not integer");
                } else {
                    int length = inputValueLength.nextInt();
                    randomValues(length);
                }
            } else if (taskNumber == 4) {
                if (args.length != 0) {
                    System.out.println("Task 4. Arguments summary: ");

                    int argsSum = 0;
                    int argsMult = 1;

                    for (String arg : args) {
                        argsSum += Integer.parseInt(arg);
                        argsMult *= Integer.parseInt(arg);
                    }
                    System.out.println("Task 4. Summary : " + argsSum);
                    System.out.println("Task 4. Multiplication : " + argsMult);

                } else {
                    System.out.println("Task 4. Arguments list is empty :(");
                }
            } else if (taskNumber == 5) {
                Scanner inputValueMonth = new Scanner(System.in);
                System.out.println("Task 5. Enter month number : ");
                if (!inputValueMonth.hasNextInt()) {
                    System.out.println("Argument not integer");
                } else {
                    int monthNumber = inputValueMonth.nextInt();
                    monthName(monthNumber);
                }
            }
        }
        System.out.println("Finish");
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

    public static void randomValues(Integer length) {

        int[] randomArray;
        StringBuilder randomString = new StringBuilder();
        randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++)
            randomArray[i] = (int) (Math.random() * length);
        for (int i : randomArray) {
            System.out.println(i + " ");
            randomString.append(i);
            randomString.append(" ");
        }
        System.out.println(randomString);

    }

    public static void monthName(Integer monthNumber) {

        if ((monthNumber > 1 && monthNumber > 12)) {
            throw new IllegalArgumentException("Task 5. Incorrect month number");
        }
        System.out.println("Task 5 " + new DateFormatSymbols(Locale.ENGLISH).getMonths()[monthNumber - 1]);

    }
}
