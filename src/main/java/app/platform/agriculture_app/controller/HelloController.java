package app.platform.agriculture_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/home")
    public String home() {
        return "Agri DevOps Demo: running";
    }

}
