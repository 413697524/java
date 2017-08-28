package com.taotao.pojo;

import java.util.ArrayList;
import java.util.List;

public class PartsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartsExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPartIdIsNull() {
            addCriterion("part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Short value) {
            addCriterion("part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Short value) {
            addCriterion("part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Short value) {
            addCriterion("part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Short value) {
            addCriterion("part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Short value) {
            addCriterion("part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Short value) {
            addCriterion("part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Short> values) {
            addCriterion("part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Short> values) {
            addCriterion("part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Short value1, Short value2) {
            addCriterion("part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Short value1, Short value2) {
            addCriterion("part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartMailIsNull() {
            addCriterion("part_mail is null");
            return (Criteria) this;
        }

        public Criteria andPartMailIsNotNull() {
            addCriterion("part_mail is not null");
            return (Criteria) this;
        }

        public Criteria andPartMailEqualTo(String value) {
            addCriterion("part_mail =", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailNotEqualTo(String value) {
            addCriterion("part_mail <>", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailGreaterThan(String value) {
            addCriterion("part_mail >", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailGreaterThanOrEqualTo(String value) {
            addCriterion("part_mail >=", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailLessThan(String value) {
            addCriterion("part_mail <", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailLessThanOrEqualTo(String value) {
            addCriterion("part_mail <=", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailLike(String value) {
            addCriterion("part_mail like", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailNotLike(String value) {
            addCriterion("part_mail not like", value, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailIn(List<String> values) {
            addCriterion("part_mail in", values, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailNotIn(List<String> values) {
            addCriterion("part_mail not in", values, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailBetween(String value1, String value2) {
            addCriterion("part_mail between", value1, value2, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartMailNotBetween(String value1, String value2) {
            addCriterion("part_mail not between", value1, value2, "partMail");
            return (Criteria) this;
        }

        public Criteria andPartPassIsNull() {
            addCriterion("part_pass is null");
            return (Criteria) this;
        }

        public Criteria andPartPassIsNotNull() {
            addCriterion("part_pass is not null");
            return (Criteria) this;
        }

        public Criteria andPartPassEqualTo(String value) {
            addCriterion("part_pass =", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassNotEqualTo(String value) {
            addCriterion("part_pass <>", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassGreaterThan(String value) {
            addCriterion("part_pass >", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassGreaterThanOrEqualTo(String value) {
            addCriterion("part_pass >=", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassLessThan(String value) {
            addCriterion("part_pass <", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassLessThanOrEqualTo(String value) {
            addCriterion("part_pass <=", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassLike(String value) {
            addCriterion("part_pass like", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassNotLike(String value) {
            addCriterion("part_pass not like", value, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassIn(List<String> values) {
            addCriterion("part_pass in", values, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassNotIn(List<String> values) {
            addCriterion("part_pass not in", values, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassBetween(String value1, String value2) {
            addCriterion("part_pass between", value1, value2, "partPass");
            return (Criteria) this;
        }

        public Criteria andPartPassNotBetween(String value1, String value2) {
            addCriterion("part_pass not between", value1, value2, "partPass");
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