package ru.javadev.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.javadev.userservice.model.User;
import ru.javadev.userservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/all")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<User> getAllUsers() {
        return userService.gelAllUsers();
    }
}
