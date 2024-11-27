package com.giorgio.capoccia.dipendentiRest.web;

import com.giorgio.capoccia.dipendentiRest.Dipendente;
import com.giorgio.capoccia.dipendentiRest.data.DipendenteRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {

    private final DipendenteRepository dr;

    public DipendenteController(DipendenteRepository dr) {
        this.dr = dr;
    }
    
    @GetMapping("/*")
    public List<Dipendente> getDipendenti(){
        return (List)dr.findAll();
    }
    
}
