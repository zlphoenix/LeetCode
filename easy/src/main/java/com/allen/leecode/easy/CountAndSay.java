package com.allen.leecode.easy;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称:leecode </p>
 * <p>Copyright (c) 2015, Inspur GSP All Rights Reserved.</p>
 * <p>修改记录1: 新建文件-15/4/16下午11:43-zhoulun</p>
 */
public class CountAndSay {

    public String countAndSay(int n) {

        if (n <= 0) return "";
        StringBuilder result = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder(2 * i);
            char pre = (char) 0;
            int count = 0;
            for (int j = 0; j < result.length(); j++) {

                char curr = result.charAt(j);

                if (pre == 0) {
                    pre = curr;
                }
                if (pre == curr)
                    count++;
                else {
                    sb.append(count);
                    sb.append(pre);
                    count = 1;
                    pre = curr;
                }
            }
            if(count!=0)
            {
                sb.append(count);
                sb.append(pre);
            }
            result =sb;
        }
        return result.toString();
    }

}
