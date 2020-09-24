package test.gitflow.controller;

import org.springframework.web.bind.annotation.*;
import test.gitflow.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @PutMapping("/api/users")
    public String join(User user) {
        return "success";
    }

    @GetMapping("/api/users/{id}")
    public Long getUser(@PathVariable Long id) {
        //hotfix
        return id;
    }

    @DeleteMapping("/api/users/{id}")
    public Long deleteUser(@PathVariable Long id) {
        return id;
    }
}
