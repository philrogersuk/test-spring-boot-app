package net.hendonfc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class ExampleController {


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("timestamp", LocalDateTime.now());
        return "greeting";
    }

}
