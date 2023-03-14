package org.course;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        shouldWakeUp(true, -5);
        System.out.println(shouldWakeUp(true, 25));
    }
}
