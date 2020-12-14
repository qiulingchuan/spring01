package com.spm.om.test;

import com.spm.om.vo.dspRec;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author skyqlc
 * @name com.spm.om.test
 * @create 2020/10/23:20:29
 */
public class dscRecTest {

    public static void main(String[] args) {
        List<dspRec> rlist = new ArrayList<>();
        dspRec r1 = new dspRec();dspRec r2 = new dspRec();
        dspRec r3 = new dspRec();
        r1.setPid(1);r2.setPid(1);r3.setPid(1);
        r1.setId(11);r2.setId(12);r3.setId(13);
        r1.setCity("CN-01-01");r3.setCity("CN-02-02");
        r1.setCityName("CN-01-01");r3.setCityName("XXXXX");
        r1.setCountry("CN");r3.setCountry("CN");
        r1.setCountryName("CN");r3.setCountryName("CN");
        r1.setProvince("CN-01");r3.setProvince("CN-01");
        r1.setProvinceName("hubei");r3.setProvinceName("hubei");
        r1.setSubLoc("DCGR01");r2.setSubLoc("DCGR01");r3.setSubLoc("DCGR01");
        r1.setItemID("ABC01"); r2.setItemID("ABC01"); r3.setItemID("ABC01");
        r1.setWarehouse("DC");r2.setWarehouse("DC");r3.setWarehouse("DC");
        r1.setCounty("CN-01-01-001");r2.setCounty("CN-01-01-001");r3.setCounty("CN-01-01-001");
        rlist.add(r1);rlist.add(r2); rlist.add(r3);

        String vMsg;
        //直接连接
        //String join1 = dishes.stream().map(Dish::getName).collect(Collectors.joining());
       //逗号
       // String join2 = dishes.stream().map(Dish::getName).collect(Collectors.joining(", "));
         String  join1 = rlist.stream().map(dspRec::getCity).collect(Collectors.joining(","));
       // System.out.println(join1);
        System.out.println("==========");
        rlist.stream().filter(s->(s.getCity() != null&& s.getCityName() !=null))
                .forEach(name-> {
                    if (name.getMsg() !=null) {
                        name.setMsg(name.getMsg() + " city");
                    } else {
                        name.setMsg(" city");
                    }
                });
        rlist.stream().filter(s->(s.getCountry() != null&& s.getCountryName() !=null))
                .forEach(name-> {
                    if (name.getMsg() !=null) {
                        name.setMsg(name.getMsg() + " Country");
                    } else {
                        name.setMsg(" Country");
                    }
                });
        rlist.stream().filter(s->(s.getMsg() != null))
                .forEach(name-> { name.setMsg(name.getMsg() + " is not ok");
                });
        //rlist.stream().forEach(name-> System.out.println(name.getPid()+name.getCity()));

        for(dspRec r : rlist) {
            if (r.getMsg()!=null) {
                System.out.println(r.getCity() + ": " + r.getMsg());
            }
        }

        };

    }

