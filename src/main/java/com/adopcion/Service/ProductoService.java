package com.adopcion.Service;

import com.adopcion.Entity.Producto;
import com.adopcion.Repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
     @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listaProductos() {
        return(List<Producto> ) productoRepository.findAll(); 
    }
    
   
}
