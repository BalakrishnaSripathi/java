package com.codewithme.www.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codewithme.www.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
