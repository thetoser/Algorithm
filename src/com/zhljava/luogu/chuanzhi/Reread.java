package com.zhljava.luogu.chuanzhi;

import java.util.*;

public class Reread {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		String str = "";
	out:for (int i = 0; ; i++) {
			str = in.next();
			if ("0".equals(str)) break;
			
			for (int j = 0; j < map.size(); j++) {
				if (str.equals(map.get(j))) continue out;
			}
			map.put(i, str);
		}
		
		for (int i = 0; i < map.size(); i++) {
			System.out.print(map.get(i));
		}
		
	}

}
