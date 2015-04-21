package com.allen.leecode.easy;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/21上午9:21-zhoulun</p>
 */ //    Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode build(int[] values) {
        ListNode resut = null;
        ListNode curr = null;
        for (int i = 0; i < values.length; i++) {
            ListNode next = new ListNode(values[i]);
            if (resut == null) {
                resut = next;
                curr = next;
            } else {
                curr.next = next;
                curr = next;
            }
        }
        return resut;
    }

    @Override
    public boolean equals(Object target) {
        return equals((ListNode) target);
    }

    public boolean equals(ListNode target) {
        if (target == null) return false;

        return this.toString().equals(target.toString());
    }

    @Override
    public String toString() {
        return this.val + (next == null ? "" : "," + next.toString());
    }
}
