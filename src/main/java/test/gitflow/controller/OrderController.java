package test.gitflow.controller;

import org.springframework.web.bind.annotation.*;
import test.gitflow.domain.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/api/orders/{id}")
    public String getOrder(@PathVariable Long id) {
        return "id";
    }

    @PutMapping("/api/orders")
    public String saveOrder(Order order) {
        return "success";
    }
}
