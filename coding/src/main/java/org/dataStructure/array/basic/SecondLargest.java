package org.dataStructure.array.basic;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{12, 35, 1, 10, 34, 1}));
        System.out.println(secondLargestElement(new int[]{10, 10, 10}));
    }

    private static int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int sm = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max != nums[i] && max - nums[i] < sm) {
                sm = max - nums[i];
                result = i;
            }
        }
        return result == -1 ? result : nums[result];
    }
}
