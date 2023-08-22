package com.example.mvc_demo1.Contoller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @GetMapping("/user")
    public static User getUser() {
        return new User("Tanya", "3745");
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        return user;
    }

}





