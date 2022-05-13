package com.allen.leecode.easy.array;


/***
 * https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * 直接暴力试试
 * 过了。
 */
public class FindNumIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        for (int[] inner : matrix) {
            if (inner.length == 0) {
                continue;
            }
            if (target >= inner[0] && target <= inner[inner.length - 1]) {
                for (int i : inner) {
                    if (i == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
