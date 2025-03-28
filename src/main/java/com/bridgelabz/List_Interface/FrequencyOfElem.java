package com.bridgelabz.List_Interface;

import java.util.*;

public class FrequencyOfElem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<String, Integer> frequencyMap = new HashMap<>();

            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " words:");
            for (int i = 0; i < n; i++) {
                String word = sc.next();
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            System.out.println("Frequency of elements: " + frequencyMap);
        }
}