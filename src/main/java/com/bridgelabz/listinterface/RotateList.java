package com.bridgelabz.listinterface;

import java.util.*;

public class RotateList {
    public static void rotateList(int[] arr, int r) {
        int n = arr.length;
        r = r % n; // Handle cases where r > n

        // Create a temporary array to store rotated elements
        int[] temp = new int[n];

        // Copy rotated elements
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + r) % n];
        }

        // Copy back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter number of positions you want to rotate :");
        int r = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        rotateList(arr, r);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }
}

