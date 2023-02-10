package com.zhljava.leetbook.linkedlist;

/**
 * 相交链表
 */
public class IntersectionList {
//    给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
//    如果两个链表不存在相交节点，返回 null 。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aNode = headA, bNode = headB;
        int count = 0;
        while(aNode != null && bNode != null) {
            if(aNode == bNode) {
                return aNode;
            }
            aNode = aNode.next;
            bNode = bNode.next;
            if(count < 2 && aNode == null) {
                aNode = headB;
                count++;
            }
            if(count < 2 && bNode == null) {
                bNode = headA;
                count++;
            }
        }
        return null;
    }
}
