package ru.javadev.userservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.javadev.userservice.model.enums.Role;

import java.util.HashSet;
import java.util.Set;


@Entity
@Setter
@Getter
@Table(name = "t_users")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name = "active")
    private boolean active;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "t_user_role",
            joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();
}
