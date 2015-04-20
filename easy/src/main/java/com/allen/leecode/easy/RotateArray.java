package com.allen.leecode.easy;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/17下午9:13-zhoulun</p>
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {

        if(nums ==null||nums.length<=1||k<=0)
            return;

        if(k>nums.length)
        {
            k%=nums.length;
        }

    }

}
