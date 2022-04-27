package com.adopcion.Service;

import com.adopcion.Entity.Formulario;
import com.adopcion.Repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService implements IFormularioService {
    
    @Autowired
    private FormularioRepository formularioRepository;

    @Override
    public int saveFormulario(Formulario formulario) {
        int res = 0;
        Formulario f = formularioRepository.save(formulario);  
        if (!f.equals(null)) { 
            res = 1;
        }
        return res;
    }

}
