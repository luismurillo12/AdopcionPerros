package com.adopcion.LoginControlaor;

import com.adopcion.Service.IUsuarioService;
import com.adopcion.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RegistroControlador {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/login")
    public String iniciarSesion() {

        return "login";
    }

    @GetMapping("/admin")
    public String paginaAdimi(Model modelo) {
        modelo.addAttribute("usuarios", usuarioService.listaUsuarios());
        return "admin";
    }

    /*@GetMapping("/eliminar/{id}")
    public String delete(Model modelo, @PathVariable Long id) {
       usuarioService.delete(id);
        return "redirect:/admin";
    }*/
}
