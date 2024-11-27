package com.giorgio.capoccia.dipendentiRest.data;

import com.giorgio.capoccia.dipendentiRest.Dipendente;
import com.giorgio.capoccia.dipendentiRest.DipendenteKey;
import org.springframework.data.repository.CrudRepository;

public interface DipendenteRepository extends CrudRepository<Dipendente, DipendenteKey>{
    
}
