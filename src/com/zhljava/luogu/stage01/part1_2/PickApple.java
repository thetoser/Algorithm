package com.zhljava.luogu.stage01.part1_2;

import java.util.Scanner;

public class PickApple {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int height = scanner.nextInt();
		height += 30;
		
		for (int i = 0; i < 10; i++) {
			if (arr[i] <= height) count++;
		}
		
		System.out.println(count);
	}
	
}
