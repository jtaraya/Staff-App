package dao;

import models.Department;
import models.User;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oDepartmentDao implements DepartmentDao {

    private final Sql2o sql2o;

    public Sql2oDepartmentDao(Sql2o sql2o){
        this.sql2o = sql2o; //making the sql2o object available everywhere so we can call methods in it
    }

    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public void add(Department department) {

    }

    @Override
    public void addDepartmentToUser(Department department, User user) {

    }

    @Override
    public Department findById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsersByDepartment(int departmentId) {
        return null;
    }

    @Override
    public void updateEmployeeCount(int departmentId, int employeeCount) {

    }

    @Override
    public void update(int id, String name, String description) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAllDepartments() {

    }
}
