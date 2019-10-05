package cn.gcf.zhangwuguanli.pojo;

import java.util.ArrayList;
import java.util.List;

public class ApporachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApporachExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnoIsNull() {
            addCriterion("ano is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ano is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(String value) {
            addCriterion("ano =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(String value) {
            addCriterion("ano <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(String value) {
            addCriterion("ano >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(String value) {
            addCriterion("ano >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(String value) {
            addCriterion("ano <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(String value) {
            addCriterion("ano <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLike(String value) {
            addCriterion("ano like", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotLike(String value) {
            addCriterion("ano not like", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<String> values) {
            addCriterion("ano in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<String> values) {
            addCriterion("ano not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(String value1, String value2) {
            addCriterion("ano between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(String value1, String value2) {
            addCriterion("ano not between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andApictureIsNull() {
            addCriterion("apicture is null");
            return (Criteria) this;
        }

        public Criteria andApictureIsNotNull() {
            addCriterion("apicture is not null");
            return (Criteria) this;
        }

        public Criteria andApictureEqualTo(String value) {
            addCriterion("apicture =", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotEqualTo(String value) {
            addCriterion("apicture <>", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureGreaterThan(String value) {
            addCriterion("apicture >", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureGreaterThanOrEqualTo(String value) {
            addCriterion("apicture >=", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureLessThan(String value) {
            addCriterion("apicture <", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureLessThanOrEqualTo(String value) {
            addCriterion("apicture <=", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureLike(String value) {
            addCriterion("apicture like", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotLike(String value) {
            addCriterion("apicture not like", value, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureIn(List<String> values) {
            addCriterion("apicture in", values, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotIn(List<String> values) {
            addCriterion("apicture not in", values, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureBetween(String value1, String value2) {
            addCriterion("apicture between", value1, value2, "apicture");
            return (Criteria) this;
        }

        public Criteria andApictureNotBetween(String value1, String value2) {
            addCriterion("apicture not between", value1, value2, "apicture");
            return (Criteria) this;
        }

        public Criteria andAexpressIsNull() {
            addCriterion("aexpress is null");
            return (Criteria) this;
        }

        public Criteria andAexpressIsNotNull() {
            addCriterion("aexpress is not null");
            return (Criteria) this;
        }

        public Criteria andAexpressEqualTo(String value) {
            addCriterion("aexpress =", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressNotEqualTo(String value) {
            addCriterion("aexpress <>", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressGreaterThan(String value) {
            addCriterion("aexpress >", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressGreaterThanOrEqualTo(String value) {
            addCriterion("aexpress >=", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressLessThan(String value) {
            addCriterion("aexpress <", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressLessThanOrEqualTo(String value) {
            addCriterion("aexpress <=", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressLike(String value) {
            addCriterion("aexpress like", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressNotLike(String value) {
            addCriterion("aexpress not like", value, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressIn(List<String> values) {
            addCriterion("aexpress in", values, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressNotIn(List<String> values) {
            addCriterion("aexpress not in", values, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressBetween(String value1, String value2) {
            addCriterion("aexpress between", value1, value2, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAexpressNotBetween(String value1, String value2) {
            addCriterion("aexpress not between", value1, value2, "aexpress");
            return (Criteria) this;
        }

        public Criteria andAinformationIsNull() {
            addCriterion("ainformation is null");
            return (Criteria) this;
        }

        public Criteria andAinformationIsNotNull() {
            addCriterion("ainformation is not null");
            return (Criteria) this;
        }

        public Criteria andAinformationEqualTo(String value) {
            addCriterion("ainformation =", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationNotEqualTo(String value) {
            addCriterion("ainformation <>", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationGreaterThan(String value) {
            addCriterion("ainformation >", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationGreaterThanOrEqualTo(String value) {
            addCriterion("ainformation >=", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationLessThan(String value) {
            addCriterion("ainformation <", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationLessThanOrEqualTo(String value) {
            addCriterion("ainformation <=", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationLike(String value) {
            addCriterion("ainformation like", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationNotLike(String value) {
            addCriterion("ainformation not like", value, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationIn(List<String> values) {
            addCriterion("ainformation in", values, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationNotIn(List<String> values) {
            addCriterion("ainformation not in", values, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationBetween(String value1, String value2) {
            addCriterion("ainformation between", value1, value2, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAinformationNotBetween(String value1, String value2) {
            addCriterion("ainformation not between", value1, value2, "ainformation");
            return (Criteria) this;
        }

        public Criteria andAnumberIsNull() {
            addCriterion("anumber is null");
            return (Criteria) this;
        }

        public Criteria andAnumberIsNotNull() {
            addCriterion("anumber is not null");
            return (Criteria) this;
        }

        public Criteria andAnumberEqualTo(Integer value) {
            addCriterion("anumber =", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotEqualTo(Integer value) {
            addCriterion("anumber <>", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberGreaterThan(Integer value) {
            addCriterion("anumber >", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("anumber >=", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLessThan(Integer value) {
            addCriterion("anumber <", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLessThanOrEqualTo(Integer value) {
            addCriterion("anumber <=", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberIn(List<Integer> values) {
            addCriterion("anumber in", values, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotIn(List<Integer> values) {
            addCriterion("anumber not in", values, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberBetween(Integer value1, Integer value2) {
            addCriterion("anumber between", value1, value2, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("anumber not between", value1, value2, "anumber");
            return (Criteria) this;
        }

        public Criteria andAmoneyIsNull() {
            addCriterion("amoney is null");
            return (Criteria) this;
        }

        public Criteria andAmoneyIsNotNull() {
            addCriterion("amoney is not null");
            return (Criteria) this;
        }

        public Criteria andAmoneyEqualTo(Double value) {
            addCriterion("amoney =", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotEqualTo(Double value) {
            addCriterion("amoney <>", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyGreaterThan(Double value) {
            addCriterion("amoney >", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("amoney >=", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyLessThan(Double value) {
            addCriterion("amoney <", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyLessThanOrEqualTo(Double value) {
            addCriterion("amoney <=", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyIn(List<Double> values) {
            addCriterion("amoney in", values, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotIn(List<Double> values) {
            addCriterion("amoney not in", values, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyBetween(Double value1, Double value2) {
            addCriterion("amoney between", value1, value2, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotBetween(Double value1, Double value2) {
            addCriterion("amoney not between", value1, value2, "amoney");
            return (Criteria) this;
        }

        public Criteria andAcategoryIsNull() {
            addCriterion("acategory is null");
            return (Criteria) this;
        }

        public Criteria andAcategoryIsNotNull() {
            addCriterion("acategory is not null");
            return (Criteria) this;
        }

        public Criteria andAcategoryEqualTo(String value) {
            addCriterion("acategory =", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryNotEqualTo(String value) {
            addCriterion("acategory <>", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryGreaterThan(String value) {
            addCriterion("acategory >", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("acategory >=", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryLessThan(String value) {
            addCriterion("acategory <", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryLessThanOrEqualTo(String value) {
            addCriterion("acategory <=", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryLike(String value) {
            addCriterion("acategory like", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryNotLike(String value) {
            addCriterion("acategory not like", value, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryIn(List<String> values) {
            addCriterion("acategory in", values, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryNotIn(List<String> values) {
            addCriterion("acategory not in", values, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryBetween(String value1, String value2) {
            addCriterion("acategory between", value1, value2, "acategory");
            return (Criteria) this;
        }

        public Criteria andAcategoryNotBetween(String value1, String value2) {
            addCriterion("acategory not between", value1, value2, "acategory");
            return (Criteria) this;
        }

        public Criteria andAwarehouseIsNull() {
            addCriterion("awarehouse is null");
            return (Criteria) this;
        }

        public Criteria andAwarehouseIsNotNull() {
            addCriterion("awarehouse is not null");
            return (Criteria) this;
        }

        public Criteria andAwarehouseEqualTo(String value) {
            addCriterion("awarehouse =", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseNotEqualTo(String value) {
            addCriterion("awarehouse <>", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseGreaterThan(String value) {
            addCriterion("awarehouse >", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("awarehouse >=", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseLessThan(String value) {
            addCriterion("awarehouse <", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseLessThanOrEqualTo(String value) {
            addCriterion("awarehouse <=", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseLike(String value) {
            addCriterion("awarehouse like", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseNotLike(String value) {
            addCriterion("awarehouse not like", value, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseIn(List<String> values) {
            addCriterion("awarehouse in", values, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseNotIn(List<String> values) {
            addCriterion("awarehouse not in", values, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseBetween(String value1, String value2) {
            addCriterion("awarehouse between", value1, value2, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andAwarehouseNotBetween(String value1, String value2) {
            addCriterion("awarehouse not between", value1, value2, "awarehouse");
            return (Criteria) this;
        }

        public Criteria andInoIsNull() {
            addCriterion("ino is null");
            return (Criteria) this;
        }

        public Criteria andInoIsNotNull() {
            addCriterion("ino is not null");
            return (Criteria) this;
        }

        public Criteria andInoEqualTo(Integer value) {
            addCriterion("ino =", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoNotEqualTo(Integer value) {
            addCriterion("ino <>", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoGreaterThan(Integer value) {
            addCriterion("ino >", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ino >=", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoLessThan(Integer value) {
            addCriterion("ino <", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoLessThanOrEqualTo(Integer value) {
            addCriterion("ino <=", value, "ino");
            return (Criteria) this;
        }

        public Criteria andInoIn(List<Integer> values) {
            addCriterion("ino in", values, "ino");
            return (Criteria) this;
        }

        public Criteria andInoNotIn(List<Integer> values) {
            addCriterion("ino not in", values, "ino");
            return (Criteria) this;
        }

        public Criteria andInoBetween(Integer value1, Integer value2) {
            addCriterion("ino between", value1, value2, "ino");
            return (Criteria) this;
        }

        public Criteria andInoNotBetween(Integer value1, Integer value2) {
            addCriterion("ino not between", value1, value2, "ino");
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