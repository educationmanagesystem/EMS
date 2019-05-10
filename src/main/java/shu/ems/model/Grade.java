package shu.ems.model;

public class Grade {
    private int sno;
    private String semester;
    private int totalCredit;
    private double averageGrade;
    private double averageGPA;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getAverageGPA() {
        return averageGPA;
    }

    public void setAverageGPA(double averageGPA) {
        this.averageGPA = averageGPA;
    }
}
