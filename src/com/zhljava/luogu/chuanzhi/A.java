package com.zhljava.luogu.chuanzhi;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextInt();
		long b = in.nextInt();
		
		if (a == 0) {
			System.out.println(0);
		} else {
			if (b > 0) {
				System.out.println(1 * Math.abs(a));
			} else {
				System.out.println(-1 * Math.abs(a));
			}
			
		}
		
	}

}
