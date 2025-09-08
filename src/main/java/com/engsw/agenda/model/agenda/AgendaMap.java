package com.engsw.agenda.model.agenda;
import java.util.HashMap;

import com.engsw.agenda.model.Contato;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class AgendaMap extends Agenda{
    private HashMap<String, Contato> listaContato = new HashMap<String, Contato>();

    public AgendaMap(String nome){
        super(nome);
    }
}
