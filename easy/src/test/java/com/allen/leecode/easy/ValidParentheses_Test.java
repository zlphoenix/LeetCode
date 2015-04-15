package com.allen.leecode.easy;

import com.allen.leecode.easy.easy.ValidParentheses_20;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/16上午12:56-zhoulun</p>
 */
public class ValidParentheses_Test {
    ValidParentheses_20 v = new ValidParentheses_20();


    @Test
    public void testParentheses() {
        System.out.printf("(%d,)%d,[%d,]%d,{%d,}%d,%c,%c\n",
                (int) '(', (int) ')',
                (int) '[', (int) ']',
                (int) '{', (int) '}',
                92, 124);
    }

    @Test
    public void testEmpty() {
        Assert.assertTrue(v.isValid(null));
        Assert.assertTrue(v.isValid(""));
        Assert.assertFalse(v.isValid("("));
        Assert.assertFalse(v.isValid(")"));
        Assert.assertTrue(v.isValid("()"));
        Assert.assertTrue(v.isValid("()"));
        Assert.assertFalse(v.isValid(")("));
        Assert.assertFalse(v.isValid(")()"));
        Assert.assertTrue(v.isValid("()[]"));
        Assert.assertTrue(v.isValid("()[]{}"));
        Assert.assertTrue(v.isValid("()([]{})"));
        Assert.assertFalse(v.isValid("([)]"));
    }

}
