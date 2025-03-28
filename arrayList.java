package sample;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);
        System.out.println("Second fruit: " + fruits.get(1));
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }

}
/*
ArrayList:
- Implements List interface
- Backed by a dynamic array
- Provides constant-time performance for basic operations (add, remove, get, set)
- Better for storing and accessing data.
*/