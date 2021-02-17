package com.learn.thymeleaf.catalog.commands;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CheckoutCommand {
    @NotEmpty
    @Size(min = 2, max = 50)
    private String name;
    @NotEmpty
    @Size(min = 2, max = 50)
    private String lastname;
    @NotEmpty
    @Size(min = 2, max = 50)
    private String address1;
    @NotEmpty
    @Size(min = 2, max = 50)
    private String address2;
    @NotEmpty
    @Size(min = 2, max = 50)
    private String city;
    @NotEmpty
    @Size(min = 2, max = 50)
    private String stateCode;
    @NotEmpty
    @Size(min = 2, max = 50)
    private String zipCode;
}
