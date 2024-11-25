package com.crm.JAMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/admin")
    public String adminPage() {
        return "Admin content only visible to users with ADMIN role.";
    }
}
