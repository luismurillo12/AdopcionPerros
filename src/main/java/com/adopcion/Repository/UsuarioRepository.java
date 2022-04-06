


package com.adopcion.Repository;

import com.adopcion.Entity.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
