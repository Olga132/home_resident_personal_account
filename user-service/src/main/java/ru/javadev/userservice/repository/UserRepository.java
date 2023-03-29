package ru.javadev.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javadev.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
