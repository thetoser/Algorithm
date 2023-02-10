package com.zhljava.leetbook.double_pointer;

import java.util.Arrays;

/**
 * 数组拆分
 */
public class ArraySplit {
//    给定长度为2n的整数数组 nums ，你的任务是将这些数分成n 对,
//    例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到n 的 min(ai, bi) 总和最大。
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for (int i = 0; i < nums.length; i += 2) {
            num += nums[i];
        }
        return num;
    }
}
