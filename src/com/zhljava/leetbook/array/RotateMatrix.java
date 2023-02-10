package com.zhljava.leetbook.array;

/**
 * 翻转矩阵
 */
public class RotateMatrix {
//    给你一幅由N × N矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
//    不占用额外内存空间能否做到？
//    [1,2,3]    [7,4,1]
//    [4,5,6]    [8,5,2]
//    [7,8,9]    [9,6,3]
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        int len1 = matrix[0].length;
        int[][] array = new int[len][len1];
        //给新数组赋值
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                array[i][j] = matrix[len - j - 1][i];
            }
        }
        //不占用额外内存空间 需要把 array 中的值赋给 matrix
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
