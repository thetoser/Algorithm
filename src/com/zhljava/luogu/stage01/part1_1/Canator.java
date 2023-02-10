package com.zhljava.luogu.stage01.part1_1;

import java.util.Scanner;

public class Canator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int row  = 1, col = 1, count = 1;
		outer:for (int i = 1; ; i++) {
			
			if (i % 2 != 0) {
				while (row > 0) {
					
					if (count == n) break outer;
					
					row--;
					col++;
					count++;
					
					if (row == 0) {
						row++;
						break;
					}
				}
			} else {
				while (row > 0) {
					
					if (count == n) break outer;
					
					row++;
					col--;
					count++;
					
					if (col == 0) {
						col++;
						break;
					}
				}
			}
			
		}
		
		System.out.println(row + "/" + col);
	}
	
}
