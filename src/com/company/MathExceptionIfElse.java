package com.company;

import java.util.Random;
import java.util.Scanner;

public class MathExceptionIfElse {


    public static void main(String[] args) {

        System.out.println("Test New");
        System.out.println("is crap");

        mainMenu();


    }


    public static void mainMenu() {
        boolean game = true;

        while (game) {

            System.out.println("Welcome to ferfys math game!!");
            System.out.println("What subject of math would you like testing in?");
            System.out.println("Choose 1-4: 1-Addition, 2-Subtraction, 3-Division, 4-Multiplication");
            System.out.println("Or 0 to exit program");
            Scanner scan = new Scanner(System.in);
            int subjectNumber = scan.nextInt();


            switch (subjectNumber) {
                case 1:
                    additionQuestions();
                    break;
                case 2:
                    subtractionQuestions();
                    break;
                case 3:
                    divisionQuestions();
                    break;
                case 4:
                    multiplicationQuestions();
                    break;
                case 0:
                    System.out.println("Quitting ferfys math game...");
                    game = false;

            }
        }

    }


    public static void additionQuestions() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many addition questions, would you like?");
        int numberOfQuestions = scan.nextInt();

        for (int i = 1; i <= numberOfQuestions; i++) {
            Random random = new Random();
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            System.out.println("What is " + num1 + " + " + num2 + "?");
            int answer = scan.nextInt();

            if (answer == num1 + num2) {
                System.out.println("Your solution was correct!!");
            } else {
                System.out.println("Your solution was wrong");
            }
        }
    }


    public static void subtractionQuestions() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many subtraction questions, would you like?");
        int numberOfQuestions = scan.nextInt();

        for (int i = 1; i <= numberOfQuestions; i++) {
            Random random = new Random();
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            System.out.println("What is " + num1 + " - " + num2 + "?");
            int answer = scan.nextInt();

            if (answer == num1 - num2) {
                System.out.println("Your solution was correct!!");
            } else {
                System.out.println("Your solution was wrong");
            }
        }
    }


    public static void divisionQuestions() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many division questions, would you like?");
        int numberOfQuestions = scan.nextInt();

        for (int i = 1; i <= numberOfQuestions; i++) {
            Random random = new Random();
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            if (num2 == 0) {
                num2 = random.nextInt(9) + 1;
            }
            System.out.println("What is " + num1 + " / " + num2 + "?");
            int answer = scan.nextInt();


            if (answer == num1 / num2) {
                System.out.println("Your solution was correct!!");
            } else {
                System.out.println("Your solution was wrong");
            }


        }
    }


    public static void multiplicationQuestions() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many multiplication questions, would you like?");
        int numberOfQuestions = scan.nextInt();

        for (int i = 1; i <= numberOfQuestions; i++) {
            Random random = new Random();
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            System.out.println("What is " + num1 + " * " + num2 + "?");
            int answer = scan.nextInt();

            if (answer == num1 * num2) {
                System.out.println("Your solution was correct!!");
            } else {
                System.out.println("Your solution was wrong");
            }
        }
    }
}





