package com.learn.thymeleaf.catalog.controllers;

import com.learn.thymeleaf.catalog.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginCommand", new LoginCommand());
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "/login";
        }
        return "redirect:/index";
    }
}
