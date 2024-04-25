package org.example.lab4_20181484.Controller;

import org.example.lab4_20181484.Entity.Employees;
import org.example.lab4_20181484.Repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    final EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(value = "/Recursos Humanos – GTICS")
    public String inicio(){
        return "/Recursos Humanos – GTICS";
    }

    @GetMapping(value = "/reportes")
    public String reportes(){
        return "/reportes";
    }

    @GetMapping(value = "/salario")
    public String salario(){
        return "/salario";
    }

    @GetMapping(value = "/nuevo trabajo")
    public String newtrabajo(){
        return "/nuevoTrabajo";
    }

    @GetMapping(value = "/empleados")
    public String empleados(Model model){
        List<Employees> employeesList = employeeRepository.findAll();
        model.addAttribute("listaEmpleados",employeesList);
        return "/listaempleados";
    }
}
