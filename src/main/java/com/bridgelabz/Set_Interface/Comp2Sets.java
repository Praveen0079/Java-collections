package com.bridgelabz.Set_Interface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Comp2Sets {
    static boolean compare(Set<String> set1,Set<String> set2){
        if(set1.equals(set2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Size of sets :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" digits for Set 1");
        for (int i = 0; i < n; i++) {
            set1.add(sc.next());
        }
        System.out.println("Enter "+n+" digits for Set 2");
        for (int i = 0; i < n; i++) {
            set2.add(sc.next());
        }
        if(compare(set1,set2)){
            System.out.println("Set 1  =  Set 2");
        }
         else System.out.println("Set 1  !=  Set 2");

    }
}
