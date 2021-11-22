package com.microservice.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethod {

    @GetMapping("/usersServiceFallBack")
    public String userServiceFallBack(){

        return "User Service is taking longer than expected."
                +"\nPlease try again later !!";
    }

    @GetMapping("/deptServiceFallBack")
    public String deptServiceFallBack(){

        return "Department Service is taking longer than expected."
                +"\nPlease try again later !!";
    }

}
