package com.zhljava.leetbook.string;

/**
 * 最长公共前缀
 */
public class CommonPrefix {
//    编写一个函数来查找字符串数组中的最长公共前缀。
//    如果不存在公共前缀，返回空字符串 ""。
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        //String[] str = {"dog", "cat", "car"};
        String prefix = longestCommonPrefix(str);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int count = 0; //公共前缀数量
        String s = strs[0];
        int min = s.length();
        for (int i = 1; i < strs.length; i++) { //得出最短的字符串长度
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
            int key = 1; //判断是否是公共字符
            for (int j = 1; j < strs.length; j++) {
                if (s.charAt(i) == strs[j].charAt(i)) { //和每一个字符串的字符比较
                    key++;
                }
            }
            if (key / strs.length == 1) { //按顺序比较 和其他所有字符串的字符相同
                count++;
            } else {
                break;
            }
        }
        if (count != 0) {
            String prefix = "";
            for (int i = 0; i < count; i++) {
                prefix += s.charAt(i); //把公共字符拼接
            }
            return prefix;
        }
        return "";
    }
}
