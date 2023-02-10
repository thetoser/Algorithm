package com.zhljava.luogu.stage01.part1_3;

import java.util.Scanner;

public class CountWord {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		int len = 0, count = 0, first = 0;
		
		String[] strs = str2.split(" ");
		
		for (int i = 0; i < strs.length; i++) {
			if (str1.equalsIgnoreCase(strs[i])) {
				if (count == 0) first = len;
				
				count++;
			}
			len += strs[i].length() + 1;
		}
		
		if (count == 0) {
			System.out.println(-1);
		} else {
			System.out.println(count + " " + first);
		}
	}

}
