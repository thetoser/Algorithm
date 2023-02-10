package com.zhljava.luogu.dfs_bfs;

import java.util.Scanner;

public class LakeCount {
	
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
				if (arr[i][j] == 'W') { //��Ŀ��Сд����
					dfs(arr, i, j);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	private static void dfs(char[][] arr, int x, int y) {
		arr[x][y] = '.';
		int dx, dy;
		
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				dx = x + i;
				dy = y + j;
				
				if (dx >= 0 && dx < row && 
					dy >=0 && dy < col && 
					arr[dx][dy] == 'W') {
					
					dfs(arr, dx, dy);
				}
			}
		}
	}

}
