package org.course;

public class EqualSumChecker {
    public static boolean hasEqualSum (int a, int b, int c) {
        return a + b == c;
    }
    public static boolean hasTeen (int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
    public static boolean isCatPlaying (boolean summer, int temperatura) {
        int minT = 25;
        int maxT = summer ? 45 : 35;
        return temperatura >= minT && temperatura <= maxT;
    }
    public static boolean isTeen (int a) {
        int minTeen = 13, maxTeen = 19;
        return (a >= minTeen && a <= maxTeen);
    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        }
        else {
            return Math.PI * radius * radius;
        }
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) return -1.0;
        else return x * y;
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;
            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");
        }
    }

    public static void printEqual (int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && a == c && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else /*if (a == b || a == c || b == c)*/{
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 32, 44));
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
