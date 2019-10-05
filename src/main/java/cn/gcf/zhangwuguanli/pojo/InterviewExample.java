package cn.gcf.zhangwuguanli.pojo;

import java.util.ArrayList;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIusernameIsNull() {
            addCriterion("iusername is null");
            return (Criteria) this;
        }

        public Criteria andIusernameIsNotNull() {
            addCriterion("iusername is not null");
            return (Criteria) this;
        }

        public Criteria andIusernameEqualTo(String value) {
            addCriterion("iusername =", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotEqualTo(String value) {
            addCriterion("iusername <>", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameGreaterThan(String value) {
            addCriterion("iusername >", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameGreaterThanOrEqualTo(String value) {
            addCriterion("iusername >=", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameLessThan(String value) {
            addCriterion("iusername <", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameLessThanOrEqualTo(String value) {
            addCriterion("iusername <=", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameLike(String value) {
            addCriterion("iusername like", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotLike(String value) {
            addCriterion("iusername not like", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameIn(List<String> values) {
            addCriterion("iusername in", values, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotIn(List<String> values) {
            addCriterion("iusername not in", values, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameBetween(String value1, String value2) {
            addCriterion("iusername between", value1, value2, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotBetween(String value1, String value2) {
            addCriterion("iusername not between", value1, value2, "iusername");
            return (Criteria) this;
        }

        public Criteria andIsexIsNull() {
            addCriterion("isex is null");
            return (Criteria) this;
        }

        public Criteria andIsexIsNotNull() {
            addCriterion("isex is not null");
            return (Criteria) this;
        }

        public Criteria andIsexEqualTo(Integer value) {
            addCriterion("isex =", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotEqualTo(Integer value) {
            addCriterion("isex <>", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexGreaterThan(Integer value) {
            addCriterion("isex >", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("isex >=", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexLessThan(Integer value) {
            addCriterion("isex <", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexLessThanOrEqualTo(Integer value) {
            addCriterion("isex <=", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexIn(List<Integer> values) {
            addCriterion("isex in", values, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotIn(List<Integer> values) {
            addCriterion("isex not in", values, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexBetween(Integer value1, Integer value2) {
            addCriterion("isex between", value1, value2, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotBetween(Integer value1, Integer value2) {
            addCriterion("isex not between", value1, value2, "isex");
            return (Criteria) this;
        }

        public Criteria andIapplicantIsNull() {
            addCriterion("iapplicant is null");
            return (Criteria) this;
        }

        public Criteria andIapplicantIsNotNull() {
            addCriterion("iapplicant is not null");
            return (Criteria) this;
        }

        public Criteria andIapplicantEqualTo(String value) {
            addCriterion("iapplicant =", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantNotEqualTo(String value) {
            addCriterion("iapplicant <>", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantGreaterThan(String value) {
            addCriterion("iapplicant >", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantGreaterThanOrEqualTo(String value) {
            addCriterion("iapplicant >=", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantLessThan(String value) {
            addCriterion("iapplicant <", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantLessThanOrEqualTo(String value) {
            addCriterion("iapplicant <=", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantLike(String value) {
            addCriterion("iapplicant like", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantNotLike(String value) {
            addCriterion("iapplicant not like", value, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantIn(List<String> values) {
            addCriterion("iapplicant in", values, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantNotIn(List<String> values) {
            addCriterion("iapplicant not in", values, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantBetween(String value1, String value2) {
            addCriterion("iapplicant between", value1, value2, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIapplicantNotBetween(String value1, String value2) {
            addCriterion("iapplicant not between", value1, value2, "iapplicant");
            return (Criteria) this;
        }

        public Criteria andIcontactIsNull() {
            addCriterion("icontact is null");
            return (Criteria) this;
        }

        public Criteria andIcontactIsNotNull() {
            addCriterion("icontact is not null");
            return (Criteria) this;
        }

        public Criteria andIcontactEqualTo(String value) {
            addCriterion("icontact =", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactNotEqualTo(String value) {
            addCriterion("icontact <>", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactGreaterThan(String value) {
            addCriterion("icontact >", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactGreaterThanOrEqualTo(String value) {
            addCriterion("icontact >=", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactLessThan(String value) {
            addCriterion("icontact <", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactLessThanOrEqualTo(String value) {
            addCriterion("icontact <=", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactLike(String value) {
            addCriterion("icontact like", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactNotLike(String value) {
            addCriterion("icontact not like", value, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactIn(List<String> values) {
            addCriterion("icontact in", values, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactNotIn(List<String> values) {
            addCriterion("icontact not in", values, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactBetween(String value1, String value2) {
            addCriterion("icontact between", value1, value2, "icontact");
            return (Criteria) this;
        }

        public Criteria andIcontactNotBetween(String value1, String value2) {
            addCriterion("icontact not between", value1, value2, "icontact");
            return (Criteria) this;
        }

        public Criteria andIeduIsNull() {
            addCriterion("iedu is null");
            return (Criteria) this;
        }

        public Criteria andIeduIsNotNull() {
            addCriterion("iedu is not null");
            return (Criteria) this;
        }

        public Criteria andIeduEqualTo(String value) {
            addCriterion("iedu =", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduNotEqualTo(String value) {
            addCriterion("iedu <>", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduGreaterThan(String value) {
            addCriterion("iedu >", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduGreaterThanOrEqualTo(String value) {
            addCriterion("iedu >=", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduLessThan(String value) {
            addCriterion("iedu <", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduLessThanOrEqualTo(String value) {
            addCriterion("iedu <=", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduLike(String value) {
            addCriterion("iedu like", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduNotLike(String value) {
            addCriterion("iedu not like", value, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduIn(List<String> values) {
            addCriterion("iedu in", values, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduNotIn(List<String> values) {
            addCriterion("iedu not in", values, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduBetween(String value1, String value2) {
            addCriterion("iedu between", value1, value2, "iedu");
            return (Criteria) this;
        }

        public Criteria andIeduNotBetween(String value1, String value2) {
            addCriterion("iedu not between", value1, value2, "iedu");
            return (Criteria) this;
        }

        public Criteria andIschoolIsNull() {
            addCriterion("ischool is null");
            return (Criteria) this;
        }

        public Criteria andIschoolIsNotNull() {
            addCriterion("ischool is not null");
            return (Criteria) this;
        }

        public Criteria andIschoolEqualTo(String value) {
            addCriterion("ischool =", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolNotEqualTo(String value) {
            addCriterion("ischool <>", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolGreaterThan(String value) {
            addCriterion("ischool >", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolGreaterThanOrEqualTo(String value) {
            addCriterion("ischool >=", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolLessThan(String value) {
            addCriterion("ischool <", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolLessThanOrEqualTo(String value) {
            addCriterion("ischool <=", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolLike(String value) {
            addCriterion("ischool like", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolNotLike(String value) {
            addCriterion("ischool not like", value, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolIn(List<String> values) {
            addCriterion("ischool in", values, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolNotIn(List<String> values) {
            addCriterion("ischool not in", values, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolBetween(String value1, String value2) {
            addCriterion("ischool between", value1, value2, "ischool");
            return (Criteria) this;
        }

        public Criteria andIschoolNotBetween(String value1, String value2) {
            addCriterion("ischool not between", value1, value2, "ischool");
            return (Criteria) this;
        }

        public Criteria andIprofessionIsNull() {
            addCriterion("iprofession is null");
            return (Criteria) this;
        }

        public Criteria andIprofessionIsNotNull() {
            addCriterion("iprofession is not null");
            return (Criteria) this;
        }

        public Criteria andIprofessionEqualTo(String value) {
            addCriterion("iprofession =", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionNotEqualTo(String value) {
            addCriterion("iprofession <>", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionGreaterThan(String value) {
            addCriterion("iprofession >", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("iprofession >=", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionLessThan(String value) {
            addCriterion("iprofession <", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionLessThanOrEqualTo(String value) {
            addCriterion("iprofession <=", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionLike(String value) {
            addCriterion("iprofession like", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionNotLike(String value) {
            addCriterion("iprofession not like", value, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionIn(List<String> values) {
            addCriterion("iprofession in", values, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionNotIn(List<String> values) {
            addCriterion("iprofession not in", values, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionBetween(String value1, String value2) {
            addCriterion("iprofession between", value1, value2, "iprofession");
            return (Criteria) this;
        }

        public Criteria andIprofessionNotBetween(String value1, String value2) {
            addCriterion("iprofession not between", value1, value2, "iprofession");
            return (Criteria) this;
        }

        public Criteria andImanningIsNull() {
            addCriterion("imanning is null");
            return (Criteria) this;
        }

        public Criteria andImanningIsNotNull() {
            addCriterion("imanning is not null");
            return (Criteria) this;
        }

        public Criteria andImanningEqualTo(String value) {
            addCriterion("imanning =", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningNotEqualTo(String value) {
            addCriterion("imanning <>", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningGreaterThan(String value) {
            addCriterion("imanning >", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningGreaterThanOrEqualTo(String value) {
            addCriterion("imanning >=", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningLessThan(String value) {
            addCriterion("imanning <", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningLessThanOrEqualTo(String value) {
            addCriterion("imanning <=", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningLike(String value) {
            addCriterion("imanning like", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningNotLike(String value) {
            addCriterion("imanning not like", value, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningIn(List<String> values) {
            addCriterion("imanning in", values, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningNotIn(List<String> values) {
            addCriterion("imanning not in", values, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningBetween(String value1, String value2) {
            addCriterion("imanning between", value1, value2, "imanning");
            return (Criteria) this;
        }

        public Criteria andImanningNotBetween(String value1, String value2) {
            addCriterion("imanning not between", value1, value2, "imanning");
            return (Criteria) this;
        }

        public Criteria andIresumeIsNull() {
            addCriterion("iresume is null");
            return (Criteria) this;
        }

        public Criteria andIresumeIsNotNull() {
            addCriterion("iresume is not null");
            return (Criteria) this;
        }

        public Criteria andIresumeEqualTo(String value) {
            addCriterion("iresume =", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeNotEqualTo(String value) {
            addCriterion("iresume <>", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeGreaterThan(String value) {
            addCriterion("iresume >", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeGreaterThanOrEqualTo(String value) {
            addCriterion("iresume >=", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeLessThan(String value) {
            addCriterion("iresume <", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeLessThanOrEqualTo(String value) {
            addCriterion("iresume <=", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeLike(String value) {
            addCriterion("iresume like", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeNotLike(String value) {
            addCriterion("iresume not like", value, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeIn(List<String> values) {
            addCriterion("iresume in", values, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeNotIn(List<String> values) {
            addCriterion("iresume not in", values, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeBetween(String value1, String value2) {
            addCriterion("iresume between", value1, value2, "iresume");
            return (Criteria) this;
        }

        public Criteria andIresumeNotBetween(String value1, String value2) {
            addCriterion("iresume not between", value1, value2, "iresume");
            return (Criteria) this;
        }

        public Criteria andIdetailIsNull() {
            addCriterion("idetail is null");
            return (Criteria) this;
        }

        public Criteria andIdetailIsNotNull() {
            addCriterion("idetail is not null");
            return (Criteria) this;
        }

        public Criteria andIdetailEqualTo(String value) {
            addCriterion("idetail =", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailNotEqualTo(String value) {
            addCriterion("idetail <>", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailGreaterThan(String value) {
            addCriterion("idetail >", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailGreaterThanOrEqualTo(String value) {
            addCriterion("idetail >=", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailLessThan(String value) {
            addCriterion("idetail <", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailLessThanOrEqualTo(String value) {
            addCriterion("idetail <=", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailLike(String value) {
            addCriterion("idetail like", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailNotLike(String value) {
            addCriterion("idetail not like", value, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailIn(List<String> values) {
            addCriterion("idetail in", values, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailNotIn(List<String> values) {
            addCriterion("idetail not in", values, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailBetween(String value1, String value2) {
            addCriterion("idetail between", value1, value2, "idetail");
            return (Criteria) this;
        }

        public Criteria andIdetailNotBetween(String value1, String value2) {
            addCriterion("idetail not between", value1, value2, "idetail");
            return (Criteria) this;
        }

        public Criteria andIpictureIsNull() {
            addCriterion("ipicture is null");
            return (Criteria) this;
        }

        public Criteria andIpictureIsNotNull() {
            addCriterion("ipicture is not null");
            return (Criteria) this;
        }

        public Criteria andIpictureEqualTo(String value) {
            addCriterion("ipicture =", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureNotEqualTo(String value) {
            addCriterion("ipicture <>", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureGreaterThan(String value) {
            addCriterion("ipicture >", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureGreaterThanOrEqualTo(String value) {
            addCriterion("ipicture >=", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureLessThan(String value) {
            addCriterion("ipicture <", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureLessThanOrEqualTo(String value) {
            addCriterion("ipicture <=", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureLike(String value) {
            addCriterion("ipicture like", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureNotLike(String value) {
            addCriterion("ipicture not like", value, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureIn(List<String> values) {
            addCriterion("ipicture in", values, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureNotIn(List<String> values) {
            addCriterion("ipicture not in", values, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureBetween(String value1, String value2) {
            addCriterion("ipicture between", value1, value2, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIpictureNotBetween(String value1, String value2) {
            addCriterion("ipicture not between", value1, value2, "ipicture");
            return (Criteria) this;
        }

        public Criteria andIevaluateIsNull() {
            addCriterion("ievaluate is null");
            return (Criteria) this;
        }

        public Criteria andIevaluateIsNotNull() {
            addCriterion("ievaluate is not null");
            return (Criteria) this;
        }

        public Criteria andIevaluateEqualTo(String value) {
            addCriterion("ievaluate =", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateNotEqualTo(String value) {
            addCriterion("ievaluate <>", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateGreaterThan(String value) {
            addCriterion("ievaluate >", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateGreaterThanOrEqualTo(String value) {
            addCriterion("ievaluate >=", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateLessThan(String value) {
            addCriterion("ievaluate <", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateLessThanOrEqualTo(String value) {
            addCriterion("ievaluate <=", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateLike(String value) {
            addCriterion("ievaluate like", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateNotLike(String value) {
            addCriterion("ievaluate not like", value, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateIn(List<String> values) {
            addCriterion("ievaluate in", values, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateNotIn(List<String> values) {
            addCriterion("ievaluate not in", values, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateBetween(String value1, String value2) {
            addCriterion("ievaluate between", value1, value2, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIevaluateNotBetween(String value1, String value2) {
            addCriterion("ievaluate not between", value1, value2, "ievaluate");
            return (Criteria) this;
        }

        public Criteria andIstatusIsNull() {
            addCriterion("istatus is null");
            return (Criteria) this;
        }

        public Criteria andIstatusIsNotNull() {
            addCriterion("istatus is not null");
            return (Criteria) this;
        }

        public Criteria andIstatusEqualTo(Integer value) {
            addCriterion("istatus =", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotEqualTo(Integer value) {
            addCriterion("istatus <>", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusGreaterThan(Integer value) {
            addCriterion("istatus >", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("istatus >=", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusLessThan(Integer value) {
            addCriterion("istatus <", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusLessThanOrEqualTo(Integer value) {
            addCriterion("istatus <=", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusIn(List<Integer> values) {
            addCriterion("istatus in", values, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotIn(List<Integer> values) {
            addCriterion("istatus not in", values, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusBetween(Integer value1, Integer value2) {
            addCriterion("istatus between", value1, value2, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("istatus not between", value1, value2, "istatus");
            return (Criteria) this;
        }

        public Criteria andIexperienceIsNull() {
            addCriterion("iexperience is null");
            return (Criteria) this;
        }

        public Criteria andIexperienceIsNotNull() {
            addCriterion("iexperience is not null");
            return (Criteria) this;
        }

        public Criteria andIexperienceEqualTo(String value) {
            addCriterion("iexperience =", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceNotEqualTo(String value) {
            addCriterion("iexperience <>", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceGreaterThan(String value) {
            addCriterion("iexperience >", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("iexperience >=", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceLessThan(String value) {
            addCriterion("iexperience <", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceLessThanOrEqualTo(String value) {
            addCriterion("iexperience <=", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceLike(String value) {
            addCriterion("iexperience like", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceNotLike(String value) {
            addCriterion("iexperience not like", value, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceIn(List<String> values) {
            addCriterion("iexperience in", values, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceNotIn(List<String> values) {
            addCriterion("iexperience not in", values, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceBetween(String value1, String value2) {
            addCriterion("iexperience between", value1, value2, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIexperienceNotBetween(String value1, String value2) {
            addCriterion("iexperience not between", value1, value2, "iexperience");
            return (Criteria) this;
        }

        public Criteria andIgradeIsNull() {
            addCriterion("igrade is null");
            return (Criteria) this;
        }

        public Criteria andIgradeIsNotNull() {
            addCriterion("igrade is not null");
            return (Criteria) this;
        }

        public Criteria andIgradeEqualTo(String value) {
            addCriterion("igrade =", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeNotEqualTo(String value) {
            addCriterion("igrade <>", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeGreaterThan(String value) {
            addCriterion("igrade >", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeGreaterThanOrEqualTo(String value) {
            addCriterion("igrade >=", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeLessThan(String value) {
            addCriterion("igrade <", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeLessThanOrEqualTo(String value) {
            addCriterion("igrade <=", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeLike(String value) {
            addCriterion("igrade like", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeNotLike(String value) {
            addCriterion("igrade not like", value, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeIn(List<String> values) {
            addCriterion("igrade in", values, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeNotIn(List<String> values) {
            addCriterion("igrade not in", values, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeBetween(String value1, String value2) {
            addCriterion("igrade between", value1, value2, "igrade");
            return (Criteria) this;
        }

        public Criteria andIgradeNotBetween(String value1, String value2) {
            addCriterion("igrade not between", value1, value2, "igrade");
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