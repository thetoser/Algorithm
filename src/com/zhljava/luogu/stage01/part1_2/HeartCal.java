package com.zhljava.luogu.stage01.part1_2;

import java.util.Scanner;

public class HeartCal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {	
		out:for (int j = 0; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					
					if (j != i && k != i) {
						if (arr[i] == arr[j] + arr[k]) {
							count++;
							break out;
						}
					}
					
				}
			}
		}
		
		System.out.println(count);
	}
	
}
