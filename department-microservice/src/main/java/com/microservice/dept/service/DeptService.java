package com.microservice.dept.service;

import com.microservice.dept.entity.Department;
import com.microservice.dept.repository.DeptRepositiry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DeptService {

    @Autowired
    private DeptRepositiry deptRepositiry;

    public Department saveDept(Department dept){
        log.info("inside saveDept method of DeptService.");
        return deptRepositiry.save(dept);
    }
    public Department findByDeptId(Long deptId){

        log.info("inside findByDeptId method of DeptService.");
        return deptRepositiry.findByDeptId(deptId);
    }

    public List<Department> findAllDept(){

        log.info("inside findAllDept method of DeptService.");
        return deptRepositiry.findAll();
    }
}
