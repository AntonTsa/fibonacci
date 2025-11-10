package org.example.fibonacci;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        IteratedFibonacci iteratedFibonacci = new IteratedFibonacci();
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        DynamicFibonacci dynamicFibonacci = new DynamicFibonacci();

        System.out.println("Iterated Fibonacci's number of 0 is " + iteratedFibonacci.calculate(0));
        System.out.println("Iterated Fibonacci's number of 1 is " + iteratedFibonacci.calculate(1));
        System.out.println("Iterated Fibonacci's number of 2 is " + iteratedFibonacci.calculate(2));
        System.out.println("Iterated Fibonacci's number of 3 is " + iteratedFibonacci.calculate(3));
        System.out.println("Iterated Fibonacci's number of 6 is " + iteratedFibonacci.calculate(6));
        System.out.println("Iterated Fibonacci's number of 9 is " + iteratedFibonacci.calculate(9));

        System.out.println("Iterated Fibonacci's number of 0 is " + recursiveFibonacci.calculate(0));
        System.out.println("Iterated Fibonacci's number of 1 is " + recursiveFibonacci.calculate(1));
        System.out.println("Iterated Fibonacci's number of 2 is " + recursiveFibonacci.calculate(2));
        System.out.println("Iterated Fibonacci's number of 3 is " + recursiveFibonacci.calculate(3));
        System.out.println("Iterated Fibonacci's number of 6 is " + recursiveFibonacci.calculate(6));
        System.out.println("Iterated Fibonacci's number of 9 is " + recursiveFibonacci.calculate(9));

        System.out.println("Iterated Fibonacci's number of 0 is " + dynamicFibonacci.calculate(0));
        System.out.println("Iterated Fibonacci's number of 1 is " + dynamicFibonacci.calculate(1));
        System.out.println("Iterated Fibonacci's number of 2 is " + dynamicFibonacci.calculate(2));
        System.out.println("Iterated Fibonacci's number of 3 is " + dynamicFibonacci.calculate(3));
        System.out.println("Iterated Fibonacci's number of 6 is " + dynamicFibonacci.calculate(6));
        System.out.println("Iterated Fibonacci's number of 9 is " + dynamicFibonacci.calculate(9));
    }
}
