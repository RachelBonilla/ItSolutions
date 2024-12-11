
package com.itsolutions.controller;

import com.itsolutions.domain.Formulario;
import com.itsolutions.service.FormularioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/soporte")
public class SoporteController {

    @Autowired
    private FormularioService formularioService; // Servicio para manejar datos de formularios

    @PostMapping("/enviar")
    public String enviarSoporte(@RequestParam("nombre") String nombre,
                                @RequestParam("correo") String correo,
                                @RequestParam("mensaje") String mensaje,
                                Model model) {
        // Crear un objeto Formulario y guardarlo en la base de datos
        Formulario formulario = new Formulario(nombre, correo, mensaje);
        formularioService.guardarFormulario(formulario);

        // Agregar un mensaje de éxito al modelo
        model.addAttribute("mensaje", "Solicitud enviada con éxito.");
        return "soporte"; // Redirigir a la página de confirmación o soporte
    }

    @GetMapping("/ver-formularios")
    public String verFormularios(Model model) {
        // Recuperar todos los formularios enviados
        List<Formulario> formularios = formularioService.obtenerTodosLosFormularios();
        model.addAttribute("formularios", formularios);

        return "formularios"; // Vista donde se muestran los datos
    }
}

