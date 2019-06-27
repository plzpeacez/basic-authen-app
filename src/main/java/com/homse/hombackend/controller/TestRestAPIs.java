package com.homse.hombackend.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@Api(value = "/api/test", description = "rest api endpoint to test auth and role of user", tags = { "Test rest API" })
public class TestRestAPIs {
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @ApiOperation(value = "Only user and admin role can access this resources")
    public String userAccess() {
        return ">>> User Contents!";
    }

    @GetMapping("/pm")
    @PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
    @ApiOperation(value = "Only PM and admin roles can access this resources")
    public String projectManagementAccess() {
        return ">>> Board Management Project";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    @ApiOperation(value = "only admin role can access this resources")
    public String adminAccess() {
        return ">>> Admin Contents";
    }
}
