package com.adopcion.Service;

import com.adopcion.Entity.TipoProducto;
import com.adopcion.Repository.TipoProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProductoService implements ITipoProductoService{
    
     @Autowired
    private TipoProductoRepository tipoProductoRepository;

    @Override
    public List<TipoProducto> listaTipo() {
        return (List<TipoProducto>) tipoProductoRepository.findAll(); 
    }
  
}
