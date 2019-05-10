package shu.ems.service;

import shu.ems.model.Course;

public class CourseService {
    public boolean insertCourse(Course course){
        return new CourseDAO().insertCourse(course);
    }

    public boolean updateCourse(Course course){
        return new CourseDAO().updateCourse(course);
    }

    public boolean deleteCourse(int id){
        return new CourseDAO().deleteCourse(id);
    }

    public Course findCourseById(int id){
        // find in database
        return null;
    }

    public Course findCourseByName(String name){
        // find in database
        return null;
    }
}
