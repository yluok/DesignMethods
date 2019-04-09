package com.yluo.prototype.bussiness;
import java.util.Date;

/**
 * 记录类
 */
public class Record{
    private int id;			//记录id
    private Integer inAccountId;			//进账账户id
    private Integer outAccountId;			//出账账户id
    private Integer cashAmount;				//交易金额
    private Short inOrOut;				//记录标志，1表示收入，2表示支出，3表示转账
    private Date updatetime;			//记录更新时间
    private String content;				//交易备注
    private int userId;                 //用户id
    private Date createtime;			//记录实际发生时间

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInAccountId() {
        return inAccountId;
    }

    public void setInAccountId(Integer inAccountId) {
        this.inAccountId = inAccountId;
    }

    public Integer getOutAccountId() {
        return outAccountId;
    }

    public void setOutAccountId(Integer outAccountId) {
        this.outAccountId = outAccountId;
    }

    public Integer getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Integer cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Short getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(Short inOrOut) {
        this.inOrOut = inOrOut;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", inAccountId=" + inAccountId +
                ", outAccountId=" + outAccountId +
                ", cashAmount=" + cashAmount +
                ", inOrOut=" + inOrOut +
                ", updatetime=" + updatetime +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", createtime=" + createtime +
                '}';
    }
}
