package com.example.models;

import com.example.messages.Validation;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotBlank(message = Validation.CAMPO_OBRIGATORIO)
    @Size(min = 5, max = 30, message = Validation.TAMANHO_STRING)
    @Column(name = "username", length = 190, nullable = false)
    private String username;

    @NotBlank(message = Validation.CAMPO_OBRIGATORIO)
    @Size(min = 5, max = 30, message = Validation.TAMANHO_STRING)
    @Column(name = "password", length = 190, nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
