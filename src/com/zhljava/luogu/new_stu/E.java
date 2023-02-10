package com.zhljava.luogu.new_stu;

import java.util.Scanner;

public class E {

	private static int count, n, m;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		dfs(0, "");
		System.out.println(count);
	}
	
	private static void dfs(int k, String num) {
		if (k == n) {
			if (Integer.parseInt(num) % m == 0) {
				count++;
			}
			
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			dfs(k + 1, num + i);
		}
		
	}

}
