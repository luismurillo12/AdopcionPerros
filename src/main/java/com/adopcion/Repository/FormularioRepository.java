package com.adopcion.Repository;

import com.adopcion.Entity.Formulario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends CrudRepository<Formulario, Long> {
    
}
