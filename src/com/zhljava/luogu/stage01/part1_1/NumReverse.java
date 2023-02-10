package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class NumReverse {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		
		if (num.length() == 1 && num.charAt(0) == '0') {
			System.out.println(num);
			return;
		}
		
		StringBuilder sb = new StringBuilder(num);
		
		if (sb.charAt(0) == '-') {
			sb.delete(0, 1);
			sb.reverse();
			
			while (sb.charAt(0) == '0') {
				sb.delete(0, 1);
			}
			String res = "-" + sb;
			
			System.out.println(res);
		} else {
			sb.reverse();
			while (sb.charAt(0) == '0') {
				sb.delete(0, 1);
			}
			
			System.out.println(sb);
		}
		
	}

}
