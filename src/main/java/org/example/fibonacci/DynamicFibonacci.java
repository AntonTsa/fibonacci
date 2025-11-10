package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Цей клас імплементує варіант алгоритму обчислення використовуючи
 * динамічне програмування.
 *
 *
 */
public class DynamicFibonacci {
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int calculate(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int value = calculate(n - 1) + calculate(n - 2);

        cache.put(n, value);

        return value;
    }
}
