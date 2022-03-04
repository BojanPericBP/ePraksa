package org.unibl.etf.epraksa.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.unibl.etf.epraksa.model.requests.LoginRequest;
import org.unibl.etf.epraksa.services.AuthService;

import javax.validation.Valid;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("api/v1/authLogin")
    public ResponseEntity<Object> login(@RequestBody @Valid LoginRequest request)
    {
        return authService.login(request);
    }
}