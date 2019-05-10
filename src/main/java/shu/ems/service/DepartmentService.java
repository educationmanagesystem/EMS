package shu.ems.service;

import shu.ems.model.Department;

public class DepartmentService {
    public boolean insertDepartment(Department department){
        return new DepartmentDAO().insertDepartment(department);
    }

    public boolean updateDepartment(Department department){
        return new DepartmentDAO().updateDepartment(department);
    }

    public boolean deleteDepartment(int id){
        return new DepartmentDAO().deleteDepartment(id);
    }

    public Department findDepartmentById(int id){
        // find in database
        return null;
    }

    public Department findDepartmentByName(String name){
        // find in database
        return null;
    }
}
