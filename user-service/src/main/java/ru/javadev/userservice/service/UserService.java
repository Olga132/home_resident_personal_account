package ru.javadev.userservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javadev.userservice.model.User;
import ru.javadev.userservice.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> gelAllUsers(){
        return userRepository.findAll();
    }
}
