package com.bridgelabz.List_Interface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class nthLastElemt {
    static <T> T nthElementFromEnd(LinkedList<T> list, int n) {
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the size of the list");
            }
            first.next();
        }

        // Move both pointers one step at a time until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Size of list : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.print("Enter nth position from last : ");
        int nth = sc.nextInt();
        System.out.print("Element at nTh position from last : ");

        System.out.println(nthElementFromEnd(list, nth));
    }
}
