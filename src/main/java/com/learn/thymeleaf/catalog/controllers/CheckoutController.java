package com.learn.thymeleaf.catalog.controllers;

import com.learn.thymeleaf.catalog.commands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CheckoutController {


    @GetMapping("/checkout")
    public String checkoutForm(Model model) {
        model.addAttribute("checkoutCommand", new CheckoutCommand());
        return "checkoutform";
    }

    @RequestMapping(value = "/doCheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "checkoutform";
        }

        return "checkoutcomplete";
    }
}
