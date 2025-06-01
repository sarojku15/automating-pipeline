package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active=test")
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Ensure this test passes by fixing any configuration issues.
    }
}
