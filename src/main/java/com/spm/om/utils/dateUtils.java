package com.spm.om.utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author skyqlc
 * @name com.spm.om.utils
 * @create 2020/12/12:21:41
 */
public class dateUtils {
    public static void main(String[] args) {
        Integer a =1;
        Integer b =18;
        //System.out.println(getCurDate()); ///2020-12-12 21:48:11
        String abc = addDate("2020-01-01 00:10:00",a,b);
        System.out.println(abc);
    }

    public static String addDate (String day,Integer daycnt, Integer hrcnt) {
        Date date =null;
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*1.如果没有传入日期,则为当前日期*/
        System.out.println(day);
        if (day.isEmpty()) {
            day = getCurDate();
        }
        /*2.转换日期*/
        try {
            date = format.parse(day) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        /*增加天数*/
        if (hrcnt!=null && hrcnt>0) {
           cal.add(Calendar.HOUR,hrcnt);
        }
        /*增加小时数*/
        if (daycnt!=null && daycnt>0) {
           cal.add(Calendar.DAY_OF_MONTH,daycnt);
        }
        date = cal.getTime();
        // System.out.println("计算后日期: " + format.format(date));
        cal = null;
        return format.format(date);
    }

    /*获取当前日期*/
    public static String getCurDate() {
        Date cur = new Date();
        SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format(cur);
        return dateString;
    };

}
