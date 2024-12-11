/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itsolutions.dao;

import com.itsolutions.domain.Formulario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class FormularioDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Guardar un formulario en la base de datos
    public void guardarFormulario(Formulario formulario) {
        String sql = "INSERT INTO formularios (nombre, correo, mensaje) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, formulario.getNombre(), formulario.getCorreo(), formulario.getMensaje());
    }

    // Obtener todos los formularios
    public List<Formulario> obtenerTodosLosFormularios() {
        String sql = "SELECT * FROM formularios";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Formulario formulario = new Formulario();
            formulario.setId(rs.getLong("id"));
            formulario.setNombre(rs.getString("nombre"));
            formulario.setCorreo(rs.getString("correo"));
            formulario.setMensaje(rs.getString("mensaje"));
            return formulario;
        });
    }
}
