package com.gul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gul.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
