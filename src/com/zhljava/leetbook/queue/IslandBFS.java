package com.zhljava.leetbook.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */
public class IslandBFS {
    public static void main(String[] args) {
        char[][] island = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '0'}};
        IslandBFS islandBFS = new IslandBFS();
        System.out.println(islandBFS.numIslands(island));
    }

    public int numIslands(char[][] grid) {
        //边界条件判断
        if (grid == null || grid.length == 0) return 0;
        //统计岛屿的个数
        int count = 0;
        //两个for循环遍历每一个格子
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                //只有当前格子是1才开始计算
                if (grid[i][j] == '1') {
                    //如果当前格子是1，岛屿的数量加1
                    count++;
                    //然后通过bfs把当前格子的上下左右4
                    //个位置为1的都要置为0，因为它们是连着
                    //一起的算一个岛屿
                    bfs(grid, i, j);
                }
            }
        return count;
    }

    private void bfs(char[][] grid, int x, int y) {
        //把当前格子先置为0
        grid[x][y] = '0';
        int n = grid.length;
        int m = grid[0].length;
        //使用队列，存储的是格子坐标转化的值
        Queue<Integer> queue = new LinkedList<>();
        //平面坐标是两位数字，但队列中存储的是一位数字，
        //所以这里是把两位数字转化为一位数字
        int code = x * m + y;
        //坐标转化的值存放到队列中
        queue.add(code);
        while (!queue.isEmpty()) {
            //出队
            code = queue.poll();
            //再反转成坐标值（i，j）
            int i = code / m;
            int j = code % m;
            if (i > 0 && grid[i - 1][j] == '1') {//上
                //如果上边格子为1，把它置为0，然后加入到队列中
                //下面同理
                grid[i - 1][j] = '0';
                queue.add((i - 1) * m + j);
            }
            if (i < n - 1 && grid[i + 1][j] == '1') {//下
                grid[i + 1][j] = '0';
                queue.add((i + 1) * m + j);
            }
            if (j > 0 && grid[i][j - 1] == '1') { //左
                grid[i][j - 1] = '0';
                queue.add(i * m + j - 1);
            }
            if (j < m - 1 && grid[i][j + 1] == '1') {//右
                grid[i][j + 1] = '0';
                queue.add(i * m + j + 1);
            }
        }
    }
}
