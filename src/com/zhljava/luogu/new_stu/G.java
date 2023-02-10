package com.zhljava.luogu.new_stu;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long b = in.nextLong();
		long k = in.nextLong();
		
		int count = 0;
		for (long i = a; i <= b; i++) {
			for (long j = 2; j <= k; j++) {
				if (i % j == 0) {
					if (j < k) {
						break;
					} else {
						count++;
					}
				}
					
			}
		}
		
		System.out.println(count);
	}

}
