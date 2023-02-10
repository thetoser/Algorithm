package com.zhljava.leetbook.array;

/**
 * 对角线遍历
 */
public class DiagonalErgodic {
//    给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，
//    用一个数组返回这个矩阵中的所有元素。
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] diagonalOrder = findDiagonalOrder(array);
        for (int n : diagonalOrder) {
            System.out.print(n + " ");
        }
    }

    /*
        1   2   3   4
        5   6   7   8
        9   10  11  12
        13  14  15  16
         i + j = n(1,2,3...)时的元素个数:
         1 2 3 2 1
         [0][0] [0][1] [1][0] [2][0] [1][1] [0][2] [1][2] [2][1] [2][2] len = 3
         1 2 3 4 3 2 1
         [0][0] [0][1] [1][0] [2][0] [1][1] [0][2] [0][3] [1][2] [2][1] [3][0]
         [3][1] [2][2] [1][3] [2][3] [3][2] [3][3] len = 4

            i + j 最大值: len + len1 -2

     */
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        //存放数组
        int[] ans = new int[m * n];
        //对角线方向次数
        int count = n + m - 1;
        //定义初始化 行标记，列标记，存放数组索引
        int row = 0, col = 0, Index = 0;
        //开始对角线循环
        for (int i = 0; i < count; i++) {
            //判断对角线方向（因题目初始从右上（即i=0）开始）：偶数右上，奇数左下
            if (i % 2 == 0) {
                //右上操作
                while (row >= 0 && col < n) {
                    //将矩阵数存入存放数组
                    ans[Index] = mat[row][col];
                    //索引后移
                    Index++;
                    //右上规律：行减一，列加一
                    row--;
                    col++;
                }
                //判断是否为越界情况：不越界正常行加一，越界行加二，列减一；
                //（此处不理解的拿张草稿纸将循环中row和col的值遍历写一下对照矩阵图就明白了）
                if (col < n) {
                    row++;
                } else {
                    row += 2;
                    col--;
                }
            } else { //左下操作：按规律与右上相反即可
                while (row < m && col >= 0) {
                    ans[Index] = mat[row][col];
                    Index++;
                    row++;
                    col--;
                }
                if (row < m) {
                    col++;
                } else {
                    row--;
                    col += 2;
                }
            }
        }
        // 返回存放数组
        return ans;
    }
}
