package cn.gcf.zhangwuguanli.pojo;

public class Orders {
    private Integer oid;

    private String ono;

    private String cname;

    private String iname;

    private String oname;

    private Integer oaid;

    private String opicture;

    private Long onumber;

    private Double omoney;

    private String ocategory;

    private Double osum;

    private String onewdate;

    private String ofinishdate;

    private String oaddr;

    private String ocontact;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOno() {
        return ono;
    }

    public void setOno(String ono) {
        this.ono = ono == null ? null : ono.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public Integer getOaid() {
        return oaid;
    }

    public void setOaid(Integer oaid) {
        this.oaid = oaid;
    }

    public String getOpicture() {
        return opicture;
    }

    public void setOpicture(String opicture) {
        this.opicture = opicture == null ? null : opicture.trim();
    }

    public Long getOnumber() {
        return onumber;
    }

    public void setOnumber(Long onumber) {
        this.onumber = onumber;
    }

    public Double getOmoney() {
        return omoney;
    }

    public void setOmoney(Double omoney) {
        this.omoney = omoney;
    }

    public String getOcategory() {
        return ocategory;
    }

    public void setOcategory(String ocategory) {
        this.ocategory = ocategory == null ? null : ocategory.trim();
    }

    public Double getOsum() {
        return osum;
    }

    public void setOsum(Double osum) {
        this.osum = osum;
    }

    public String getOnewdate() {
        return onewdate;
    }

    public void setOnewdate(String onewdate) {
        this.onewdate = onewdate == null ? null : onewdate.trim();
    }

    public String getOfinishdate() {
        return ofinishdate;
    }

    public void setOfinishdate(String ofinishdate) {
        this.ofinishdate = ofinishdate == null ? null : ofinishdate.trim();
    }

    public String getOaddr() {
        return oaddr;
    }

    public void setOaddr(String oaddr) {
        this.oaddr = oaddr == null ? null : oaddr.trim();
    }

    public String getOcontact() {
        return ocontact;
    }

    public void setOcontact(String ocontact) {
        this.ocontact = ocontact == null ? null : ocontact.trim();
    }
}