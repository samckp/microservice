package com.microservice.dept.repository;

import com.microservice.dept.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepositiry extends JpaRepository<Department, Long> {

      Department findByDeptId(Long deptId);

}
