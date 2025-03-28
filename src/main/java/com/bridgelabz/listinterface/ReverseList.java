package com.bridgelabz.listinterface;

import java.util.*;

public class ReverseList {

    //method to reverse list
    static void reverseList(List<Integer> list){
        //1
        int left = 0 ,right = list.size()-1;
        while (left<right){
            // swapping
            Integer temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);

            left++;
            right--;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Inputs : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Digits to make Array List:");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Enter "+n+" Digits to make Linked List:");
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }

// printing
        System.out.print("Reversed Array List : ");
        reverseList(arrayList);

        System.out.print("Reversed Linked List : ");
        reverseList(linkedList);
    }
}

/*Enter no. of Inputs : 5
Enter 5 Digits to make Array List:
1 2 3 4 56
Enter 5 Digits to make Linked List:
1 5 9 3 64
Reversed Array List : [56, 4, 3, 2, 1]
Reversed Linked List : [64, 3, 9, 5, 1]
*/