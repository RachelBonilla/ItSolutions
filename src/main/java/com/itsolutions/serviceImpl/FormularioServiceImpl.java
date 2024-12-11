
package com.itsolutions.serviceImpl;


import com.itsolutions.dao.FormularioDao;
import com.itsolutions.domain.Formulario;
import com.itsolutions.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioServiceImpl implements FormularioService {

    @Autowired
    private FormularioDao formularioDao;

    @Override
    public void guardarFormulario(Formulario formulario) {
        formularioDao.guardarFormulario(formulario);
    }

    @Override
    public List<Formulario> obtenerTodosLosFormularios() {
        return formularioDao.obtenerTodosLosFormularios();
    }
}
