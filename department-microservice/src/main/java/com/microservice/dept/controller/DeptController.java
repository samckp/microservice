package com.microservice.dept.controller;

import com.microservice.dept.entity.Department;
import com.microservice.dept.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/")
    public Department saveDept(@RequestBody Department dept){
            log.info("inside saveDept method of DeptController.");
            return deptService.saveDept(dept);
    }

    @GetMapping("/{Id}")
    public Department getDeptById(@PathVariable("Id") Long deptId){
        log.info("inside saveDept method of DeptController.");
        return deptService.findByDeptId(deptId);
    }
    @GetMapping("/all")
    public List<Department> getAllDept(){
        log.info("inside saveDept method of DeptController.");
        return deptService.findAllDept();
    }
}
