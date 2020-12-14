package com.spm.om.utils;

import com.spm.om.vo.base;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.util.StringUtils;

/**
 * @author skyqlc
 * @name com.spm.om.utils
 * @create 2020/08/28:22:31
 */
public class stringUtils {
    public static boolean isEmpty(CharSequence str) {
        return (str == null || str.length() == 0);
    }

    public static boolean isNotEmpty ( CharSequence  str) {
        return !isEmpty(str);
    }

    /*isEmpty  isBlank  结论
    通过以上代码对比我们可以看出: qiuling
      1.isEmpty 没有忽略空格参数,是以是否为空和是否存在为判断依据。
      2.isBlank 是在isEmpty的基础上进行了为空(字符串都为空格,制表符,tab的情况)的判断.(一般更为常用)
    大家可以看下面的例子去体会一下
            StringUtils.isEmpty("yyy") = false
            StringUtils.isEmpty("")    = true
            StringUtils.isEmpty("  ")  = false

            StringUtils.isBlank("yyy") = false
            StringUtils.isBlank("")    = true
   */
    public static boolean isBlank(String str) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                // 判断字符是否为空格、制表符、tab
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {
        String bg="EBG";
        // System.out.println(base.BGLIST);
        if(bg.equals(base.EBG)){
            System.out.println("相等 ：" + bg);
        }
    }
}
