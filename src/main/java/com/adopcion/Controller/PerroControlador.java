package com.adopcion.Controller;

import com.adopcion.Entity.Formulario;
import com.adopcion.Entity.Perro;
import com.adopcion.Service.IFormularioService;
import com.adopcion.Service.IPerroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PerroControlador {

    @Autowired
    private IPerroService perroService;

    @Autowired
    private IFormularioService formularioService;

    @GetMapping({"/adopta"})
    public String listaAdopta(Model model) {
        List<Perro> listaPerro = perroService.listaPerro();
        model.addAttribute("perro", listaPerro);
        return "adoptar";
    }

    @GetMapping("/formularios")
    public String crearFormulario(Model model) {
        model.addAttribute("personas", new Formulario());
        return "formulario";
    }

    @PostMapping("/saveFormulario")
    public String guardarFormulario(@ModelAttribute Formulario formulario) {
        formularioService.saveFormulario(formulario);
        return "redirect:/adopta";
    }
}
