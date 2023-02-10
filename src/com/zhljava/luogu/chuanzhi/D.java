package com.zhljava.luogu.chuanzhi;

import java.util.*;

public class D {
	
	 private static int m, ans;
	 private static int[] arr, temp;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		m = in.nextInt();
		
		arr = new int[n];
		temp = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();	
		}
		
		Arrays.sort(arr);
		ans = arr[arr.length-1] - arr[0];
		dfs(0, ans);
		System.out.println(ans);
	}
	
	private static void dfs(int k, int sub) {
		if (k == m) {
			if (sub < ans) {
				ans = sub;
			}
			return;
		}
		
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				temp = Arrays.copyOf(arr, arr.length);
				arr[0] = arr[arr.length - 1];
				Arrays.sort(arr);
				dfs(k + 1, arr[arr.length-1] - arr[0]);
				arr = Arrays.copyOf(temp, arr.length);
			} else {
				temp = Arrays.copyOf(arr, arr.length);
				arr[arr.length-1] = arr[0];
				Arrays.sort(arr);
				dfs(k + 1, arr[arr.length-1] - arr[0]);
				arr = Arrays.copyOf(temp, arr.length);
			}
			
		}
		
	}

}
