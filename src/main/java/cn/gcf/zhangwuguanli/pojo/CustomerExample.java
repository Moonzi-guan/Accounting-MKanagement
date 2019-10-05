package cn.gcf.zhangwuguanli.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCpictureIsNull() {
            addCriterion("cpicture is null");
            return (Criteria) this;
        }

        public Criteria andCpictureIsNotNull() {
            addCriterion("cpicture is not null");
            return (Criteria) this;
        }

        public Criteria andCpictureEqualTo(String value) {
            addCriterion("cpicture =", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotEqualTo(String value) {
            addCriterion("cpicture <>", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureGreaterThan(String value) {
            addCriterion("cpicture >", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureGreaterThanOrEqualTo(String value) {
            addCriterion("cpicture >=", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLessThan(String value) {
            addCriterion("cpicture <", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLessThanOrEqualTo(String value) {
            addCriterion("cpicture <=", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLike(String value) {
            addCriterion("cpicture like", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotLike(String value) {
            addCriterion("cpicture not like", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureIn(List<String> values) {
            addCriterion("cpicture in", values, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotIn(List<String> values) {
            addCriterion("cpicture not in", values, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureBetween(String value1, String value2) {
            addCriterion("cpicture between", value1, value2, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotBetween(String value1, String value2) {
            addCriterion("cpicture not between", value1, value2, "cpicture");
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

        public Criteria andCsexIsNull() {
            addCriterion("csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(Integer value) {
            addCriterion("csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(Integer value) {
            addCriterion("csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(Integer value) {
            addCriterion("csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(Integer value) {
            addCriterion("csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(Integer value) {
            addCriterion("csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<Integer> values) {
            addCriterion("csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<Integer> values) {
            addCriterion("csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(Integer value1, Integer value2) {
            addCriterion("csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(Integer value1, Integer value2) {
            addCriterion("csex not between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCcomponyIsNull() {
            addCriterion("ccompony is null");
            return (Criteria) this;
        }

        public Criteria andCcomponyIsNotNull() {
            addCriterion("ccompony is not null");
            return (Criteria) this;
        }

        public Criteria andCcomponyEqualTo(String value) {
            addCriterion("ccompony =", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyNotEqualTo(String value) {
            addCriterion("ccompony <>", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyGreaterThan(String value) {
            addCriterion("ccompony >", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyGreaterThanOrEqualTo(String value) {
            addCriterion("ccompony >=", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyLessThan(String value) {
            addCriterion("ccompony <", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyLessThanOrEqualTo(String value) {
            addCriterion("ccompony <=", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyLike(String value) {
            addCriterion("ccompony like", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyNotLike(String value) {
            addCriterion("ccompony not like", value, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyIn(List<String> values) {
            addCriterion("ccompony in", values, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyNotIn(List<String> values) {
            addCriterion("ccompony not in", values, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyBetween(String value1, String value2) {
            addCriterion("ccompony between", value1, value2, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCcomponyNotBetween(String value1, String value2) {
            addCriterion("ccompony not between", value1, value2, "ccompony");
            return (Criteria) this;
        }

        public Criteria andCapplicantIsNull() {
            addCriterion("capplicant is null");
            return (Criteria) this;
        }

        public Criteria andCapplicantIsNotNull() {
            addCriterion("capplicant is not null");
            return (Criteria) this;
        }

        public Criteria andCapplicantEqualTo(String value) {
            addCriterion("capplicant =", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantNotEqualTo(String value) {
            addCriterion("capplicant <>", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantGreaterThan(String value) {
            addCriterion("capplicant >", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantGreaterThanOrEqualTo(String value) {
            addCriterion("capplicant >=", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantLessThan(String value) {
            addCriterion("capplicant <", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantLessThanOrEqualTo(String value) {
            addCriterion("capplicant <=", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantLike(String value) {
            addCriterion("capplicant like", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantNotLike(String value) {
            addCriterion("capplicant not like", value, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantIn(List<String> values) {
            addCriterion("capplicant in", values, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantNotIn(List<String> values) {
            addCriterion("capplicant not in", values, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantBetween(String value1, String value2) {
            addCriterion("capplicant between", value1, value2, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCapplicantNotBetween(String value1, String value2) {
            addCriterion("capplicant not between", value1, value2, "capplicant");
            return (Criteria) this;
        }

        public Criteria andCcontactIsNull() {
            addCriterion("ccontact is null");
            return (Criteria) this;
        }

        public Criteria andCcontactIsNotNull() {
            addCriterion("ccontact is not null");
            return (Criteria) this;
        }

        public Criteria andCcontactEqualTo(String value) {
            addCriterion("ccontact =", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactNotEqualTo(String value) {
            addCriterion("ccontact <>", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactGreaterThan(String value) {
            addCriterion("ccontact >", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactGreaterThanOrEqualTo(String value) {
            addCriterion("ccontact >=", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactLessThan(String value) {
            addCriterion("ccontact <", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactLessThanOrEqualTo(String value) {
            addCriterion("ccontact <=", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactLike(String value) {
            addCriterion("ccontact like", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactNotLike(String value) {
            addCriterion("ccontact not like", value, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactIn(List<String> values) {
            addCriterion("ccontact in", values, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactNotIn(List<String> values) {
            addCriterion("ccontact not in", values, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactBetween(String value1, String value2) {
            addCriterion("ccontact between", value1, value2, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCcontactNotBetween(String value1, String value2) {
            addCriterion("ccontact not between", value1, value2, "ccontact");
            return (Criteria) this;
        }

        public Criteria andCaddrIsNull() {
            addCriterion("caddr is null");
            return (Criteria) this;
        }

        public Criteria andCaddrIsNotNull() {
            addCriterion("caddr is not null");
            return (Criteria) this;
        }

        public Criteria andCaddrEqualTo(String value) {
            addCriterion("caddr =", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrNotEqualTo(String value) {
            addCriterion("caddr <>", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrGreaterThan(String value) {
            addCriterion("caddr >", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrGreaterThanOrEqualTo(String value) {
            addCriterion("caddr >=", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrLessThan(String value) {
            addCriterion("caddr <", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrLessThanOrEqualTo(String value) {
            addCriterion("caddr <=", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrLike(String value) {
            addCriterion("caddr like", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrNotLike(String value) {
            addCriterion("caddr not like", value, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrIn(List<String> values) {
            addCriterion("caddr in", values, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrNotIn(List<String> values) {
            addCriterion("caddr not in", values, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrBetween(String value1, String value2) {
            addCriterion("caddr between", value1, value2, "caddr");
            return (Criteria) this;
        }

        public Criteria andCaddrNotBetween(String value1, String value2) {
            addCriterion("caddr not between", value1, value2, "caddr");
            return (Criteria) this;
        }

        public Criteria andCstaticIsNull() {
            addCriterion("cstatic is null");
            return (Criteria) this;
        }

        public Criteria andCstaticIsNotNull() {
            addCriterion("cstatic is not null");
            return (Criteria) this;
        }

        public Criteria andCstaticEqualTo(Integer value) {
            addCriterion("cstatic =", value, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticNotEqualTo(Integer value) {
            addCriterion("cstatic <>", value, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticGreaterThan(Integer value) {
            addCriterion("cstatic >", value, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstatic >=", value, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticLessThan(Integer value) {
            addCriterion("cstatic <", value, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticLessThanOrEqualTo(Integer value) {
            addCriterion("cstatic <=", value, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticIn(List<Integer> values) {
            addCriterion("cstatic in", values, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticNotIn(List<Integer> values) {
            addCriterion("cstatic not in", values, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticBetween(Integer value1, Integer value2) {
            addCriterion("cstatic between", value1, value2, "cstatic");
            return (Criteria) this;
        }

        public Criteria andCstaticNotBetween(Integer value1, Integer value2) {
            addCriterion("cstatic not between", value1, value2, "cstatic");
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