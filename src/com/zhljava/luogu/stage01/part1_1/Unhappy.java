package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class Unhappy {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int day = 0;
		int maxTime = 0;
		
		for (int i = 0; i < 7; i++) {
			int time = scanner.nextInt();
			time += scanner.nextInt();
			
			if (time > 8 && maxTime < time) {
				day = i + 1;
				maxTime = time;
			}
		}
		
		System.out.println(day);
		
	}
	
}
