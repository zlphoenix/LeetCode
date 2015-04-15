package com.allen.leecode.easy.easy;

import java.util.Stack;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/16上午12:49-zhoulun</p>
 */
public class ValidParentheses_20 {
    private boolean isMatch(char pre, char post) {
        return pre == '(' && post == ')' ||
                pre == '[' && post == ']' ||
                pre == '{' && post == '}';
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        if (s.length() % 2 == 1) return false;


        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char post = s.charAt(i);
            if (stack.size() == 0) {
                stack.push(post);
                continue;
            }
            if (isMatch(stack.peek(), post)) {
                stack.pop();
            } else {
                stack.push(post);
            }
        }
        return stack.size() == 0;
    }

}
