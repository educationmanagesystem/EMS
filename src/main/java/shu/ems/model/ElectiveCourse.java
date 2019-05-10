package shu.ems.model;

public class ElectiveCourse {
    private int id;
    private int sno;
    private String coid;
    private int pgrade;     // 平时成绩
    private int egrade;     // 考试成绩
    private double cgrade;  // 总评

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getCoid() {
        return coid;
    }

    public void setCoid(String coid) {
        this.coid = coid;
    }

    public int getPgrade() {
        return pgrade;
    }

    public void setPgrade(int pgrade) {
        this.pgrade = pgrade;
    }

    public int getEgrade() {
        return egrade;
    }

    public void setEgrade(int egrade) {
        this.egrade = egrade;
    }

    public double getCgrade() {
        return cgrade;
    }

    public void setCgrade(double cgrade) {
        this.cgrade = cgrade;
    }
}
