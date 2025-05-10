package com.example.lab4_20212624_gtics.Controller;


import com.example.lab4_20212624_gtics.Entity.Clinic;
import com.example.lab4_20212624_gtics.Repository.ClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clinica")
public class ClinicaController {

    @Autowired
    private ClinicaRepository clinicaRepository;

    @GetMapping(value = {"listarClinicas","/clinicas", "/"})
    public String listarClinicas(Model Model) {

        Model.addAttribute("clinicasList", clinicaRepository.findAll());
        System.out.println(clinicaRepository.findAll());

        return "clinicas/listar_clinicas";
    }

    @GetMapping(value = "/new")
    public String guardarClinica(Model Model, @ModelAttribute("clinic") Clinic clinic ) {


        return "clinicas/form_clinicas";
    }


}
