package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		String x = scanner.next();
		char X = x.charAt(0);
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			String num = i + "";
			for (int j = 0; j < num.length(); j++) {
				if (num.charAt(j) == X) count++;
			}
		}
		
		System.out.println(count);
	}
	
}
