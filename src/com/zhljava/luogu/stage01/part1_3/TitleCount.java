package com.zhljava.luogu.stage01.part1_3;

import java.util.Scanner;

public class TitleCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (i != str.length()-1 && (str.substring(i, i+2)).equals("\\n")) {
				i++;
				continue;
			}
			if (str.charAt(i) == ' ') {
				continue;
			}
			
			count++;
		}
		
		System.out.println(count);
	}
	
}
