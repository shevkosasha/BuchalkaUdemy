package org.course.arrays;

import java.util.ArrayList;

public class InsertArrayList extends ArrayList {
    public static void main(String[] args) {
        InsertArrayList a, b;

        a = new InsertArrayList();
        b = new InsertArrayList();

//        for(int i=0; i<3; i++){ a.insert(2*i); }
//        System.out.println("a sub = "+a.toString());
        for(int i=0; i<4; i++){ a.insert(i); }
        System.out.println("a sub = "+a.toString());
        a.insert(2);
        System.out.println("a sub = "+a.toString());

    }

    private static final long serialVersionUID = 1L;

    public InsertArrayList(){
        super();
    }

    public void insert(int x){
        // loop through all elements
        for (int i = 0; i < size(); i++) {
            // if the element you are looking at is smaller than x,
            // go to the next element
            if ((Integer)get(i) < x) continue;
            for (int j = i + 1; j < size()-1; i++) {
                set(j+1, (Integer)get(j-1) + 1);
                toString();
            }
            // if the element equals x, return, because we don't add duplicates
//            if ((Integer)get(i) == x) return;
            // otherwise, we have found the location to add x
            add(i, x);
            return;
        }
        // we looked through all of the elements, and they were all
        // smaller than x, so we add ax to the end of the list
        add(x);
    }

    public String toString(){
        //effect: return string of this.
        if(super.size()==0) return "[]";
        String s = "[" + super.get(0).toString();
        for(int i=1; i<super.size(); i++){
            s += ", " + super.get(i).toString();
        }
        return s += "]";
    }
}
