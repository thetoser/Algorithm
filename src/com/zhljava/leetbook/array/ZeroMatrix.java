package com.zhljava.leetbook.array;

/**
 * 零矩阵
 */
public class ZeroMatrix {
//    编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
    public static void main(String[] args) {
        //int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int len = matrix.length;
        int len1 = matrix[0].length;

        //记录需要修改的行和列
        int[] rowRecord = new int[len];
        int[] colRecord = new int[len1];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                if (matrix[i][j] == 0) {
                    rowRecord[i] = 1;
                    colRecord[j] = 1;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                if (rowRecord[i] == 1 || colRecord[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        RotateMatrix.printArray(matrix);
    }

//    public static void setZeroes(int[][] matrix) {
//        int len = matrix.length;
//        int len1 = matrix[0].length;
//        int[][] array = matrix;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len1; j++) {
//                if (matrix[i][j] == 0) {
//                    array = modifyMatrix(array, i, j);
//                }
//            }
//        }
//        matrix = array;
//        RotateMatrix.printArray(matrix);
//    }
//
//    public static int[][] modifyMatrix(int[][] matrix, int row, int col) {
//        int[][] array = new int[matrix.length][matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == row || j == col) {
//                    array[i][j] = 0;
//                } else {
//                    array[i][j] = matrix[i][j];
//                }
//            }
//        }
//        return array;
//    }
}
