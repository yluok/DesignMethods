package com.yluo.prototype.bussiness;
import java.util.Date;
public class Account {
    private int id;     //账户id
    private String name;       //账户名字
    private Integer cashAmount;     //账户现有金额
    private int ishide;     //是否一女
    private int income;     //账户总收入
    private Date createtime;    //账户创建时间
    private int consume;    //账户总支出
    private int userId;     //用户Id

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Integer cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getIshide() {
        return ishide;
    }

    public void setIshide(int ishide) {
        this.ishide = ishide;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getConsume() {
        return consume;
    }

    public void setConsume(int consume) {
        this.consume = consume;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
