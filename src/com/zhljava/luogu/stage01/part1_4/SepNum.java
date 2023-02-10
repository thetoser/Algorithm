package com.zhljava.luogu.stage01.part1_4;

import java.util.Scanner;

public class SepNum {
	
	private static int count;
	private static int k;
	private static int n;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		dfs(0, 0, 1);
		
		System.out.println(count);
	}
	
	private static void dfs(int x, int sum, int m) {
		
		if (x == k) {
			if (sum == n) count++;
			return;
		}
		
		for (int i = m; i < n; i++) {
			dfs(x + 1, sum + i, i);
		}
		
	}

}
