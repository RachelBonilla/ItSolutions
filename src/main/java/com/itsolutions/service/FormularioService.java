/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itsolutions.service;



import com.itsolutions.domain.Formulario;
import java.util.List;

public interface FormularioService {
    void guardarFormulario(Formulario formulario);

    List<Formulario> obtenerTodosLosFormularios();
}
