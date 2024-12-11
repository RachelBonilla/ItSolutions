
package com.itsolutions.controller;


import com.itsolutions.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @GetMapping("/formularios")
    public String mostrarFormularios(Model model) {
        // Llama al servicio para obtener todos los formularios
        model.addAttribute("formularios", formularioService.obtenerTodosLosFormularios());
        return "formularios"; // Nombre de la plantilla HTML en `templates`
    }
}
