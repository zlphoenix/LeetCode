package com.allen.leecode.easy;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/20下午10:35-zhoulun</p>
 */
public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode current = null;
        int carry = 0;
        while (true) {


            int newValue = 0;
            if (l1 != null) {
                newValue += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                newValue += l2.val;
                l2 = l2.next;
            }
            newValue += carry;

            if (newValue >= 10) {
                newValue -=10 ;
                carry = 1;
            }
            else
            {
                carry =0;
            }

            ListNode newNode = new ListNode(newValue);
            if (result == null) {
                result = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }

            if (l1 == null && l2 == null && carry == 0)
                break;
        }

        return result;
    }
}
