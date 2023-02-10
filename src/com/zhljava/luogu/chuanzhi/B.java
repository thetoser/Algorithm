package com.zhljava.luogu.chuanzhi;

import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}
		
		int i = a.length - 1;
		int j = b.length - 1;
		int k = 2;
		int[] arr = new int[2];
		while (i >= 0 && j >= 0) {
			if (i > j) {
				arr[1] = 1;
				a[i] += b[j];
				if (a[i] >= k) {
					a[i] %= k;
					if (i != 0) {
						a[i-1]++;
					} else {
						arr[0] = 1;
					}
				}
				i--;
				j--;
				k++;
			} else {
				b[j] += a[i];
				if (b[j] >= k) {
					b[j] %= k;
					if (j != 0) {
						b[j-1]++;
					} else {
						arr[0] = 1;
					}
				}
				i--;
				j--;
				k++;
			}
		}
		
		k = 2;
		if (i < 0) {
			for (int l = b.length - 1; l >= 0; l--) {
				if (b[l] >= k) {
					b[l] %= k;
					if (l != 0) {
						b[l-1]++;
					} else {
						arr[0] = 1;
					}
				}
				k++;
			}
		} else {
			for (int l = a.length - 1; l >= 0; l--) {
				if (a[l] >= k) {
					a[l] %= k;
					if (l != 0) {
						a[l-1]++;
					} else {
						arr[0] = 1;
					}
				}
				k++;
			}
		}
		
		if (arr[0] == 1) {
			System.out.print(1 + " ");
			if (arr[1] == 1) {
				for (int l = 0; l < a.length; l++) {
					System.out.print(a[l] + " ");
				}
			} else {
				for (int l = 0; l < b.length; l++) {
					System.out.print(b[l] + " ");
				}
			}
		} else {
			if (arr[1] == 1) {
				for (int l = 0; l < a.length; l++) {
					System.out.print(a[l] + " ");
				}
			} else {
				for (int l = 0; l < b.length; l++) {
					System.out.print(b[l] + " ");
				}
			}
		}
		
	}

}
