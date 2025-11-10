package org.example.fibonacci;

/**
 * Цей клас імплементує рекурсивний варіант алгоритму обчислення
 * числа Фібоначчі.
 *
 *
 */
public class RecursiveFibonacci {
    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }

        return calculate(n - 1) + calculate(n - 2);
    }
}
