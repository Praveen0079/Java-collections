package sample;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<Integer> numbers = new java.util.Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers: " + numbers);
        System.out.println("First number: " + numbers.firstElement());
        numbers.removeElementAt(1);
        System.out.println("After removing second element: " + numbers);
    }
}

/*
Vector:
- Similar to ArrayList, but synchronized
- Legacy class, generally ArrayList is preferred unless thread-safety is required
*/