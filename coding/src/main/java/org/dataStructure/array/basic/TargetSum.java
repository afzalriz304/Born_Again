package org.dataStructure.array.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        targetSum(new int[]{2, 3, 4, 6, 7, 11}, 9).forEach(list -> System.out.println(list[0] + " " + list[1]));
        targetSum(new int[]{7, 2, 3, 11, -1, 3, 4}, 6).forEach(list -> System.out.println(list[0] + " " + list[1]));
    }

    private static ArrayList<int[]> targetSum(int[] nums, int k) {
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                result.add(new int[]{nums[i], nums[j]});
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
