package org.course.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*System.out.println("Enter count for your array");
        int count = scanner.nextInt();
        scanner.nextLine();*/
        /*int[] integers = readElements(readInteger());
        System.out.println();
        print(integers);
        System.out.println("min: " + findMin(integers));
        //sort(integers);
        print(sort(integers));*/
        reverseArray(readElements(readInteger()));
    }

    private static int readInteger(){
        System.out.println("Enter count for your array");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }
    private static int[] readElements(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count +" integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int[] sort(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }
    private static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void reverseArray(int[] array){
        String arrayStr = "Array = [";
        for (int i = 0; i < array.length; i++) {
            arrayStr += (i == array.length - 1) ? array[i] + "]" : array[i] + ", ";
        }
        System.out.println(arrayStr);
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        String reversedArrayStr = "Reversed array = [";
        for (int i = 0; i < array.length; i++) {
            reversedArrayStr += (i == array.length - 1) ? array[i] + "]" : array[i] + ", ";
        }
        System.out.println(reversedArrayStr);
    }
}
