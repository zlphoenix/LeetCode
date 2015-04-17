package com.allen.leecode.easy;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/17下午8:56-zhoulun</p>
 */
public class ReverseBits {
    public int reverseBits(int n) {

        int result = 0;
        for (int i = 0; i < 32; i++) {
            int lastBit = n & 0x1;
            n = n >>> 1;//无符号右移

            if (result != 0) {
                result <<= 1;
            }
            if (lastBit != 0)
                result |= lastBit;
        }
        return result;
    }
}
