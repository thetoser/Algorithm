package com.zhljava.luogu.new_stu;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double total = in.nextDouble();
		
		int[] vis = new int[n];
		double[] count = new double[n];
		double[] price = new double[n];
		double[] single = new double[n];
		for (int i = 0; i < n; i++) {
			count[i] = in.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			price[i] = in.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			single[i] = price[i] / count[i];
		}
		
		double ans = 0;
			
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (single[max] < single[i]) {
				max = i;
			}
		}
		
		while (true) {
			if (count[max] <= total) {
				ans += price[max];
				total -= count[max];
				
				vis[max] = 1;
				for (int i = 0; i < n; i++) {
					if (vis[i] != 1) {
						max = i;
						break;
					}
				}
				for (int i = 0; i < n; i++) {
					if (vis[i] != 1 && single[max] < single[i]) {
						max = i;
					}
				}
			} else {
				ans += price[max] * total / count[max];
				break;
			}	
		}
		
		System.out.printf("%.2f", ans);
	}

}
