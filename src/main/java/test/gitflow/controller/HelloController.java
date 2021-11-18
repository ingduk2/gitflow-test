package test.gitflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/")
    public String main() {
        //merge test
        return "main";
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @PostMapping("/api/post")
    public String post() {
        return "post";
    }

    @PutMapping("api/put")
    public String put() {
        return "put";
    }
}
