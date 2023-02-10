package com.zhljava.luogu.stage01.part1_2;

import java.util.Scanner;

public class XR4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		int count;
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < k; i++) {
			count = 0;
			
			if (i < k / 2) {
				for (int j = 0; j <= i; j++) {
					for (int l = 0; l < n; l++) {
						if (arr[l][j] == i+1) {
							count++;
							break;
						}
					}
				}
			} else {
				for (int j = 0; j < m; j++) {
					for (int l = 0; l < n; l++) {
						if (arr[l][j] == i+1) {
							count++;
							break;
						}
					}
				}
			}
			
			System.out.print(count);
			if (i != k-1) {
				System.out.print(" ");
			}
		}
	}
}
