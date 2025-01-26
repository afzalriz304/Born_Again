package org.dataStructure.array.utils;

public class ArrayUtils {
    public static int[] createArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
