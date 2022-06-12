package it.rizzoli.PrimoProgetto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {


    @GetMapping("/somma")
    @ResponseBody
    public String returnSum(@RequestParam(name = "val1") int val1, @RequestParam(name = "val2") int val2) {
        int result = val1 + val2;
        return "somma = " + result;
    }
}
