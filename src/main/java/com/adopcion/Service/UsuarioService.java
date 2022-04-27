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
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public List<Usuario> listaUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario findByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    @Override
    public Usuario savePersona(Usuario usuario) {
       usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
       return usuarioRepository.save(usuario); 
    }

}
