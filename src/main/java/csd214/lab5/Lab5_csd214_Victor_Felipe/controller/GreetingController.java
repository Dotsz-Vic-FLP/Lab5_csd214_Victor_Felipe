package csd214.lab5.Lab5_csd214_Victor_Felipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model
    ) // @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method
    {
        model.addAttribute("name", name); // adds an attribute to the model
        return "greeting"; // tells Spring to render the greeting.html template
    }
}
