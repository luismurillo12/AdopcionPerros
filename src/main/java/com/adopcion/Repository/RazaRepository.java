package com.adopcion.Repository;

import com.adopcion.Entity.Raza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RazaRepository extends CrudRepository<Raza, Long>{
    
}
