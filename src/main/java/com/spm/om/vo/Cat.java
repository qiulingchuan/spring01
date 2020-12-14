package com.spm.om.vo;

/**
 * @author skyqlc
 * @name com.spm.om.vo
 * @create 2020/08/16:18:21
 */
public class Cat {
    private String name;
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
