package dev.feder.controller;

import dev.feder.model.User;
import dev.feder.service.AuthService;
import dev.feder.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService userService;

    public AuthController(AuthService userService) {
        this.userService = userService;
    }

    @PostMapping(value = {"/signin", "/login"})
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody Map<String, String> params) {
        return userService.loginUser(params);
    }


    @PostMapping(value = {"/signup", "/register"})
    @ResponseStatus(HttpStatus.CREATED)
    public User register(@RequestBody Map<String, String> params) {
        return null;
        //disabled for now
//        return userService.createUser(params);
    }

}
