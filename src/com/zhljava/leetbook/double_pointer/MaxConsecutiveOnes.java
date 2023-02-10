package com.zhljava.leetbook.double_pointer;

/**
 * 最大连续 1的个数
 */
public class MaxConsecutiveOnes {
//    给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 1, 1};
        int count = findMaxConsecutiveOnes(nums);
        System.out.println(count);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int start = 0, end = 0;
        while (end < nums.length) {
            if (nums[end] == 1) {
                end++;
            } else {
                //当前连续 1的长度
                result = Math.max(result, end - start);
                end++;
                start = end;
            }
        }
        result = Math.max(result, end - start);
        return result;
    }

//    public static int findMaxConsecutiveOnes1(int[] nums) {
//        int finalCount = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[j] == 1) {
//                    count++;
//                } else break;
//            }
//            if (count > finalCount) {
//                finalCount = count;
//            }
//        }
//        return finalCount;
//    }
}
