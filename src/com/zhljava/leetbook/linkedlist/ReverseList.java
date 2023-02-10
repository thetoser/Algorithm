package com.zhljava.leetbook.linkedlist;

public class ReverseList {
    //给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head, q;
        while (p.next != null) {
            q = p.next;
            p.next = q.next;
            q.next = head;
            head = q;
        }
        return head;
    }
}
