package com.zhljava.luogu.stage01.part1_4;

import java.util.Scanner;

public class OperateNumNew {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[1001];
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i / 2; j++) {
				arr[i] += arr[j];
			}
			arr[i]++;
		}
		
		System.out.println(arr[n]);
	}
	
}
