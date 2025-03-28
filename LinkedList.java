package sample;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> animals = new java.util.LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");

        System.out.println("Animals: " + animals);
        System.out.println("First animal: " + animals.getFirst());
        System.out.println("Last animal: " + animals.getLast());

        animals.remove("Cat");
        System.out.println("After removing Cat: " + animals);
    }
}

/*\
LinkedList:
- Implements List and Deque interfaces
- Implemented as a doubly-linked list
- Better for manipulating data (add/remove operations)
*/