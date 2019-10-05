package cn.gcf.zhangwuguanli.pojo;

public class Newin {
    private Integer nid;

    private String nusername;

    private Integer nsex;

    private String napplicant;

    private String ncontact;

    private String nedu;

    private String nprofession;

    private String nschool;

    private String nmanning;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNusername() {
        return nusername;
    }

    public void setNusername(String nusername) {
        this.nusername = nusername == null ? null : nusername.trim();
    }

    public Integer getNsex() {
        return nsex;
    }

    public void setNsex(Integer nsex) {
        this.nsex = nsex;
    }

    public String getNapplicant() {
        return napplicant;
    }

    public void setNapplicant(String napplicant) {
        this.napplicant = napplicant == null ? null : napplicant.trim();
    }

    public String getNcontact() {
        return ncontact;
    }

    public void setNcontact(String ncontact) {
        this.ncontact = ncontact == null ? null : ncontact.trim();
    }

    public String getNedu() {
        return nedu;
    }

    public void setNedu(String nedu) {
        this.nedu = nedu == null ? null : nedu.trim();
    }

    public String getNprofession() {
        return nprofession;
    }

    public void setNprofession(String nprofession) {
        this.nprofession = nprofession == null ? null : nprofession.trim();
    }

    public String getNschool() {
        return nschool;
    }

    public void setNschool(String nschool) {
        this.nschool = nschool == null ? null : nschool.trim();
    }

    public String getNmanning() {
        return nmanning;
    }

    public void setNmanning(String nmanning) {
        this.nmanning = nmanning == null ? null : nmanning.trim();
    }
}