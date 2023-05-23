package com.smirnov.workout;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsPrimeController {
    @GetMapping(value = "/isPrime", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> isPrime(@RequestParam(name = "n") int n) {
        if (n < 0) {
            return ResponseEntity.badRequest().body("n < 0");
        }
        if (n == 0 || n == 1) {
            return ResponseEntity.ok("false");
        }

        if (n == 2 || n == 3) {
            return ResponseEntity.ok("true");
        }
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                return ResponseEntity.ok("false");
            }

        }
        return ResponseEntity.ok("true");
    }
}
