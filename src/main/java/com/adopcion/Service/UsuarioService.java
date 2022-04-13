package com.adopcion.Service;
import com.adopcion.Entity.Usuario;
import com.adopcion.Repository.UsuarioRepository;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository; 
   
     

    @Override
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public int savePersona(Usuario usuario) {
        int res=0; 
         Usuario u= usuarioRepository.save(usuario); // aqui se guarda la persona 
         if (!u.equals(null)) { //que sea diferente a null
             res=1; 
         }
         return res;
    }

}
