package com.zhljava.luogu.stage01.part1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumGame {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; ; i++) {
			int num = scanner.nextInt();
			if (num == 0) break;
			
			list.add(num);
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
			if (i != 0) {
				System.out.print(" ");		
			}
		}
		
	}

}
