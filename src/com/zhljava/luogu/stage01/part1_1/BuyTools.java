package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class BuyTools {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int yuan = scanner.nextInt();
		int jiao = scanner.nextInt();
		
		double money = yuan + jiao * 0.1;
		
		double price = 1.9;
		
		System.out.println((int) (money / price));
	}
}
