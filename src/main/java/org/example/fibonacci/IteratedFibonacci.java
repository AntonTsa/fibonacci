package org.example.fibonacci;

/**
 * Цей клас імплементує ітераційний варіант алгоритму обчислення
 * числа Фібоначчі.
 * Змінні prev, current, temp, n та i - прості змінні типу int,
 * нові змінні не додаються і від значення n не залежать,
 * тому просторова складність: О(1)
 * Часова складність: (n - 2) * 3 + 4, тобто залежить напряму від n,
 * а отже, O(n)
 */
public class IteratedFibonacci {

    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 1;
        int current = 1;
        int temp;

        for (int i = 2; i < n; i++) {
            temp = prev;
            prev = current;
            current += temp;
        }

        return current;
    }
}
