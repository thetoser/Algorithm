package com.zhljava.leetbook.array;

/**
 * 中心下标
 */
public class PivotIndex {
//    给你一个整数数组 nums ，请计算数组的 中心下标 。
//    数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
//    如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
//    如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
    public static void main(String[] args) {
        //int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums = {1, 5, -6, 4};
        int index = pivotIndex(nums);
        System.out.println(index);
    }

    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        int index = -2;
        for (int i = 0; i < len; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            if (i != 0 && i != len - 1) {
                //左边之和
                for (int j = 0; j < i; j++) {
                    sumLeft += nums[j];
                }
                //右边之和
                for (int j = len - 1; j > i; j--) {
                    sumRight += nums[j];
                }
                if (sumLeft == sumRight) {
                    index = i;
                    break;
                }
            }

            if (i == 0) {
                for (int j = 1; j < len; j++) {
                    sumRight += nums[j];
                }
                if (sumRight == 0) {
                    index = i;
                    break;
                }
            }

            if (i == len - 1) {
                for (int j = 0; j < i; j++) {
                    sumLeft += nums[j];
                }
                if (sumLeft == 0) {
                    index = i;
                    break;
                }
            }
        }
        if (index == -2) index = -1;

        return index;
    }
}
