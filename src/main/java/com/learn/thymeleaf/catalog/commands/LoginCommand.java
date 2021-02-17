package com.learn.thymeleaf.catalog.commands;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class LoginCommand {

    @NotEmpty
    @Size(min = 5, max = 20)
    private String username;

    @NotEmpty
    @Size(min = 5, max = 20)
    private String password;
}
