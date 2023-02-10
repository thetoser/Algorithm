package com.zhljava.luogu.stage01.part1_3;

import java.util.Scanner;

public class PNum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String n0 = scanner.nextLine();
		String str = scanner.nextLine();
		int n = Integer.parseInt(n0);
		
		String[] strs = str.split(" ");
		//ѡ������
		for (int i = 0; i < strs.length - 1; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				
				int len = strs[i].length() > strs[j].length() 
						? strs[j].length() : strs[i].length();
				
				String temp = " ";
				for (int k = 0; k < len; k++) {
					if (strs[i].charAt(k) < strs[j].charAt(k)) {
						temp = strs[i];
						strs[i] = strs[j];
						strs[j] = temp;
						temp = "";
						break;
					} else if (strs[i].charAt(k) > strs[j].charAt(k) ) {
						temp = "";
						break;
					}
				}
				// ǰ��λ����ͬ
				if (" ".equals(temp) && strs[i].length() == len) {
					
					if (strs[j].charAt(0) < strs[j].charAt(len)) {
						temp = strs[i];
						strs[i] = strs[j];
						strs[j] = temp;
					}
				} else if (" ".equals(temp) && strs[j].length() == len) {
					
					if (strs[i].charAt(0) > strs[i].charAt(len)) {
						temp = strs[i];
						strs[i] = strs[j];
						strs[j] = temp;
					}
				}
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i]);
		}
		System.out.println(sb);
	}

}
