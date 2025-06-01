package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Use the test profile
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Testing database connection...");
        // Ensure this test passes by fixing any configuration issues.
    }
}
