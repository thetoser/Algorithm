package com.zhljava.luogu.dfs_bfs;

import java.util.Scanner;

public class CellCountDFS {
	
	private static int row;
	private static int col;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		row = scanner.nextInt();
		col = scanner.nextInt();
		
		int count = 0;
		char[][] arr = new char[row][col];
		
		for (int i = 0; i < row; i++) {
			String temp = scanner.next();
			for (int j = 0; j < col; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] != '0') {
					count++;
					dfs(arr, i, j);
				}
			}
		}
		System.out.println(count);
		
	}
	
	private static void dfs(char[][] arr, int x, int y) {
		arr[x][y] = '0';
		int[] dxArr = {1, 0, -1, 0};
		int[] dyArr = {0, 1, 0, -1};
		int dx, dy;
		
		for (int i = 0; i < 4; i++) {
			dx = x + dxArr[i];
			dy = y + dyArr[i];
			if (dx >= 0 && dx < row && 
				dy >= 0 && dy < col &&
				arr[dx][dy] != '0') {
				
				dfs(arr, dx, dy);
			}
			
		}
		
	}

}
