package com.adopcion.Controller;


import com.adopcion.Entity.Perdido;
import com.adopcion.Service.IPerdidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PerdidoController {

    @Autowired
    private IPerdidoService perdidoService; 
    
    
      @GetMapping("/home")
    public String home() {
        
        return "home";
    }
    
    
    @GetMapping("/perdido")
    public String crearPerdido(Model model) {
        model.addAttribute("personas", new Perdido());
        return "perdido";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Perdido perdido) {
        perdidoService.savePerdido(perdido);
        return "redirect:/home";
    }
}
