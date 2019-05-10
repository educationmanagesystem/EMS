package shu.ems.service;


import shu.ems.model.Teacher;

public class TeacherService {
    public boolean insertTeacher(Teacher teacher) {
        // add to database
        return true;
    }

    public boolean updateTeacher(Teacher teacher) {
        // add to database
        return true;
    }

    public boolean deleteTeacher(int id) {
        //delete in database
        return true;
    }

    public Teacher findTeacherById(int id) {
        // find in database
        return null;
    }

    public Teacher findTeacherByName(String name) {
        // find in database
        return null;
    }

    public int checkTeacher(String id, String password) {
        // check
        Teacher teacher = null;
        if (teacher != null) {
            if (password.equals(teacher.getPassword())) {
                return teacher.getId();
            } else {   // password error
                return 0;
            }
        } else {   // teacher not found
            return -1;
        }
    }
}
