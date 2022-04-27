
package com.adopcion.Service;

import com.adopcion.Entity.Perdido;
import com.adopcion.Repository.PerdidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PerdidoService implements IPerdidoService {

    @Autowired
    private PerdidoRepository perdidoRepository;

    @Override
    public int savePerdido(Perdido perdido) {
        int res = 0;
        Perdido p = perdidoRepository.save(perdido);
        if (!p.equals(null)) {
            res = 1;
        }
        return res;
    }

}
