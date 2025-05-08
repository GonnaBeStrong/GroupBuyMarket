package com.yyz.infrastructure.dao.po;

import java.util.Date;

public class GroupBuyDiscount {
    private Long id;

    private String discountId;

    private String discountName;

    private String discountDesc;

    private Byte discountType;

    private String marketPlan;

    private String marketExpr;

    private String tagId;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountDesc() {
        return discountDesc;
    }

    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    public Byte getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Byte discountType) {
        this.discountType = discountType;
    }

    public String getMarketPlan() {
        return marketPlan;
    }

    public void setMarketPlan(String marketPlan) {
        this.marketPlan = marketPlan;
    }

    public String getMarketExpr() {
        return marketExpr;
    }

    public void setMarketExpr(String marketExpr) {
        this.marketExpr = marketExpr;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", discountId=").append(discountId);
        sb.append(", discountName=").append(discountName);
        sb.append(", discountDesc=").append(discountDesc);
        sb.append(", discountType=").append(discountType);
        sb.append(", marketPlan=").append(marketPlan);
        sb.append(", marketExpr=").append(marketExpr);
        sb.append(", tagId=").append(tagId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}