package com.adopcion.Controller;

import com.adopcion.Entity.Producto;
import com.adopcion.Service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/producto")
    public String index(Model model) {
        List<Producto> listaProducto = productoService.listaProductos();
        model.addAttribute("producto", listaProducto);
        return "producto";
    }
}
