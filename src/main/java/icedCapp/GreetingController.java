package icedCapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="x", required=false, defaultValue="World") String name, Model model) { // if no name value then it will say world
        model.addAttribute("y", name); //creating variable for the HTML to use
        return "greeting"; //use the template greeting.html
    }

}

