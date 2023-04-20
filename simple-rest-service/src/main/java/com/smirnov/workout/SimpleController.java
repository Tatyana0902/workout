package com.smirnov.workout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/isPrime")
    public boolean isPrime(@RequestParam(name = "n") int n) {
        System.out.println(n);
        return true;
    }
}
