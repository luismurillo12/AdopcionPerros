package com.adopcion.Service;

import com.adopcion.DTO.UsuarioDTO;
import com.adopcion.Entity.Rol;
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

    //@Autowired
    // private BCryptPasswordEncoder passwordEncoder;
    private final UsuarioRepository usuarioRerpository;

    public UsuarioService(UsuarioRepository usuarioRerpository) {
        this.usuarioRerpository = usuarioRerpository;
    }

    @Override
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) usuarioRerpository.findAll();
    }

    @Override
    public Usuario save(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(usuarioDTO.getNombre(), usuarioDTO.getApellido(), usuarioDTO.getEmail(), usuarioDTO.getPassword(),
                Arrays.asList(new Rol("Rol_User")));
        return usuarioRerpository.save(usuario);
    }

}
