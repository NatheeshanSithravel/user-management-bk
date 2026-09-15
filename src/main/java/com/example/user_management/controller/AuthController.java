package com.example.user_management.controller;

import com.example.user_management.dto.LoginRequest;
import com.example.user_management.dto.LoginResponse;
import com.example.user_management.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(
            @Valid @RequestBody LoginRequest request
    ) {

        return authService.login(request);
    }
}