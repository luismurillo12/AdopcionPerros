package com.adopcion.Service;

import com.adopcion.Entity.Raza;
import com.adopcion.Repository.RazaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RazaService implements IRazaService{

    @Autowired
    private RazaRepository razaRepository; 
    
    @Override
    public List<Raza> listaRaza() {
        return(List<Raza>)razaRepository.findAll(); 
    }
    
}
