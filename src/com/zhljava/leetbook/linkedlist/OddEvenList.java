package com.zhljava.leetbook.linkedlist;

/**
 * 给定单链表的头节点head，将所有索引为奇数的节点和索引为偶数的节点
 * 分别组合在一起，然后返回重新排序的列表。
 * 第一个节点的索引被认为是 奇数 ， 第二个节点的索引为偶数 ，以此类推。
 * 请注意，偶数组和奇数组内部的相对顺序应该与输入时保持一致。
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head, eHead = head.next, even = head.next;
        while (odd.next != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            even = even.next;
            odd = odd.next;
        }
        odd.next = eHead; //连接奇偶链表
        return head;
    }
}
