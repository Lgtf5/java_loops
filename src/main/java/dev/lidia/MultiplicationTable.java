package dev.lidia;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class MultiplicationTable {
    public static int multiplicationTable(int size) {
        int result = 0;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                result += i * j;
            }
        }
        return result;
    }
}
