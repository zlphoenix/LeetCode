package com.allen.leecode.easy;

import java.util.HashMap;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/18上午10:26-zhoulun</p>
 * <p/>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p/>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p/>
 * You may assume that each input would have exactly one solution.
 * <p/>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {
    //使用算法复杂是o(N)平方复杂度的算法一定导致超时,必须使用o(N)的算法
    //最多一趟循环就能获得结果的话,需要在记录当前值需要一个什么样的值才能得到这个目标值
    //HashMap 用来存这个当前值对应的另一半数值,如果发现 Map 还没有就讲自己的 index 记录下来
    //如果发现存在了,说明当前数值可以求得这个和,找到 hashMap 的 Value 就是之前保存的 index, 当前值作为结果即可
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] results = new int[2];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                results[0] = index + 1;
                results[1] = i + 1;
                break;
            } else {

                map.put(target - numbers[i], i);
            }
        }
        return results;
    }

}
