package com.zhljava.luogu.stage01.part1_3;

import java.util.Scanner;

public class ReverseDate {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int date1 = scanner.nextInt();
		int date2 = scanner.nextInt();
		
		int count = 0;
		
		for (int i = date1; i <= date2; i++) {
			StringBuilder sb = new StringBuilder(i + "");
			StringBuilder sb0 = new StringBuilder(i + "");
			sb.reverse();

			if (date1 == date2) {
				// ת����String �ٱȽϣ���������
				if (sb.toString().equals(sb0.toString())) {
					count += 2; //�����������ڱ���
				}
				break;
			}
			// ת����String �ٱȽϣ���������
			if (sb.toString().equals(sb0.toString())) {
				count++;
			}
			
			int month = i / 100 % 100;
			switch (month) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (i % 100 == 30) {
						StringBuilder temp = new StringBuilder(i + "");
						temp.setCharAt(6, '0');
						temp.setCharAt(7, '0');
						if (month == 9) {
							temp.setCharAt(4, '1');
							temp.setCharAt(5, '0');
						} else if (month == 11) {
							temp.setCharAt(4, '1');
							temp.setCharAt(5, '2');
						} else {
							temp.setCharAt(5, ((month+1) + "").charAt(0));
						}
						
						i = Integer.parseInt(temp.toString());
					}
					break;
				case 2:
					if (i % 100 == 29) {
						StringBuilder temp = new StringBuilder(i + "");
						temp.setCharAt(6, '0');
						temp.setCharAt(7, '0');
						temp.setCharAt(5, '3');
						
						i = Integer.parseInt(temp.toString());
					} else if (i % 100 == 28) {
						int year = i / 10000;
						if (!(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
							StringBuilder temp = new StringBuilder(i + "");
							temp.setCharAt(6, '0');
							temp.setCharAt(7, '0');
							temp.setCharAt(5, '3');
							
							i = Integer.parseInt(temp.toString());
						}
					}
					
					break;
				default:
					if (i % 100 == 31) {
						StringBuilder temp = new StringBuilder(i + "");
						temp.setCharAt(6, '0');
						temp.setCharAt(7, '0');
						if (month == 10) {
							temp.setCharAt(4, '1');
							temp.setCharAt(5, '1');
						} else if (month == 12) {
							temp.setCharAt(4, '0');
							temp.setCharAt(5, '1');
							
							int year = i / 10000;
							year++;
							temp.replace(0, 4, year + "");
						} else {
							temp.setCharAt(5, ((month+1) + "").charAt(0));
						}
						
						i = Integer.parseInt(temp.toString());
					}
			}
			
		}
		
		System.out.println(count);
	}

}
