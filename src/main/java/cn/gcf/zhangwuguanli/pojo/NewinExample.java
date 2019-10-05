package cn.gcf.zhangwuguanli.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewinExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNusernameIsNull() {
            addCriterion("nusername is null");
            return (Criteria) this;
        }

        public Criteria andNusernameIsNotNull() {
            addCriterion("nusername is not null");
            return (Criteria) this;
        }

        public Criteria andNusernameEqualTo(String value) {
            addCriterion("nusername =", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameNotEqualTo(String value) {
            addCriterion("nusername <>", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameGreaterThan(String value) {
            addCriterion("nusername >", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameGreaterThanOrEqualTo(String value) {
            addCriterion("nusername >=", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameLessThan(String value) {
            addCriterion("nusername <", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameLessThanOrEqualTo(String value) {
            addCriterion("nusername <=", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameLike(String value) {
            addCriterion("nusername like", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameNotLike(String value) {
            addCriterion("nusername not like", value, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameIn(List<String> values) {
            addCriterion("nusername in", values, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameNotIn(List<String> values) {
            addCriterion("nusername not in", values, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameBetween(String value1, String value2) {
            addCriterion("nusername between", value1, value2, "nusername");
            return (Criteria) this;
        }

        public Criteria andNusernameNotBetween(String value1, String value2) {
            addCriterion("nusername not between", value1, value2, "nusername");
            return (Criteria) this;
        }

        public Criteria andNsexIsNull() {
            addCriterion("nsex is null");
            return (Criteria) this;
        }

        public Criteria andNsexIsNotNull() {
            addCriterion("nsex is not null");
            return (Criteria) this;
        }

        public Criteria andNsexEqualTo(Integer value) {
            addCriterion("nsex =", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotEqualTo(Integer value) {
            addCriterion("nsex <>", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexGreaterThan(Integer value) {
            addCriterion("nsex >", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("nsex >=", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLessThan(Integer value) {
            addCriterion("nsex <", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLessThanOrEqualTo(Integer value) {
            addCriterion("nsex <=", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexIn(List<Integer> values) {
            addCriterion("nsex in", values, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotIn(List<Integer> values) {
            addCriterion("nsex not in", values, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexBetween(Integer value1, Integer value2) {
            addCriterion("nsex between", value1, value2, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotBetween(Integer value1, Integer value2) {
            addCriterion("nsex not between", value1, value2, "nsex");
            return (Criteria) this;
        }

        public Criteria andNapplicantIsNull() {
            addCriterion("napplicant is null");
            return (Criteria) this;
        }

        public Criteria andNapplicantIsNotNull() {
            addCriterion("napplicant is not null");
            return (Criteria) this;
        }

        public Criteria andNapplicantEqualTo(String value) {
            addCriterion("napplicant =", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantNotEqualTo(String value) {
            addCriterion("napplicant <>", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantGreaterThan(String value) {
            addCriterion("napplicant >", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantGreaterThanOrEqualTo(String value) {
            addCriterion("napplicant >=", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantLessThan(String value) {
            addCriterion("napplicant <", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantLessThanOrEqualTo(String value) {
            addCriterion("napplicant <=", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantLike(String value) {
            addCriterion("napplicant like", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantNotLike(String value) {
            addCriterion("napplicant not like", value, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantIn(List<String> values) {
            addCriterion("napplicant in", values, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantNotIn(List<String> values) {
            addCriterion("napplicant not in", values, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantBetween(String value1, String value2) {
            addCriterion("napplicant between", value1, value2, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNapplicantNotBetween(String value1, String value2) {
            addCriterion("napplicant not between", value1, value2, "napplicant");
            return (Criteria) this;
        }

        public Criteria andNcontactIsNull() {
            addCriterion("ncontact is null");
            return (Criteria) this;
        }

        public Criteria andNcontactIsNotNull() {
            addCriterion("ncontact is not null");
            return (Criteria) this;
        }

        public Criteria andNcontactEqualTo(String value) {
            addCriterion("ncontact =", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactNotEqualTo(String value) {
            addCriterion("ncontact <>", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactGreaterThan(String value) {
            addCriterion("ncontact >", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactGreaterThanOrEqualTo(String value) {
            addCriterion("ncontact >=", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactLessThan(String value) {
            addCriterion("ncontact <", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactLessThanOrEqualTo(String value) {
            addCriterion("ncontact <=", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactLike(String value) {
            addCriterion("ncontact like", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactNotLike(String value) {
            addCriterion("ncontact not like", value, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactIn(List<String> values) {
            addCriterion("ncontact in", values, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactNotIn(List<String> values) {
            addCriterion("ncontact not in", values, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactBetween(String value1, String value2) {
            addCriterion("ncontact between", value1, value2, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNcontactNotBetween(String value1, String value2) {
            addCriterion("ncontact not between", value1, value2, "ncontact");
            return (Criteria) this;
        }

        public Criteria andNeduIsNull() {
            addCriterion("nedu is null");
            return (Criteria) this;
        }

        public Criteria andNeduIsNotNull() {
            addCriterion("nedu is not null");
            return (Criteria) this;
        }

        public Criteria andNeduEqualTo(String value) {
            addCriterion("nedu =", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduNotEqualTo(String value) {
            addCriterion("nedu <>", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduGreaterThan(String value) {
            addCriterion("nedu >", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduGreaterThanOrEqualTo(String value) {
            addCriterion("nedu >=", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduLessThan(String value) {
            addCriterion("nedu <", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduLessThanOrEqualTo(String value) {
            addCriterion("nedu <=", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduLike(String value) {
            addCriterion("nedu like", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduNotLike(String value) {
            addCriterion("nedu not like", value, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduIn(List<String> values) {
            addCriterion("nedu in", values, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduNotIn(List<String> values) {
            addCriterion("nedu not in", values, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduBetween(String value1, String value2) {
            addCriterion("nedu between", value1, value2, "nedu");
            return (Criteria) this;
        }

        public Criteria andNeduNotBetween(String value1, String value2) {
            addCriterion("nedu not between", value1, value2, "nedu");
            return (Criteria) this;
        }

        public Criteria andNprofessionIsNull() {
            addCriterion("nprofession is null");
            return (Criteria) this;
        }

        public Criteria andNprofessionIsNotNull() {
            addCriterion("nprofession is not null");
            return (Criteria) this;
        }

        public Criteria andNprofessionEqualTo(String value) {
            addCriterion("nprofession =", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionNotEqualTo(String value) {
            addCriterion("nprofession <>", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionGreaterThan(String value) {
            addCriterion("nprofession >", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("nprofession >=", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionLessThan(String value) {
            addCriterion("nprofession <", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionLessThanOrEqualTo(String value) {
            addCriterion("nprofession <=", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionLike(String value) {
            addCriterion("nprofession like", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionNotLike(String value) {
            addCriterion("nprofession not like", value, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionIn(List<String> values) {
            addCriterion("nprofession in", values, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionNotIn(List<String> values) {
            addCriterion("nprofession not in", values, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionBetween(String value1, String value2) {
            addCriterion("nprofession between", value1, value2, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNprofessionNotBetween(String value1, String value2) {
            addCriterion("nprofession not between", value1, value2, "nprofession");
            return (Criteria) this;
        }

        public Criteria andNschoolIsNull() {
            addCriterion("nschool is null");
            return (Criteria) this;
        }

        public Criteria andNschoolIsNotNull() {
            addCriterion("nschool is not null");
            return (Criteria) this;
        }

        public Criteria andNschoolEqualTo(String value) {
            addCriterion("nschool =", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotEqualTo(String value) {
            addCriterion("nschool <>", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolGreaterThan(String value) {
            addCriterion("nschool >", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolGreaterThanOrEqualTo(String value) {
            addCriterion("nschool >=", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolLessThan(String value) {
            addCriterion("nschool <", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolLessThanOrEqualTo(String value) {
            addCriterion("nschool <=", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolLike(String value) {
            addCriterion("nschool like", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotLike(String value) {
            addCriterion("nschool not like", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolIn(List<String> values) {
            addCriterion("nschool in", values, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotIn(List<String> values) {
            addCriterion("nschool not in", values, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolBetween(String value1, String value2) {
            addCriterion("nschool between", value1, value2, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotBetween(String value1, String value2) {
            addCriterion("nschool not between", value1, value2, "nschool");
            return (Criteria) this;
        }

        public Criteria andNmanningIsNull() {
            addCriterion("nmanning is null");
            return (Criteria) this;
        }

        public Criteria andNmanningIsNotNull() {
            addCriterion("nmanning is not null");
            return (Criteria) this;
        }

        public Criteria andNmanningEqualTo(String value) {
            addCriterion("nmanning =", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningNotEqualTo(String value) {
            addCriterion("nmanning <>", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningGreaterThan(String value) {
            addCriterion("nmanning >", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningGreaterThanOrEqualTo(String value) {
            addCriterion("nmanning >=", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningLessThan(String value) {
            addCriterion("nmanning <", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningLessThanOrEqualTo(String value) {
            addCriterion("nmanning <=", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningLike(String value) {
            addCriterion("nmanning like", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningNotLike(String value) {
            addCriterion("nmanning not like", value, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningIn(List<String> values) {
            addCriterion("nmanning in", values, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningNotIn(List<String> values) {
            addCriterion("nmanning not in", values, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningBetween(String value1, String value2) {
            addCriterion("nmanning between", value1, value2, "nmanning");
            return (Criteria) this;
        }

        public Criteria andNmanningNotBetween(String value1, String value2) {
            addCriterion("nmanning not between", value1, value2, "nmanning");
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