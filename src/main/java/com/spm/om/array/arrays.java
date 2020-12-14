package com.spm.om.array;



import com.spm.om.vo.User;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author skyqlc
 * @name com.spm.om.array
 * @create 2020/09/13:20:03
 */
public class arrays {
    /*数组是一种容器，可以同时存放多个数据值 */

    /*判断数组中是否包含某个值
     * 1.使用list
     * */
    public boolean useList(String[] arr, String targetvalue) {
        return Arrays.asList(arr).contains(targetvalue);
    }

    /*判断数组中是否包含某个值
     * 2.使用set
     * */
    public boolean useSet(String[] arr, String targetValue) {
        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        return set.contains(targetValue);
    }

    /*判断数组中是否包含某个值
     * 3.使用简单的循环
     * */
    public boolean useLoop(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue)) {
                return true;
            }
        }
        return false;
    }

   /* 使用ArrayUtils:
    Apache Commons类库中还提供了一个ArrayUtils类，可以使用其contains方法判断数组和值的关系
    显然，使用一个简单的循环方法比使用任何集合都更加高效。
    许多开发人员为了方便，都使用第一种方法，但是他的效率也相对较低。
    因为将数组压入Collection类型中，首先要将数组元素遍历一遍，然后再使用集合类做其他操作*/

   public static boolean useArrayUtils(String[] arr, String targetValue){
       return ArrayUtils.contains(arr,targetValue);
   }


    public static void main(String[] args) {
          List<Integer> ages= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ages.add(i);
        }
        System.out.println(ages);
       // System.out.println(ages.stream());
         ages = ages.stream().filter(a ->a>3 ).collect(Collectors.toList());
        System.out.println(ages);










    }

}
