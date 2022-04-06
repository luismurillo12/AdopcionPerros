package com.adopcion.LoginControlaor;

import com.adopcion.Entity.Usuario;
import com.adopcion.Service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class LoginController {

    @Autowired
    private IUsuarioService usuarioService;

}
