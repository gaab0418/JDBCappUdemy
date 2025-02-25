package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartamentDao {
    void insert(Department department);
    void update(Department department);
    void delete(Department department);
    Department findById(int id);
    List<Department> findAll();
}
