package Polymorphism;

class Features {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    // method overloding
    static void add(Double a, Double b) {
        System.out.println(a + b);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Features.add(2, 3);
        Features.add(2.2, 3.2);
    }
}
