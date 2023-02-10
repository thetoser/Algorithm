package com.zhljava.leetbook.linkedlist;

public class RemoveNode {
    //给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        //fast移n步，
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        //如果fast为空，表示删除的是头结点
        if (fast == null) return head.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //这里最终slow不是倒数第n个节点，他是倒数第n+1个节点，
        //他的下一个结点是倒数第n个节点,所以删除的是他的下一个结点
        slow.next = slow.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

