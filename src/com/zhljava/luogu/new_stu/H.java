package com.zhljava.luogu.new_stu;

import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int count = 0;
		int[][] arr = new int[a][3];
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < arr[i][0]; j++) {
				for (int j2 = 0; j2 < arr[i][1]; j2++) {
					int ys = j % j2;
					while (ys != 0) {
						j = j2;
						j2 = ys;
						ys = j % j2;
					}
					if (j2 % arr[i][2] == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
	}

}
