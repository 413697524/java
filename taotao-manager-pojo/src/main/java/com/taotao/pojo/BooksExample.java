package com.taotao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BooksExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Short value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Short value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Short value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Short value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Short value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Short value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Short> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Short> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Short value1, Short value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Short value1, Short value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookPicIsNull() {
            addCriterion("book_pic is null");
            return (Criteria) this;
        }

        public Criteria andBookPicIsNotNull() {
            addCriterion("book_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBookPicEqualTo(String value) {
            addCriterion("book_pic =", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotEqualTo(String value) {
            addCriterion("book_pic <>", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicGreaterThan(String value) {
            addCriterion("book_pic >", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicGreaterThanOrEqualTo(String value) {
            addCriterion("book_pic >=", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicLessThan(String value) {
            addCriterion("book_pic <", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicLessThanOrEqualTo(String value) {
            addCriterion("book_pic <=", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicLike(String value) {
            addCriterion("book_pic like", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotLike(String value) {
            addCriterion("book_pic not like", value, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicIn(List<String> values) {
            addCriterion("book_pic in", values, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotIn(List<String> values) {
            addCriterion("book_pic not in", values, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicBetween(String value1, String value2) {
            addCriterion("book_pic between", value1, value2, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookPicNotBetween(String value1, String value2) {
            addCriterion("book_pic not between", value1, value2, "bookPic");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookPubIsNull() {
            addCriterion("book_pub is null");
            return (Criteria) this;
        }

        public Criteria andBookPubIsNotNull() {
            addCriterion("book_pub is not null");
            return (Criteria) this;
        }

        public Criteria andBookPubEqualTo(String value) {
            addCriterion("book_pub =", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubNotEqualTo(String value) {
            addCriterion("book_pub <>", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubGreaterThan(String value) {
            addCriterion("book_pub >", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubGreaterThanOrEqualTo(String value) {
            addCriterion("book_pub >=", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubLessThan(String value) {
            addCriterion("book_pub <", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubLessThanOrEqualTo(String value) {
            addCriterion("book_pub <=", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubLike(String value) {
            addCriterion("book_pub like", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubNotLike(String value) {
            addCriterion("book_pub not like", value, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubIn(List<String> values) {
            addCriterion("book_pub in", values, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubNotIn(List<String> values) {
            addCriterion("book_pub not in", values, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubBetween(String value1, String value2) {
            addCriterion("book_pub between", value1, value2, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookPubNotBetween(String value1, String value2) {
            addCriterion("book_pub not between", value1, value2, "bookPub");
            return (Criteria) this;
        }

        public Criteria andBookSortIsNull() {
            addCriterion("book_sort is null");
            return (Criteria) this;
        }

        public Criteria andBookSortIsNotNull() {
            addCriterion("book_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBookSortEqualTo(String value) {
            addCriterion("book_sort =", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortNotEqualTo(String value) {
            addCriterion("book_sort <>", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortGreaterThan(String value) {
            addCriterion("book_sort >", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortGreaterThanOrEqualTo(String value) {
            addCriterion("book_sort >=", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortLessThan(String value) {
            addCriterion("book_sort <", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortLessThanOrEqualTo(String value) {
            addCriterion("book_sort <=", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortLike(String value) {
            addCriterion("book_sort like", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortNotLike(String value) {
            addCriterion("book_sort not like", value, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortIn(List<String> values) {
            addCriterion("book_sort in", values, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortNotIn(List<String> values) {
            addCriterion("book_sort not in", values, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortBetween(String value1, String value2) {
            addCriterion("book_sort between", value1, value2, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookSortNotBetween(String value1, String value2) {
            addCriterion("book_sort not between", value1, value2, "bookSort");
            return (Criteria) this;
        }

        public Criteria andBookOwnerIsNull() {
            addCriterion("book_owner is null");
            return (Criteria) this;
        }

        public Criteria andBookOwnerIsNotNull() {
            addCriterion("book_owner is not null");
            return (Criteria) this;
        }

        public Criteria andBookOwnerEqualTo(String value) {
            addCriterion("book_owner =", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerNotEqualTo(String value) {
            addCriterion("book_owner <>", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerGreaterThan(String value) {
            addCriterion("book_owner >", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("book_owner >=", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerLessThan(String value) {
            addCriterion("book_owner <", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerLessThanOrEqualTo(String value) {
            addCriterion("book_owner <=", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerLike(String value) {
            addCriterion("book_owner like", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerNotLike(String value) {
            addCriterion("book_owner not like", value, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerIn(List<String> values) {
            addCriterion("book_owner in", values, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerNotIn(List<String> values) {
            addCriterion("book_owner not in", values, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerBetween(String value1, String value2) {
            addCriterion("book_owner between", value1, value2, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookOwnerNotBetween(String value1, String value2) {
            addCriterion("book_owner not between", value1, value2, "bookOwner");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerIsNull() {
            addCriterion("book_borrower is null");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerIsNotNull() {
            addCriterion("book_borrower is not null");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerEqualTo(String value) {
            addCriterion("book_borrower =", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerNotEqualTo(String value) {
            addCriterion("book_borrower <>", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerGreaterThan(String value) {
            addCriterion("book_borrower >", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerGreaterThanOrEqualTo(String value) {
            addCriterion("book_borrower >=", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerLessThan(String value) {
            addCriterion("book_borrower <", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerLessThanOrEqualTo(String value) {
            addCriterion("book_borrower <=", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerLike(String value) {
            addCriterion("book_borrower like", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerNotLike(String value) {
            addCriterion("book_borrower not like", value, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerIn(List<String> values) {
            addCriterion("book_borrower in", values, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerNotIn(List<String> values) {
            addCriterion("book_borrower not in", values, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerBetween(String value1, String value2) {
            addCriterion("book_borrower between", value1, value2, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerNotBetween(String value1, String value2) {
            addCriterion("book_borrower not between", value1, value2, "bookBorrower");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeIsNull() {
            addCriterion("book_borrower_time is null");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeIsNotNull() {
            addCriterion("book_borrower_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeEqualTo(Date value) {
            addCriterionForJDBCDate("book_borrower_time =", value, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("book_borrower_time <>", value, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("book_borrower_time >", value, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_borrower_time >=", value, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeLessThan(Date value) {
            addCriterionForJDBCDate("book_borrower_time <", value, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_borrower_time <=", value, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeIn(List<Date> values) {
            addCriterionForJDBCDate("book_borrower_time in", values, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("book_borrower_time not in", values, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_borrower_time between", value1, value2, "bookBorrowerTime");
            return (Criteria) this;
        }

        public Criteria andBookBorrowerTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_borrower_time not between", value1, value2, "bookBorrowerTime");
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