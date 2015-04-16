package com.allen.leecode.easy;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/16上午12:56-zhoulun</p>
 */
public class Easy_Test {
    ValidParentheses v = new ValidParentheses();


    @Test
    public void testParentheses() {
        System.out.printf("(%d,)%d,[%d,]%d,{%d,}%d,%c,%c\n",
                (int) '(', (int) ')',
                (int) '[', (int) ']',
                (int) '{', (int) '}',
                92, 124);
    }

    @Test
    public void testValidParentheses() {
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

    @Test
    public void testAscIIInt() {
        System.out.printf("%d,%d,%d", (int) '1', (int) '9', (int) '0');
    }

    @Test
    public void testCountAndSay() {

        Map<Integer, String> result = new HashMap<Integer, String>(8);
        result.put(1, "1");
        result.put(2, "11");
        result.put(3, "21");
        result.put(4, "1211");
        result.put(5, "111221");
        result.put(6, "312211");
        result.put(7, "13112221");
        result.put(8, "1113213211");
        CountAndSay action = new CountAndSay();
        for (Integer integer : result.keySet()) {
String r=action.countAndSay(integer);
            Assert.assertTrue(integer.toString()+","+r,
                    r.equals( result.get(integer)));
        }


    }
}
