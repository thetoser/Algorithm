package com.zhljava.luogu.stage01.part1_3;

import java.util.Scanner;
import java.util.ArrayList;

public class InputWord {
	
	private static void inputWord(StringBuilder sb) {
		if (sb.length() != 0) {
			while (sb.charAt(0) == '<') {
				sb.delete(0, 1);
				if (sb.length() == 0) break;
			}
			
			for (int i = 1; i < sb.length(); i++) {
				if (sb.charAt(i) == '<') {
					sb.delete(i - 1, i + 1);
					i -= 2; // ɾ���� i Ҫ����
				}
				
				if (sb.length() != 0) { // ��������� <
					while (sb.charAt(0) == '<' && i == -1) {
						sb.delete(0, 1);
						if (sb.length() == 0) break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		String str;
		ArrayList<StringBuilder> strs1 = new ArrayList<>();
		ArrayList<StringBuilder> strs2 = new ArrayList<>();
		
		while (true) { // ����Ҳ���˸��......
			str = scanner.nextLine();
			if ("EOF".equals(str)) {
				break;
			}
			StringBuilder sb = new StringBuilder(str);
			inputWord(sb);
			
			strs1.add(sb);
		}
		
		while (true) {
			str = scanner.nextLine();
			if ("EOF".equals(str)) {
				break;
			}
			StringBuilder sb = new StringBuilder(str);
			inputWord(sb);
			
			strs2.add(sb);
		}
		
		if (strs1.size() != 0 && strs2.size() != 0) {
			int size = strs1.size() > strs2.size() ? strs2.size() : strs1.size();
			
			for (int i = 0; i < size; i++) {
				StringBuilder text = strs1.get(i);
				StringBuilder input = strs2.get(i);
				
				if (text.length() != 0 && input.length() != 0) {
					int len = text.length() > input.length() ? input.length() : text.length();
					for (int j = 0; j < len; j++) {
						if (text.charAt(j) == input.charAt(j)) {
							count++;
						}
					}
				}
			}
		}
		
		int time = scanner.nextInt();
		System.out.println(Math.round(count * 60.0 / time));
	}

}
