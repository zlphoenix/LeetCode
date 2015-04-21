package com.allen.leecode.medium;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/21下午11:16-zhoulun</p>
 */
public class LinkedList {
    Node head;
    Node tail;

    @Override
    public String toString() {

        if(head ==null)return "null";

        Node curr = head;
        while (curr!= null)
        {
            System.out.print(curr.value);
            curr = curr.next;
        }
        System.out.println();
        return null;
    }

    public void add(char c) {

        Node newTail = new Node(c);
        if (head == null) {
            head = newTail;
        } else {
            tail.next = newTail;
        }
        tail = newTail;
    }

    public char remove() {

        char result = (char) 0;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }
}
