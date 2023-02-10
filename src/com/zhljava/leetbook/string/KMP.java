package com.zhljava.leetbook.string;

public class KMP {
//    给你两个字符串haystack 和 needle ，请你在 haystack 字符串中
//    找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
    public static void main(String[] args) {
        String haystack = "abadabababdabadabcc";
        String needle = "abadabc";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int len = haystack.length(), i = 0;
        int len1 = needle.length(), j = 0;

        int[] next = nextBuilder(needle);
        while (i < len && j < len1) {
            if (j < 0 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];//不相等时，模式串指针回溯
            }
        }
        if (j == len1) {
            return i - j;
        } else return -1;
    }

    public static int[] nextBuilder(String needle) {
        //abadabc
        //next                      i   j
        //{-1, 0, 0, 0, 0, 0, 0}    0   1
        //{-1, 0, 0, 0, 0, 0, 0}   -1   1
        //{-1, 0, 0, 0, 0, 0, 0}    0   2
        //{-1, 0, 0, 1, 0, 0, 0}    1   3
        //{-1, 0, 0, 1, 0, 0, 0}    0   3
        //{-1, 0, 0, 1, 0, 0, 0}   -1   3
        //{-1, 0, 0, 1, 0, 0, 0}    0   4
        //{-1, 0, 0, 1, 0, 1, 0}    1   5
        //{-1, 0, 0, 1, 0, 1, 2}    2   6
        int len = needle.length();
        int[] next = new int[len];
        next[0] = -1;
        int i = -1, j = 0;
        while (j < len - 1) {
            if (i < 0 || needle.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                next[j] = i;
            } else {
                i = next[i];
            }
        }
        return next;
    }
}
