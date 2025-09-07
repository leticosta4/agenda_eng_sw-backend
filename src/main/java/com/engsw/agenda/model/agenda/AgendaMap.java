package com.engsw.agenda.model.agenda;
import java.util.HashMap;
import java.util.UUID;

import com.engsw.agenda.model.Contato;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class AgendaMap {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    private String nome;

    private HashMap<String, Contato> listaContato = new HashMap<String, Contato>();

    public AgendaMap(String nome){
        this.nome = nome;
    }
}
