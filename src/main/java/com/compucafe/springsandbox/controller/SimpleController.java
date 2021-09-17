package com.compucafe.springsandbox.controller;

import org.springframework.hateoas.Link;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @GetMapping("/")
    public String basicGet(@RequestParam(name="name", required=false) String name, Model model) {
        Link link = Link.of("home");
        model.addAttribute("link", link);
        model.addAttribute("name",name);
        return "home";
    }
}
