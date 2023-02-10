package com.zhljava.leetbook.double_pointer;

/**
 * 两数之和 II - 输入有序数组
 */
public class TwoSum {
//    给你一个下标从 1 开始的整数数组numbers ，该数组已按 非递减顺序排列 ，
//    请你从数组中找出满足相加之和等于目标数target 的两个数。
//    如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，
//    则 1 <= index1 < index2 <= numbers.length 。
//    以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
//    你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
//    你所设计的解决方案必须只使用常量级的额外空间。
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] key = twoSum(nums, 18);
        System.out.println(key[0] + " " + key[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] key = new int[2];
        int left = 0, right = numbers.length - 1;
        //双指针
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                key[0] = left + 1;
                key[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else { //小于目标值，左指针右移
                left++;
            }
        }
        return key;
    }
}
