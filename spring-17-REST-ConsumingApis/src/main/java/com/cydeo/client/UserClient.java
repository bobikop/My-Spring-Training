package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {

    // whenever we call getUser method url end point will be executed with get mapping when JSON will be assigned to our DTO
    @GetMapping("/users")
    List<User> getUsers();

}
