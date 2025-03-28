package com.bridgelabz.listinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class removeDups {

    public static ArrayList<String> removeduplicate(String[] strArray){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            if(!list.contains(strArray[i])){
                list.add(strArray[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Size of an array
        System.out.print("Size of List : ");
        int n =sc.nextInt();

        System.out.println("Enter "+n+" elements ");
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            strArray[i] = sc.next();
        }

        //duplicates removed
       ArrayList<String> list = removeduplicate(strArray);
        System.out.println(list);
    }
}
