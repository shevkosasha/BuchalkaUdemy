package org.course.linkedlist_arraylist_iterator_autoboxing;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
//        addPlace(placesToVisit, new Place("Perth", 3923));
//        addPlace(placesToVisit, new Place("Alice Springs", 3771));
//        addPlace(placesToVisit, new Place("Darwin", 3972));
//        addPlace(placesToVisit, new Place("Melbourne", 817));
        addPlace(placesToVisit, new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while (!quitLoop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter value:");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
//            if (menuItem.equalsIgnoreCase("q")){
//                quitLoop = true;
//            }
            switch (menuItem){
                case "F":
                    System.out.println("forward");
                    if(!forward){       // reversing direction
                        forward = true;
                        if (iterator.hasNext()){ // adjust position forward
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("backward");
                    if(forward){       // reversing direction
                        forward = false;
                        if (iterator.hasPrevious()){ // adjust position forward
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println("list places");
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    System.out.println("Menu");
                    printMenu();
                    break;
                case "Q":
                default:
                    System.out.println("Quit");
                    quitLoop = true;
                    break;
//                default:
            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        System.out.println(place);
//        if (list.contains(place)){
//            System.out.println("Duplicate found: " + place);
//            return;
//        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listplace : list){
            System.out.println("index: " + matchedIndex);
            if (place.distance() < listplace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    public static void printMenu() {
        System.out.println("""
                Available actions: select word or letter:
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """);
    }
}
