package shu.ems.service;

import shu.ems.model.Grade;

public class GradeService {
    public boolean insertGrade(Grade grade){
        return new GradeDAO().insertGrade(grade);
    }

    public boolean updateGrade(Grade grade){
        return new GradeDAO().updateGrade(grade);
    }

    public boolean deleteGrade(int id){
        return new GradeDAO().deleteGrade(id);
    }

    public Grade findGradeById(int id){
        // find in database
        return null;
    }

    public Grade findGradeByStuId(int id){
        // find in database
        return null;
    }
}
