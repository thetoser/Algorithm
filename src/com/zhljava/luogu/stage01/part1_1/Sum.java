package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		double s = 0;
		
		for (int i = 1; ; i++) {
			s += (1.0 / i);
			
			if (s > k) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
