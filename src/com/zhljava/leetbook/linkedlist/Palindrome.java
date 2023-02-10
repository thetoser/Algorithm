package com.zhljava.leetbook.linkedlist;

/**
 * 回文链表
 */
public class Palindrome {
//    给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。
//    如果是，返回 true ；否则，返回 false 。
    public boolean isPalindrome(ListNode head) {
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        //反转链表前半部分，找到中间节点
        while (fast != null && fast.next != null) {
            ListNode temp = slow.next;
            if (pre != null) {
                slow.next = pre;
            }
            pre = slow;
            fast = fast.next.next;
            slow = temp;
        }
        //链表总长度是奇数，把slow移动到中间节点
        if (fast != null) slow = slow.next;
        while (slow != null) { //从链表中间开始比较
            if (slow.val != pre.val) return false;
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
