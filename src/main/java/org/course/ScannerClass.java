package org.course;

import java.util.Scanner;

public class ScannerClass {
    public static void basicScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }

    public static void basicScanner2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while(true) {
            boolean input = scanner.hasNextInt();
            if (input) {
                int inputInt = scanner.nextInt();
                sum += inputInt;
                counter++;
            }
            else {
                double average = (double) sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        basicScanner2();
    }
}
