package com.zhljava.leetbook.string;

/**
 * 翻转字符串里的单词
 */
public class ReverseWords {
//    给你一个字符串 s ，颠倒字符串中 单词 的顺序。
//    单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
//    返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
//    注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。
//    返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
    public static void main(String[] args) {
        String s = " a good  example";
        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);
    }

    public static String reverseWords(String s) {
        if (!s.contains(" ")) { //只有一个单词
            return s;
        }
        String[] strings = s.split(" ");
        //双指针交换位置
        String temp = "";
        for (int i = 0, j = strings.length - 1; i < strings.length / 2; i++, j--) {
            temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
        }
        //考虑时间复杂度和空间复杂度，用StringBuilder
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (!"".equals(strings[i])) {
                reverse.append(strings[i]);
                //如果字符串第一个单词前面有空格，最后输出结果行尾会多一个空格
                if (i != strings.length - 1) {
                    reverse.append(" ");
                }
            }
        }
        String reverseWords = reverse.toString();
        if (reverse.charAt(reverseWords.length() - 1) == 32) { //行尾多出的空格
            char[] chars = reverseWords.toCharArray();
            return new String(chars, 0, chars.length - 1);
        }
        return reverseWords;
    }
}
