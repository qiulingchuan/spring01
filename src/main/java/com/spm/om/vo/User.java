package com.spm.om.vo;

import java.lang.ref.PhantomReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author skyqlc
 * @name com.spm.om.vo
 * @create 2020/08/15:23:10
 */
public class User {
    private String userName;
    private String address;
    private Integer id;
    private Integer age;
    private Cat cat;
    private Cat[] catlist;
    private Map<String ,String> details;
    private Properties info;

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", cat=" + cat +
                ", catlist=" + Arrays.toString(catlist) +
                ", details=" + details +
                ", info=" + info +
                ", favorites=" + favorites +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public Cat getCat() {
        return cat;
    }

    public Cat[] getCatlist() {
        return catlist;
    }
    public List<String> favorites;

    public void setCatlist(Cat[] catlist) {
        this.catlist = catlist;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public User() {
        System.out.println("#########User 被构造了#############");
    }

    public User(String userName, String address, Integer id) {
        this.userName = userName;
        this.address = address;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
