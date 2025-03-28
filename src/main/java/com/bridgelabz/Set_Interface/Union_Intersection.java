package com.bridgelabz.Set_Interface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union_Intersection {

    // Method to perform union operation
    static Set<String> union(Set<String> set1, Set<String> set2) {
        // Copy set1
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2); // Add all elements of set2
        return unionSet;
    }

    // Method to perform intersection operation
    static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> intersectionSet = new HashSet<>(set1);
        // Keep only common elements
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Size of sets: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements for Set 1:");
        for (int i = 0; i < n; i++) {
            set1.add(sc.next());
        }

        System.out.println("Enter " + n + " elements for Set 2:");
        for (int i = 0; i < n; i++) {
            set2.add(sc.next());
        }

        // Perform union and intersection
        Set<String> unionResult = union(set1, set2);
        Set<String> intersectionResult = intersection(set1, set2);

        // Display results
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);

        sc.close();
    }
}
