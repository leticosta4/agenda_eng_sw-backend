package com.engsw.agenda.model.agenda;
import java.util.ArrayList;
import java.util.List;

import com.engsw.agenda.model.Contato;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class AgendaList extends Agenda{
    private List<Contato> listaContato = new ArrayList<>();

    public AgendaList(String nome){
        super(nome);
    }
}
