package cn.gcf.zhangwuguanli.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnoIsNull() {
            addCriterion("ono is null");
            return (Criteria) this;
        }

        public Criteria andOnoIsNotNull() {
            addCriterion("ono is not null");
            return (Criteria) this;
        }

        public Criteria andOnoEqualTo(String value) {
            addCriterion("ono =", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotEqualTo(String value) {
            addCriterion("ono <>", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoGreaterThan(String value) {
            addCriterion("ono >", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoGreaterThanOrEqualTo(String value) {
            addCriterion("ono >=", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoLessThan(String value) {
            addCriterion("ono <", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoLessThanOrEqualTo(String value) {
            addCriterion("ono <=", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoLike(String value) {
            addCriterion("ono like", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotLike(String value) {
            addCriterion("ono not like", value, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoIn(List<String> values) {
            addCriterion("ono in", values, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotIn(List<String> values) {
            addCriterion("ono not in", values, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoBetween(String value1, String value2) {
            addCriterion("ono between", value1, value2, "ono");
            return (Criteria) this;
        }

        public Criteria andOnoNotBetween(String value1, String value2) {
            addCriterion("ono not between", value1, value2, "ono");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andInameIsNull() {
            addCriterion("iname is null");
            return (Criteria) this;
        }

        public Criteria andInameIsNotNull() {
            addCriterion("iname is not null");
            return (Criteria) this;
        }

        public Criteria andInameEqualTo(String value) {
            addCriterion("iname =", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotEqualTo(String value) {
            addCriterion("iname <>", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThan(String value) {
            addCriterion("iname >", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThanOrEqualTo(String value) {
            addCriterion("iname >=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThan(String value) {
            addCriterion("iname <", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThanOrEqualTo(String value) {
            addCriterion("iname <=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLike(String value) {
            addCriterion("iname like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotLike(String value) {
            addCriterion("iname not like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameIn(List<String> values) {
            addCriterion("iname in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotIn(List<String> values) {
            addCriterion("iname not in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameBetween(String value1, String value2) {
            addCriterion("iname between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotBetween(String value1, String value2) {
            addCriterion("iname not between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOaidIsNull() {
            addCriterion("oaid is null");
            return (Criteria) this;
        }

        public Criteria andOaidIsNotNull() {
            addCriterion("oaid is not null");
            return (Criteria) this;
        }

        public Criteria andOaidEqualTo(Integer value) {
            addCriterion("oaid =", value, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidNotEqualTo(Integer value) {
            addCriterion("oaid <>", value, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidGreaterThan(Integer value) {
            addCriterion("oaid >", value, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oaid >=", value, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidLessThan(Integer value) {
            addCriterion("oaid <", value, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidLessThanOrEqualTo(Integer value) {
            addCriterion("oaid <=", value, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidIn(List<Integer> values) {
            addCriterion("oaid in", values, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidNotIn(List<Integer> values) {
            addCriterion("oaid not in", values, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidBetween(Integer value1, Integer value2) {
            addCriterion("oaid between", value1, value2, "oaid");
            return (Criteria) this;
        }

        public Criteria andOaidNotBetween(Integer value1, Integer value2) {
            addCriterion("oaid not between", value1, value2, "oaid");
            return (Criteria) this;
        }

        public Criteria andOpictureIsNull() {
            addCriterion("opicture is null");
            return (Criteria) this;
        }

        public Criteria andOpictureIsNotNull() {
            addCriterion("opicture is not null");
            return (Criteria) this;
        }

        public Criteria andOpictureEqualTo(String value) {
            addCriterion("opicture =", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureNotEqualTo(String value) {
            addCriterion("opicture <>", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureGreaterThan(String value) {
            addCriterion("opicture >", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureGreaterThanOrEqualTo(String value) {
            addCriterion("opicture >=", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureLessThan(String value) {
            addCriterion("opicture <", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureLessThanOrEqualTo(String value) {
            addCriterion("opicture <=", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureLike(String value) {
            addCriterion("opicture like", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureNotLike(String value) {
            addCriterion("opicture not like", value, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureIn(List<String> values) {
            addCriterion("opicture in", values, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureNotIn(List<String> values) {
            addCriterion("opicture not in", values, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureBetween(String value1, String value2) {
            addCriterion("opicture between", value1, value2, "opicture");
            return (Criteria) this;
        }

        public Criteria andOpictureNotBetween(String value1, String value2) {
            addCriterion("opicture not between", value1, value2, "opicture");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNull() {
            addCriterion("onumber is null");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNotNull() {
            addCriterion("onumber is not null");
            return (Criteria) this;
        }

        public Criteria andOnumberEqualTo(Long value) {
            addCriterion("onumber =", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotEqualTo(Long value) {
            addCriterion("onumber <>", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThan(Long value) {
            addCriterion("onumber >", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("onumber >=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThan(Long value) {
            addCriterion("onumber <", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThanOrEqualTo(Long value) {
            addCriterion("onumber <=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberIn(List<Long> values) {
            addCriterion("onumber in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotIn(List<Long> values) {
            addCriterion("onumber not in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberBetween(Long value1, Long value2) {
            addCriterion("onumber between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotBetween(Long value1, Long value2) {
            addCriterion("onumber not between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOmoneyIsNull() {
            addCriterion("omoney is null");
            return (Criteria) this;
        }

        public Criteria andOmoneyIsNotNull() {
            addCriterion("omoney is not null");
            return (Criteria) this;
        }

        public Criteria andOmoneyEqualTo(Double value) {
            addCriterion("omoney =", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyNotEqualTo(Double value) {
            addCriterion("omoney <>", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyGreaterThan(Double value) {
            addCriterion("omoney >", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("omoney >=", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyLessThan(Double value) {
            addCriterion("omoney <", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyLessThanOrEqualTo(Double value) {
            addCriterion("omoney <=", value, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyIn(List<Double> values) {
            addCriterion("omoney in", values, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyNotIn(List<Double> values) {
            addCriterion("omoney not in", values, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyBetween(Double value1, Double value2) {
            addCriterion("omoney between", value1, value2, "omoney");
            return (Criteria) this;
        }

        public Criteria andOmoneyNotBetween(Double value1, Double value2) {
            addCriterion("omoney not between", value1, value2, "omoney");
            return (Criteria) this;
        }

        public Criteria andOcategoryIsNull() {
            addCriterion("ocategory is null");
            return (Criteria) this;
        }

        public Criteria andOcategoryIsNotNull() {
            addCriterion("ocategory is not null");
            return (Criteria) this;
        }

        public Criteria andOcategoryEqualTo(String value) {
            addCriterion("ocategory =", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryNotEqualTo(String value) {
            addCriterion("ocategory <>", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryGreaterThan(String value) {
            addCriterion("ocategory >", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ocategory >=", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryLessThan(String value) {
            addCriterion("ocategory <", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryLessThanOrEqualTo(String value) {
            addCriterion("ocategory <=", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryLike(String value) {
            addCriterion("ocategory like", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryNotLike(String value) {
            addCriterion("ocategory not like", value, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryIn(List<String> values) {
            addCriterion("ocategory in", values, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryNotIn(List<String> values) {
            addCriterion("ocategory not in", values, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryBetween(String value1, String value2) {
            addCriterion("ocategory between", value1, value2, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOcategoryNotBetween(String value1, String value2) {
            addCriterion("ocategory not between", value1, value2, "ocategory");
            return (Criteria) this;
        }

        public Criteria andOsumIsNull() {
            addCriterion("osum is null");
            return (Criteria) this;
        }

        public Criteria andOsumIsNotNull() {
            addCriterion("osum is not null");
            return (Criteria) this;
        }

        public Criteria andOsumEqualTo(Double value) {
            addCriterion("osum =", value, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumNotEqualTo(Double value) {
            addCriterion("osum <>", value, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumGreaterThan(Double value) {
            addCriterion("osum >", value, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumGreaterThanOrEqualTo(Double value) {
            addCriterion("osum >=", value, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumLessThan(Double value) {
            addCriterion("osum <", value, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumLessThanOrEqualTo(Double value) {
            addCriterion("osum <=", value, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumIn(List<Double> values) {
            addCriterion("osum in", values, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumNotIn(List<Double> values) {
            addCriterion("osum not in", values, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumBetween(Double value1, Double value2) {
            addCriterion("osum between", value1, value2, "osum");
            return (Criteria) this;
        }

        public Criteria andOsumNotBetween(Double value1, Double value2) {
            addCriterion("osum not between", value1, value2, "osum");
            return (Criteria) this;
        }

        public Criteria andOnewdateIsNull() {
            addCriterion("onewdate is null");
            return (Criteria) this;
        }

        public Criteria andOnewdateIsNotNull() {
            addCriterion("onewdate is not null");
            return (Criteria) this;
        }

        public Criteria andOnewdateEqualTo(String value) {
            addCriterion("onewdate =", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateNotEqualTo(String value) {
            addCriterion("onewdate <>", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateGreaterThan(String value) {
            addCriterion("onewdate >", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateGreaterThanOrEqualTo(String value) {
            addCriterion("onewdate >=", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateLessThan(String value) {
            addCriterion("onewdate <", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateLessThanOrEqualTo(String value) {
            addCriterion("onewdate <=", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateLike(String value) {
            addCriterion("onewdate like", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateNotLike(String value) {
            addCriterion("onewdate not like", value, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateIn(List<String> values) {
            addCriterion("onewdate in", values, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateNotIn(List<String> values) {
            addCriterion("onewdate not in", values, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateBetween(String value1, String value2) {
            addCriterion("onewdate between", value1, value2, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOnewdateNotBetween(String value1, String value2) {
            addCriterion("onewdate not between", value1, value2, "onewdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateIsNull() {
            addCriterion("ofinishdate is null");
            return (Criteria) this;
        }

        public Criteria andOfinishdateIsNotNull() {
            addCriterion("ofinishdate is not null");
            return (Criteria) this;
        }

        public Criteria andOfinishdateEqualTo(String value) {
            addCriterion("ofinishdate =", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateNotEqualTo(String value) {
            addCriterion("ofinishdate <>", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateGreaterThan(String value) {
            addCriterion("ofinishdate >", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateGreaterThanOrEqualTo(String value) {
            addCriterion("ofinishdate >=", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateLessThan(String value) {
            addCriterion("ofinishdate <", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateLessThanOrEqualTo(String value) {
            addCriterion("ofinishdate <=", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateLike(String value) {
            addCriterion("ofinishdate like", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateNotLike(String value) {
            addCriterion("ofinishdate not like", value, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateIn(List<String> values) {
            addCriterion("ofinishdate in", values, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateNotIn(List<String> values) {
            addCriterion("ofinishdate not in", values, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateBetween(String value1, String value2) {
            addCriterion("ofinishdate between", value1, value2, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOfinishdateNotBetween(String value1, String value2) {
            addCriterion("ofinishdate not between", value1, value2, "ofinishdate");
            return (Criteria) this;
        }

        public Criteria andOaddrIsNull() {
            addCriterion("oaddr is null");
            return (Criteria) this;
        }

        public Criteria andOaddrIsNotNull() {
            addCriterion("oaddr is not null");
            return (Criteria) this;
        }

        public Criteria andOaddrEqualTo(String value) {
            addCriterion("oaddr =", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrNotEqualTo(String value) {
            addCriterion("oaddr <>", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrGreaterThan(String value) {
            addCriterion("oaddr >", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrGreaterThanOrEqualTo(String value) {
            addCriterion("oaddr >=", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrLessThan(String value) {
            addCriterion("oaddr <", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrLessThanOrEqualTo(String value) {
            addCriterion("oaddr <=", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrLike(String value) {
            addCriterion("oaddr like", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrNotLike(String value) {
            addCriterion("oaddr not like", value, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrIn(List<String> values) {
            addCriterion("oaddr in", values, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrNotIn(List<String> values) {
            addCriterion("oaddr not in", values, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrBetween(String value1, String value2) {
            addCriterion("oaddr between", value1, value2, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOaddrNotBetween(String value1, String value2) {
            addCriterion("oaddr not between", value1, value2, "oaddr");
            return (Criteria) this;
        }

        public Criteria andOcontactIsNull() {
            addCriterion("ocontact is null");
            return (Criteria) this;
        }

        public Criteria andOcontactIsNotNull() {
            addCriterion("ocontact is not null");
            return (Criteria) this;
        }

        public Criteria andOcontactEqualTo(String value) {
            addCriterion("ocontact =", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactNotEqualTo(String value) {
            addCriterion("ocontact <>", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactGreaterThan(String value) {
            addCriterion("ocontact >", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactGreaterThanOrEqualTo(String value) {
            addCriterion("ocontact >=", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactLessThan(String value) {
            addCriterion("ocontact <", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactLessThanOrEqualTo(String value) {
            addCriterion("ocontact <=", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactLike(String value) {
            addCriterion("ocontact like", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactNotLike(String value) {
            addCriterion("ocontact not like", value, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactIn(List<String> values) {
            addCriterion("ocontact in", values, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactNotIn(List<String> values) {
            addCriterion("ocontact not in", values, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactBetween(String value1, String value2) {
            addCriterion("ocontact between", value1, value2, "ocontact");
            return (Criteria) this;
        }

        public Criteria andOcontactNotBetween(String value1, String value2) {
            addCriterion("ocontact not between", value1, value2, "ocontact");
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