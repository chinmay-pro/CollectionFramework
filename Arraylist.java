package com.company;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(28);
        l2.add(20);
        l2.add(5);
        l1.add(5);
        // l1.clear();
        l1.add(6);
        l1.add(0,1);
        l1.addAll(l2);
        l1.set(2,89);
        l1.remove(0);
        System.out.println("Size of ArrayList : " + l1.size());
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.isEmpty());
        // Accessing elements via foreach
        /* for (int i: l1) {
            System.out.println(i);
        } */
        // Accessing elements via for
        for (int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
