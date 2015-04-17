package com.allen.leecode.easy;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/17下午8:32-zhoulun</p>
 */
public class NumberOfOneBits {
    public int hammingWeight(int n) {

        int oneBitCount = 0;
        while (n != 0) {
            int lastBit = n & 0x1;
            if(lastBit!=0)
            {
                oneBitCount++;
            }
            n =n>>>1;//无符号右移
        }
        return oneBitCount;
    }

}
