package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class BuyPencil {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		int innerCount1 = scanner.nextInt();
		int price1 = scanner.nextInt();
		int temp = count / innerCount1;
		int count1 = count % innerCount1 == 0 ? temp : temp + 1;
		int totalPrice = count1 * price1;
		
		int innerCount2 = scanner.nextInt();
		int price2 = scanner.nextInt();
		temp = count / innerCount2;
		int count2 = count % innerCount2 == 0 ? temp : temp + 1;
		if (count2 * price2 < totalPrice) {
			totalPrice = count2 * price2;
		}
		
		int innerCount3 = scanner.nextInt();
		int price3 = scanner.nextInt();
		temp = count / innerCount3;
		int count3 = count % innerCount3 == 0 ? temp : temp + 1;
		if (count3 * price3 < totalPrice) {
			totalPrice = count3 * price3;
		}
		
		System.out.println(totalPrice);
	}
	
}
