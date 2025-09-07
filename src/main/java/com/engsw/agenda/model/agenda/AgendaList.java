package com.engsw.agenda.model.agenda;
import java.util.ArrayList;
import java.util.List;
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
public class AgendaList {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    private String nome;

    private List<Contato> listaContato = new ArrayList<>();

    public AgendaList(String nome){
        this.nome = nome;
    }
}
