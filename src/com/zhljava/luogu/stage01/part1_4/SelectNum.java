package com.zhljava.luogu.stage01.part1_4;

import java.util.Scanner;

public class SelectNum {
	
	private static int count;
	private static int n;
	private static int k;
	private static int[] arr;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		dfs(0, 0, 0);
		
		System.out.println(count);
	}
	
	private static void dfs(int x, int sum, int start) {
		
		if (x == k) {
			if (isPrime(sum)) {
				count++;
			}
			return;
		}
		
		for (int i = start; i < n; i++) {
			dfs(x + 1, sum + arr[i], i + 1);
		}
		
	}
	
	private static boolean isPrime(int num) {
		
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}

}
