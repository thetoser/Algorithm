package com.zhljava.leetbook.linkedlist;

public class RemoveElements {
//    给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足
//    Node.val == val 的节点，并返回 新的头节点 。
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode p = head;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}
