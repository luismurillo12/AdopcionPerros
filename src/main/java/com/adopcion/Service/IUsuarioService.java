package com.adopcion.Service;

import com.adopcion.Entity.Usuario;
import java.util.List;

public interface IUsuarioService{ //heredamos de UserDetail para optener un metodo el cual nos ayuda a la busqueda de un Usuario

     public int savePersona(Usuario usuario);  //guarda el nuevo usuario
    public List<Usuario> listaUsuarios(); 
    
}
