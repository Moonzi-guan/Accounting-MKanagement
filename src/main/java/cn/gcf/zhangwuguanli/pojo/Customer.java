package cn.gcf.zhangwuguanli.pojo;

public class Customer {
    private Integer cid;

    private String cpicture;

    private String cname;

    private Integer csex;

    private String ccompony;

    private String capplicant;

    private String ccontact;

    private String caddr;

    private Integer cstatic;

    private Integer ino;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCpicture() {
        return cpicture;
    }

    public void setCpicture(String cpicture) {
        this.cpicture = cpicture == null ? null : cpicture.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getCsex() {
        return csex;
    }

    public void setCsex(Integer csex) {
        this.csex = csex;
    }

    public String getCcompony() {
        return ccompony;
    }

    public void setCcompony(String ccompony) {
        this.ccompony = ccompony == null ? null : ccompony.trim();
    }

    public String getCapplicant() {
        return capplicant;
    }

    public void setCapplicant(String capplicant) {
        this.capplicant = capplicant == null ? null : capplicant.trim();
    }

    public String getCcontact() {
        return ccontact;
    }

    public void setCcontact(String ccontact) {
        this.ccontact = ccontact == null ? null : ccontact.trim();
    }

    public String getCaddr() {
        return caddr;
    }

    public void setCaddr(String caddr) {
        this.caddr = caddr == null ? null : caddr.trim();
    }

    public Integer getCstatic() {
        return cstatic;
    }

    public void setCstatic(Integer cstatic) {
        this.cstatic = cstatic;
    }

    public Integer getIno() {
        return ino;
    }

    public void setIno(Integer ino) {
        this.ino = ino;
    }
}