package app.platform.agriculture_app.controller;

import app.platform.agriculture_app.service.AgricultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgricultureController {

    @Autowired
    private AgricultureService agricultureService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("farmers", agricultureService.getAllFarmers());
        model.addAttribute("suppliers", agricultureService.getAllSuppliers());
        model.addAttribute("orders", agricultureService.getAllOrders());
        return "index";
    }

    @GetMapping("/farmers")
    public String farmers(Model model) {
        model.addAttribute("farmers", agricultureService.getAllFarmers());
        return "farmers";
    }

    @GetMapping("/suppliers")
    public String suppliers(Model model) {
        model.addAttribute("suppliers", agricultureService.getAllSuppliers());
        return "suppliers";
    }

    @GetMapping("/orders")
    public String orders(Model model) {
        model.addAttribute("orders", agricultureService.getAllOrders());
        return "orders";
    }
}
