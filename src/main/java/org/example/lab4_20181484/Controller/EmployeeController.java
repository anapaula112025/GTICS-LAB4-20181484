package org.example.lab4_20181484.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping(value = "/Recursos Humanos – GTICS")
    public String inicio(){
        return "/Recursos Humanos – GTICS";
    }
}
