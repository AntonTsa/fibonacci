package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Цей клас імплементує варіант алгоритму обчислення використовуючи
 * динамічне програмування.
 * Оскільки на відміну від простої рекурсії, кожне значення Фібоначчі
 * розраховується один раз, а складність кожного з методів containsKey, get,
 * put є O(1), то часова складність - O(n).
 * На відміну від простої рекурсії, де для підрахування просторової складності
 * береться до уваги лише стек викликів методу, глибина якого n, то в цьому випадку
 * є ще memo, який міститиме n елементів, тобто загальна просторова складність -
 * O(n)(стек викликів) + О(n)(розмір мемо) = O(n)
 */
public class DynamicFibonacci {
    private final Map<Integer, Integer> memo = new HashMap<>();

    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int value = calculate(n - 1) + calculate(n - 2);

        memo.put(n, value);

        return value;
    }
}
