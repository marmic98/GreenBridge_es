package com.greenbridge.controllers;

import com.greenbridge.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.greenbridge.entities.Nota;
import com.greenbridge.services.NotaService;


@Controller
public class NotaController {
    
    @Autowired
    private NotaService notaService;

    @GetMapping("/home")
    public String saveView(Model model) {
        model.addAttribute("user", new User());
        return "pages/user/home";
    }

    @GetMapping("/update")
    public String updateView(Model model) {
        model.addAttribute("user", new User());
        return "pages/user/update";
    }
}
