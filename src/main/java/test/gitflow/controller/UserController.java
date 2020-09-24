package test.gitflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.gitflow.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @PutMapping("/api/posts")
    public String join(User user) {
        return "success";
    }


}
