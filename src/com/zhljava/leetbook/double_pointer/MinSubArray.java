package com.zhljava.leetbook.double_pointer;

/**
 * 长度最小的子数组
 */
public class MinSubArray {
//    给定一个含有n个正整数的数组和一个正整数 target 。
//    找出该数组中满足其和 ≥ target 的长度最小的 连续子数组，并返回其长度。
//    如果不存在符合条件的子数组，返回 0 。
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 4, 3};
        int res = minSubArrayLen(6, nums);
        System.out.println(res);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int min = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
