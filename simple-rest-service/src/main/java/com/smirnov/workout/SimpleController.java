package com.smirnov.workout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/isPrime")
    public boolean isPrime(@RequestParam(name = "n") int n) {
//        for (int i = 0; i < n; i++);
//        if (n % 1 ==0 &
//        )   n % n ==0 % &!()
//        System.out.println(n);
        return n % 2 == 0; // FIX ME
    }
}
