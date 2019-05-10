package shu.ems.service;

import shu.ems.model.ElectiveCourse;

public class ElectiveService {
    public boolean insertElectiveCourse(ElectiveCourse electiveCourse){
        return new ElectiveCourseDAO().insertElectiveCourse(electiveCourse);
    }

    public boolean updateElectiveCourse(int id){
        return new ElectiveCourseDAO().deleteElectiveCourse(id);
    }

    public ElectiveCourse findElectiveCourseById(int id){
        // find in database
        return null;
    }

    public ElectiveCourse findElectiveCourseByStuId(int id){
        // find in database
        return null;
    }
}
