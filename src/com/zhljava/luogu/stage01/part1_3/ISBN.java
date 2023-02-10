package com.zhljava.luogu.stage01.part1_3;

import java.util.Scanner;

public class ISBN {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		String[] strs = str.split("-");
		int res = Integer.parseInt(strs[0]);
		
		for (int i = 0; i < 3; i++) {
			res += Integer.parseInt(strs[1].charAt(i) + "") * (i+2);
		}
		
		for (int i = 0; i < 5; i++) {
			res += Integer.parseInt(strs[2].charAt(i) + "") * (i+5);
		}
		
		res = res % 11;
		if ("X".equals(strs[3])) {
			
			if (res == 10) {
				System.out.println("Right");
			} else {
				strs[3] = res + "";
				String str0 = "";
				for (int i = 0; i < 4; i++) {
					str0 += strs[i];
					if (i != 3) {
						str0 += "-";
					}
				}
				
				System.out.println(str0);
			}
		} else {
			if (res == Integer.parseInt(strs[3])) {
				System.out.println("Right");
			} else {
				
				if (res == 10) {
					strs[3] = "X";
				} else {
					strs[3] = res + "";
				}
				
				String str0 = "";
				for (int i = 0; i < 4; i++) {
					str0 += strs[i];
					if (i != 3) {
						str0 += "-";
					}
				}
				
				System.out.println(str0);
			}
		} 
	}

}
