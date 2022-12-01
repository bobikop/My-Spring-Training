package com.cydeo.client;

import com.cydeo.dto.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url="https://dummyapi.io",name = "EMPLOYEE-CLIENT")  // to use feign client we need this annotation and we need to define url source
// and give it the name
public interface EmployeeClient {

    @GetMapping("/data/v1/user?limit=10")
    Employee getEmployee(@RequestHeader("app-id") String id); // one employe or List for more than one employee
}
