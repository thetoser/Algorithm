package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class SaveMoney {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[12];
		int save = 0;
		int balance = 0;
		int total = 0;
		
		for (int i = 0; i < 12; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 12; i++) {
			balance += 300;
			
			if (balance - arr[i] < 0) {
				System.out.println("-" + (i+1));
				return;
			}
			
			balance -= arr[i];
			total = balance / 100;
			if (total > 0) {
				save += (total * 100);
				balance -= (total * 100);
			}
		}
		
		System.out.println((int) (balance + save * 1.2));
	}
}
