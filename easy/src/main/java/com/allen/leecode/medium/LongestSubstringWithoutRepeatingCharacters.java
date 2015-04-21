package com.allen.leecode.medium;

import com.allen.leecode.Action;


/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/21下午9:56-zhoulun</p>
 */
public class LongestSubstringWithoutRepeatingCharacters implements Action {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) return s.length();

        int max = 0;
        int current = 0;
        LinkedList strQueue = new LinkedList();

        int[] bitMap = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            strQueue.add(c);
            if (bitMap[(int) c] != 1) {
                current++;
                bitMap[(int) c] = 1;
            } else {
                if (current > max) {
                    max = current;
                }
                char removed = strQueue.remove();
//                System.out.println("removing to "+c);
//                System.out.println("removing "+removed);
                while (removed != c) {
                    bitMap[(int)removed]=0;
//                    strQueue.toString();
                    removed = strQueue.remove();
                    current--;
                }

            }

        }
//        strQueue.toString();
        return current > max ? current : max;
    }
}
