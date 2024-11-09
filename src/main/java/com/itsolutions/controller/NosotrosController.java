package com.itsolutions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosController {

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }

    @GetMapping("/soluciones")
    public String soluciones() {
        return "soluciones";
    }

    @GetMapping("/soporte")
    public String soporte() {
        return "soporte";
    }

    @GetMapping("/iniciar_sesion")
    public String iniciarSesion() {
        return "iniciar_sesion";
    }
}

