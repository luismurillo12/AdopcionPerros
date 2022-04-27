package com.adopcion.Controller;

import com.adopcion.Entity.Usuario;
import com.adopcion.Service.IUsuarioService;
import com.adopcion.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroUsuario {
     @Autowired
     private IUsuarioService usuarioService; 

   
     @GetMapping("/registro")
    public String crearPersona(Model model) {  
        model.addAttribute("usuaio", new Usuario());
        return "registro";
    }
     @PostMapping("/saveUsuario")
    public String guardarPersona(@ModelAttribute Usuario usuario) {
        usuarioService.savePersona(usuario);
        return"redirect:registro?exito";
    }
}
