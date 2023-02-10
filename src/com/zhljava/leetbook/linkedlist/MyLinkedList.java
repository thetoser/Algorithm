package com.zhljava.leetbook.linkedlist;

/**
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：
 * val和next。val是当前节点的值，next是指向下一个节点的指针/引用。
 * 如果要使用双向链表，则还需要一个属性prev以指示链表中的上一个节点。
 * 假设链表中的所有节点都是 0-index 的。
 */
public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtIndex(0, 10);
        linkedList.addAtIndex(0, 20);   //链表变为20-> 10
        linkedList.addAtIndex(1, 30);   //链表变为20-> 30-> 10
        System.out.println(linkedList.get(0));
    }

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
    }

    //获取链表中第 index 个节点的值。如果索引无效，则返回-1。
    public int get(int index) {
        if (index < 0 || index >= size || head == null) return -1;
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.val;
    }

    //在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    //将值为 val 的节点追加到链表的最后一个元素。
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head = node;
        } else {
            Node p = head;
            for (int i = 0; i < size - 1; i++) {
                p = p.next;
            }
            p.next = node;
        }
        size++;
    }

    //在链表中的第index个节点之前添加值为val 的节点。
    //如果index等于链表的长度，则该节点将附加到链表的末尾。
    //如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index > size) {
            return;
        } else if (index <= 0) {
            addAtHead(val);
        } else {
            Node node = new Node(val);
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            node.next = p.next;
            p.next = node;
            size++;
        }

    }

    //如果索引 index 有效，则删除链表中的第 index 个节点。
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size || head == null) return;
        Node p = head;
        if (index == 0) {
            head = p.next;
            p.next = null;
        } else {
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            Node q = p.next;
            p.next = q.next;
            q.next = null;
        }
        size--;
    }
}
