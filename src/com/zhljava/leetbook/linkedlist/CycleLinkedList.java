package com.zhljava.leetbook.linkedlist;

import java.util.HashSet;

public class CycleLinkedList {
    /**
     * 给你一个链表的头节点 head ，判断链表中是否有环。
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     * 如果链表中存在环，则返回 true 。 否则，返回 false 。
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        while (true) {
            if (fast == null || fast.next == null) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 给定一个链表的头节点 head，返回链表开始入环的第一个节点。如果链表无环，则返回null。
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     * 不允许修改链表。
     */
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        if (head == null || head.next == null) {
            return null;
        }
        while (head.next != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }

    public ListNode cycleDouble(ListNode head) {
        ListNode slow = head, fast = head;
        //快慢指针相遇
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //第一次相遇退出循环
            if (slow == fast) break;
        }
        //判断是否有环
        if (fast == null || fast.next == null) return null;
        //有环则将fast移动至head并移动S2距离
        fast = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
