package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String greeting() {
        return "Dear world; hello. - With love, TA";
    }
}
