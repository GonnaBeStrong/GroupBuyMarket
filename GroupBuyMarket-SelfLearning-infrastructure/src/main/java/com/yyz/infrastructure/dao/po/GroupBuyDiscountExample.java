package com.yyz.infrastructure.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupBuyDiscountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupBuyDiscountExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNull() {
            addCriterion("discount_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIsNotNull() {
            addCriterion("discount_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountIdEqualTo(String value) {
            addCriterion("discount_id =", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotEqualTo(String value) {
            addCriterion("discount_id <>", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThan(String value) {
            addCriterion("discount_id >", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdGreaterThanOrEqualTo(String value) {
            addCriterion("discount_id >=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThan(String value) {
            addCriterion("discount_id <", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLessThanOrEqualTo(String value) {
            addCriterion("discount_id <=", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdLike(String value) {
            addCriterion("discount_id like", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotLike(String value) {
            addCriterion("discount_id not like", value, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdIn(List<String> values) {
            addCriterion("discount_id in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotIn(List<String> values) {
            addCriterion("discount_id not in", values, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdBetween(String value1, String value2) {
            addCriterion("discount_id between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountIdNotBetween(String value1, String value2) {
            addCriterion("discount_id not between", value1, value2, "discountId");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNull() {
            addCriterion("discount_name is null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIsNotNull() {
            addCriterion("discount_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountNameEqualTo(String value) {
            addCriterion("discount_name =", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotEqualTo(String value) {
            addCriterion("discount_name <>", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThan(String value) {
            addCriterion("discount_name >", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameGreaterThanOrEqualTo(String value) {
            addCriterion("discount_name >=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThan(String value) {
            addCriterion("discount_name <", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLessThanOrEqualTo(String value) {
            addCriterion("discount_name <=", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameLike(String value) {
            addCriterion("discount_name like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotLike(String value) {
            addCriterion("discount_name not like", value, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameIn(List<String> values) {
            addCriterion("discount_name in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotIn(List<String> values) {
            addCriterion("discount_name not in", values, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameBetween(String value1, String value2) {
            addCriterion("discount_name between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountNameNotBetween(String value1, String value2) {
            addCriterion("discount_name not between", value1, value2, "discountName");
            return (Criteria) this;
        }

        public Criteria andDiscountDescIsNull() {
            addCriterion("discount_desc is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDescIsNotNull() {
            addCriterion("discount_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDescEqualTo(String value) {
            addCriterion("discount_desc =", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotEqualTo(String value) {
            addCriterion("discount_desc <>", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescGreaterThan(String value) {
            addCriterion("discount_desc >", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescGreaterThanOrEqualTo(String value) {
            addCriterion("discount_desc >=", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescLessThan(String value) {
            addCriterion("discount_desc <", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescLessThanOrEqualTo(String value) {
            addCriterion("discount_desc <=", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescLike(String value) {
            addCriterion("discount_desc like", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotLike(String value) {
            addCriterion("discount_desc not like", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescIn(List<String> values) {
            addCriterion("discount_desc in", values, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotIn(List<String> values) {
            addCriterion("discount_desc not in", values, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescBetween(String value1, String value2) {
            addCriterion("discount_desc between", value1, value2, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotBetween(String value1, String value2) {
            addCriterion("discount_desc not between", value1, value2, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNull() {
            addCriterion("discount_type is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("discount_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(Byte value) {
            addCriterion("discount_type =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(Byte value) {
            addCriterion("discount_type <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(Byte value) {
            addCriterion("discount_type >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("discount_type >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(Byte value) {
            addCriterion("discount_type <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(Byte value) {
            addCriterion("discount_type <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<Byte> values) {
            addCriterion("discount_type in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<Byte> values) {
            addCriterion("discount_type not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(Byte value1, Byte value2) {
            addCriterion("discount_type between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("discount_type not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andMarketPlanIsNull() {
            addCriterion("market_plan is null");
            return (Criteria) this;
        }

        public Criteria andMarketPlanIsNotNull() {
            addCriterion("market_plan is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPlanEqualTo(String value) {
            addCriterion("market_plan =", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanNotEqualTo(String value) {
            addCriterion("market_plan <>", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanGreaterThan(String value) {
            addCriterion("market_plan >", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanGreaterThanOrEqualTo(String value) {
            addCriterion("market_plan >=", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanLessThan(String value) {
            addCriterion("market_plan <", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanLessThanOrEqualTo(String value) {
            addCriterion("market_plan <=", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanLike(String value) {
            addCriterion("market_plan like", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanNotLike(String value) {
            addCriterion("market_plan not like", value, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanIn(List<String> values) {
            addCriterion("market_plan in", values, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanNotIn(List<String> values) {
            addCriterion("market_plan not in", values, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanBetween(String value1, String value2) {
            addCriterion("market_plan between", value1, value2, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketPlanNotBetween(String value1, String value2) {
            addCriterion("market_plan not between", value1, value2, "marketPlan");
            return (Criteria) this;
        }

        public Criteria andMarketExprIsNull() {
            addCriterion("market_expr is null");
            return (Criteria) this;
        }

        public Criteria andMarketExprIsNotNull() {
            addCriterion("market_expr is not null");
            return (Criteria) this;
        }

        public Criteria andMarketExprEqualTo(String value) {
            addCriterion("market_expr =", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprNotEqualTo(String value) {
            addCriterion("market_expr <>", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprGreaterThan(String value) {
            addCriterion("market_expr >", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprGreaterThanOrEqualTo(String value) {
            addCriterion("market_expr >=", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprLessThan(String value) {
            addCriterion("market_expr <", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprLessThanOrEqualTo(String value) {
            addCriterion("market_expr <=", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprLike(String value) {
            addCriterion("market_expr like", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprNotLike(String value) {
            addCriterion("market_expr not like", value, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprIn(List<String> values) {
            addCriterion("market_expr in", values, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprNotIn(List<String> values) {
            addCriterion("market_expr not in", values, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprBetween(String value1, String value2) {
            addCriterion("market_expr between", value1, value2, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andMarketExprNotBetween(String value1, String value2) {
            addCriterion("market_expr not between", value1, value2, "marketExpr");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(String value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(String value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(String value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(String value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(String value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(String value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLike(String value) {
            addCriterion("tag_id like", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotLike(String value) {
            addCriterion("tag_id not like", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<String> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<String> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(String value1, String value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(String value1, String value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}