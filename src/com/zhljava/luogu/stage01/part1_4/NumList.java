package com.zhljava.luogu.stage01.part1_4;

import java.util.Scanner;

public class NumList {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int d = a2 - a1;
		
		int n = scanner.nextInt();
		
		System.out.println((long) (n * a1 + n * (n-1) * d / 2));
		
	}

}
