package org.dataStructure.array.basic;

import java.util.Arrays;

import static org.dataStructure.array.utils.ArrayUtils.createArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(createArray(5))));
    }

    private static int[] reverse(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
