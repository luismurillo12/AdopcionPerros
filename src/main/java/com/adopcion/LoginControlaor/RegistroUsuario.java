
 
package com.adopcion.LoginControlaor;

import com.adopcion.DTO.UsuarioDTO;
import com.adopcion.Service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuario {
    private UsuarioService usuarioService; 

    public RegistroUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @ModelAttribute("usuario")
    public UsuarioDTO retornarDTO(){
    return new UsuarioDTO(); 
    }
    
    @GetMapping
    public String monstrarFormulario(){
    return "registro";
    }
    
    @PostMapping
    public String registroCuenta(@ModelAttribute("usuario") UsuarioDTO usuarioDTO){
    usuarioService.save(usuarioDTO); 
    return"redirect:registro?exito"; 
    }
}
