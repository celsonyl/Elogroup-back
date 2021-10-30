package com.elogroup.demo.controller.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class UserRequest implements Serializable {
    private static final String PASSWORD_VALIDATE = "^((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,})$";

    @NotBlank(message = "Campo nao pode ser vazio ou nulo!")
    private String username;

    @NotBlank(message = "Campo nao pode ser vazio ou nulo!")
    @Pattern(regexp = UserRequest.PASSWORD_VALIDATE)
    private String password;

    public UserRequest() {
    }

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

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