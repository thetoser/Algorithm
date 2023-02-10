package com.zhljava.leetbook.array;

/**
 * 合并区间
 */
public class MergeInterval {
//    以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [start, end] 。
//    请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
//输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
//输出：[[1,6],[8,10],[15,18]]

//输入：[[1,4],[0,2],[3,5]]
//输出：[[0,5]]
    public static void main(String[] args) {
        int[][] array = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals = merge(array);
        printArray(intervals);
    }

    public static int[][] merge(int[][] intervals) {
        //Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int index = -1;
        int[] temp;
        //排序
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = 0; j < intervals.length - i - 1; j++) {
                if (intervals[j][0] > intervals[j + 1][0]) {
                    temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }
        //每一个元素都判断是否需要合并区间
        for (int i = 0; i < intervals.length - 1; i++) {
            index = -1;
            if (intervals[i][1] >= intervals[i + 1][0]) { //区间重叠
                index = i;
                i--;//从当前索引开始判断
            }
            int[][] array;
            if (index == -1) { //没有重叠就不需要更新数组
                continue;
            } else {
                array = new int[intervals.length - 1][2];
            }

            for (int j = 0; j < intervals.length - 1; j++) {
                for (int k = 0; k < 2; k++) {
                    if (j < index) {
                        array[j][k] = intervals[j][k];
                    } else if (j == index) { //[0,4],[1,3]
                        int max = Math.max(intervals[j][1], intervals[j + 1][1]);
                        array[j][0] = intervals[j][0];
                        array[j][1] = max;
                    } else {
                        array[j][k] = intervals[j + 1][k];
                    }
                }
            }
            intervals = array;//每次合并完更新原数组
        }
        return intervals;
    }

    public static void printArray(int[][] intervals) {
        System.out.print("[");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[");
            for (int j = 0; j < 2; j++) {
                System.out.print(intervals[i][j]);
                if (j == 0) {
                    System.out.print(",");
                }
            }
            if (i != intervals.length - 1) {
                System.out.print("],");
            }
        }
        System.out.print("]");
    }
}
