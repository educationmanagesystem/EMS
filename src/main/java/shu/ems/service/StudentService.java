package shu.ems.service;

import shu.ems.model.Student;

public class StudentService {
    public boolean insertStudent(Student student){
        return new StudentDAO().insertStudent(student);
    }

    public boolean updateStudent(Student student){
        return new StudentDAO().updateStudent(student);
    }

    public boolean deleteStudent(int id){
        return new StudentDAO().deleteStudent(id);
    }

    public Student findStudentById(int id){
        // find in database
        return null;
    }

    public Student findStudentByName(String name){
        // find in database
        return null;
    }

    public int checkStudent(String id, String password){
        // TODO
        //Student student = new StudentDAO().getStudentName();
        Student student = null;
        if(student != null){
            if(password.equals(student.getPassword())){
                return student.getId();
            }
            else{   // password error
                return 0;
            }
        }
        else{   // student not found
            return -1;
        }
    }
}
