package com.zhljava.leetbook.array;

/**
 * 查找下标
 */
public class SearchInsert {
//    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
//    如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//    请必须使用时间复杂度为 O(log n) 的算法。
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int index = searchInsert(nums, 7);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) return i;
            if (target > nums[i] && target <= nums[i + 1]) return i + 1;
        }
        if (target <= nums[0]) return 0;
        return nums.length;//大于数组中所有元素
    }

    public static int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }
}
