package cn.gcf.zhangwuguanli.pojo;

public class Apporach {
    private Integer aid;

    private String ano;

    private String aname;

    private String apicture;

    private String aexpress;

    private String ainformation;

    private Integer anumber;

    private Double amoney;

    private String acategory;

    private String awarehouse;

    private Integer ino;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano == null ? null : ano.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApicture() {
        return apicture;
    }

    public void setApicture(String apicture) {
        this.apicture = apicture == null ? null : apicture.trim();
    }

    public String getAexpress() {
        return aexpress;
    }

    public void setAexpress(String aexpress) {
        this.aexpress = aexpress == null ? null : aexpress.trim();
    }

    public String getAinformation() {
        return ainformation;
    }

    public void setAinformation(String ainformation) {
        this.ainformation = ainformation == null ? null : ainformation.trim();
    }

    public Integer getAnumber() {
        return anumber;
    }

    public void setAnumber(Integer anumber) {
        this.anumber = anumber;
    }

    public Double getAmoney() {
        return amoney;
    }

    public void setAmoney(Double amoney) {
        this.amoney = amoney;
    }

    public String getAcategory() {
        return acategory;
    }

    public void setAcategory(String acategory) {
        this.acategory = acategory == null ? null : acategory.trim();
    }

    public String getAwarehouse() {
        return awarehouse;
    }

    public void setAwarehouse(String awarehouse) {
        this.awarehouse = awarehouse == null ? null : awarehouse.trim();
    }

    public Integer getIno() {
        return ino;
    }

    public void setIno(Integer ino) {
        this.ino = ino;
    }
}