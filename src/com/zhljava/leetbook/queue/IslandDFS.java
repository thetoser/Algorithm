package com.zhljava.leetbook.queue;

/**
 * 给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * 此外，你可以假设该网格的四条边均被水包围。
 */
public class IslandDFS {
    public static void main(String[] args) {
        char[][] island = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '0'}};
        IslandDFS islandDFS = new IslandDFS();
        System.out.println(islandDFS.numIslands(island));
    }

    public int numIslands(char[][] grid) {
        //边界条件判断
        if (grid == null || grid.length == 0)
            return 0;
        //统计岛屿的个数
        int count = 0;
        //两个for循环遍历每一个格子
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                //只有当前格子是1才开始计算
                if (grid[i][j] == '1') {
                    //如果当前格子是1，岛屿的数量加1
                    count++;
                    //然后通过dfs把当前格子的上下左右4
                    //个位置为1的都要置为0，因为他们是连着
                    //一起的算一个岛屿，
                    dfs(grid, i, j);
                }
            }
        //最后返回岛屿的数量
        return count;
    }

    //把当前格子以及他邻近的为1的格子都会置为1
    public void dfs(char[][] grid, int i, int j) {
        //边界条件判断，不能越界
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return;
        //把当前格子置为0，然后再从他的上下左右4个方向继续遍历
        grid[i][j] = '0';
        dfs(grid, i - 1, j);//上
        dfs(grid, i + 1, j);//下
        dfs(grid, i, j + 1);//左
        dfs(grid, i, j - 1);//右
    }
}
