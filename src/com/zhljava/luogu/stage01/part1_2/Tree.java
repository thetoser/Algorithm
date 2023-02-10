package com.zhljava.luogu.stage01.part1_2;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int meter = scanner.nextInt();
		int area = scanner.nextInt();
		int[] arr = new int[meter + 1];
		int count = 0;
		
		for (int i = 0; i < area; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			
			for (int j = start; j <= end; j++) {
				arr[j] = 1;
			}
		}
		
		for (int i = 0; i <= meter; i++) {
			if (arr[i] == 0) count++;
		}
		
		System.out.println(count);
	}
	
}
