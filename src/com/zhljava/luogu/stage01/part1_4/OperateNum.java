package com.zhljava.luogu.stage01.part1_4;

import java.util.Scanner;

public class OperateNum {
	
	private static int count = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		concat(n);
		System.out.println(count);
	}
	
	private static void concat(int n) {
		
		for (int i = 1; i <= n / 2; i++) {
			count++;
			concat(i);
		}
		
	}
	
}
