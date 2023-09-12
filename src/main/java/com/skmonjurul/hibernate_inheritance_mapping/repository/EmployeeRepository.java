package com.skmonjurul.hibernate_inheritance_mapping.repository;

import com.skmonjurul.hibernate_inheritance_mapping.entity.mapped_superclass.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
