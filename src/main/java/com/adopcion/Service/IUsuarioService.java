

package com.adopcion.Service;

import com.adopcion.DTO.UsuarioDTO;
import com.adopcion.Entity.Usuario;
import java.util.List;

public interface IUsuarioService{ //heredamos de UserDetail para optener un metodo el cual nos ayuda a la busqueda de un Usuario

    public Usuario save(UsuarioDTO usuarioDTO);  //guarda el nuevo usuario
    public List<Usuario> listaUsuarios(); 
}
