package com.zhljava.leetbook.double_pointer;

/**
 * 移除元素
 */
public class RemoveElement {
//    给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
//    不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
//    元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 3, 0, 5, 2};
        int len = removeElement(nums, 2);
        System.out.println(len);
    }

    public static int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0, temp = 0;
        while (fast < nums.length) {
            if (fast == nums.length - 1) { //最后一个元素
                if (nums[fast] == val) return slow;
                return slow + 1;
            }
            fast++;
            if (nums[slow] != val) {
                slow++;
            } else if (nums[slow] == val) {
                if (nums[fast] != val) {
                    temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                    slow++;
                }
            }
        }
        return 0;
    }
}
