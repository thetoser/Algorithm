package com.zhljava.leetbook.queue;

import java.util.Arrays;

public class MyCircularQueue {

    int[] data;
    int head = -1, tail = -1;
    //int size;

    //构造器，设置队列长度为 k 。
    public MyCircularQueue(int k) {
        data = new int[k];
        Arrays.fill(data, -1);
    }

    //向循环队列插入一个元素。如果成功插入则返回真。
    public boolean enQueue(int value) {
        if (!isFull()) {
            if (head == -1) head++;
            tail++;
            tail %= data.length;
            data[tail] = value;
            return true;
        }
        return false;
    }
    //从循环队列中删除一个元素。如果成功删除则返回真。
    public boolean deQueue() {
        if (!isEmpty()) {
            data[head] = -1;
            head++;
            head %= data.length;
            return true;
        }
        return false;
    }

    //从队首获取元素。如果队列为空，返回 -1 。
    public int Front() {
        if (isEmpty()) return -1;
        return data[head];
    }

    //获取队尾元素。如果队列为空，返回 -1 。
    public int Rear() {
        if (isEmpty()) return -1;
        return data[tail];
    }

    public boolean isEmpty() {
        for (int i : data) {
            if (i != -1) return false;
        }
        return true;
    }

    public boolean isFull() {
        for (int i : data) {
            if (i == -1) return false;
        }
        return true;
    }
}
