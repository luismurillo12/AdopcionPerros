package com.adopcion.Service;


import com.adopcion.Entity.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Userprincipal implements UserDetails { //guardar informacion del Usuario que se esta logeando

    private Usuario usuario;

    public Userprincipal(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {//retorna los permisos y roles que tiene nuestro Usuario
        List<GrantedAuthority> authorities = new ArrayList<>();
        //Lista que guarda los permisos de los Usuarios
        this.usuario.getPermissionList().forEach(p -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);
        });
        
        //Lista que guarda los Roles de los Usuarios
        this.usuario.getRoleList().forEach(r -> {
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
            authorities.add(authority);
        });

        return authorities;
    }

    @Override
    public String getPassword() {
        return this.usuario.getPassword();
    }

    @Override
    public String getUsername() {
        return this.usuario.getNombre();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.usuario.getActive() == 1;
    }

}
