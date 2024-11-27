package com.giorgio.capoccia.dipendentiRest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@IdClass(DipendenteKey.class)
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
@Table(name="tabella_dipendenti")
public class Dipendente {
    
    @Id
    @Column(name="codicefiscale")
    private final String codiceFiscale;
    
    @Id
    @Column(name="nome")
    private final String nome;
    
    @Id
    @Column(name="cognome")
    private final String cognome;
    
    @Column(name="livello")
    private String idLivello;
    
    @Column(name="tariffaoraria")
    private double tariffaOraria;    
    
}
