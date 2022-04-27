package com.adopcion.Service;

import com.adopcion.Entity.Perro;
import com.adopcion.Repository.PerroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerroService implements IPerroService{

    @Autowired
    private PerroRepository perroRepository;
    
    @Override
    public List<Perro> listaPerro() {
         return(List<Perro>)perroRepository.findAll();
    }
    
}
