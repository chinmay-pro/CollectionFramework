package com.company;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(28);
        l2.add(20);
        l2.add(5);
        l1.add(5);
        // l1.clear();
        l1.add(6);
        l1.addFirst(809);
        l1.addLast(788);
        l1.add(0,1);
        l1.addAll(l2);
        l1.set(2,89);
        l1.remove(0);
        System.out.println("Size of LinkedList : " + l1.size());
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.isEmpty());
        l1.pop();
        l1.push(456);
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
