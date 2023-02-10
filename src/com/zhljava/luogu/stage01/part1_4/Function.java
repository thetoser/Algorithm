package com.zhljava.luogu.stage01.part1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		ArrayList<int[]> list = new ArrayList<>();
		int ans;
		
		while (true) {
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = scanner.nextInt();
			}
			
			if (arr[0] == -1 && arr[1] == -1 && arr[2] == -1) {
				break;
			}
			
			list.add(arr);
		}
		
		for (int i = 0; i < list.size(); i++) {
			int[] arr = list.get(i);
			
			ans = w(arr[0], arr[1], arr[2]);
			System.out.printf("w(%d, %d, %d) = %d\n", arr[0], arr[1], arr[2], ans);
		}
		
	}
	
	private static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		} else if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		} else if (a < b && b < c) {
			return w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		} else {
			return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
		
	}

}
