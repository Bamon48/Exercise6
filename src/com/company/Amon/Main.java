/*
Benton Amon
Exercise 6
Gets user input for Strings, ints, and doubles. Catches any errors.
 */

package com.company.Amon;

import java.util.InputMismatchException;
import java.util.Scanner;

// ----------

class UserInput {

    public static String checkInt(String userInput) {
        Scanner scanner = new Scanner(System.in);

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
                if (isInt == true) {
                    System.out.println("Incorrect datatype entered (INTEGER), please try again.");
                    userInput = scanner.nextLine();
                    checkInt(userInput);

                }
            } catch (NumberFormatException e) {
                break;

            }
        }
        return userInput;
    }

    public static String checkDouble(String userInput) {
        Scanner scanner = new Scanner(System.in);

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
                if (isDouble == true) {
                    System.out.println("Incorrect datatype entered (DOUBLE), please try again.");
                    userInput = scanner.nextLine();
                    checkInt(userInput);
                    checkDouble(userInput);

                }
            } catch (NumberFormatException e) {
                break;

            }


        }
        return userInput;
    }

    public String promptString(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String userInput = scanner.nextLine();
        checkInt(userInput);
        checkDouble(userInput);
        System.out.println("You entered the String: " + userInput);

        return message;
    }
}

// ---------

public class Main {

    // METHODS

    // Asks the user to input an integer until one is entered
    public static void promptInt() {

        int msg;

        System.out.println("Please enter an integer: ");

        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                msg = input.nextInt();
                input.nextLine();
                System.out.println("You entered an integer of: " + msg);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type entered, please try again.");


            } catch (Exception e) {
                System.out.println("Something went wrong! Please try again. ");


            }
        }
    }

    // Asks the user to input a double until one is entered
    public static void promptDouble() {

        double msg;

        System.out.println("Please enter a double: ");

        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                msg = input.nextDouble();
                input.nextLine();
                System.out.println("You entered a double of: " + msg);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type entered, please try again.");


            } catch (Exception e) {
                System.out.println("Something went wrong! Please try again. ");


            }
        }
    }

    // -------------
    // MAIN
    public static void main(String[] args) {

        UserInput input = new UserInput();


        input.promptString("Enter a String: ");
        promptInt();
        promptDouble();

    }
}
