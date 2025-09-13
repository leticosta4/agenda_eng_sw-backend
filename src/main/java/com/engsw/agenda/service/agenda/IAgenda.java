package com.engsw.agenda.service.agenda;

import java.util.Collection;

import com.engsw.agenda.model.Contato;

public interface IAgenda {
    int localizaContato(String telefone);
    String getContato(String telefone);
    boolean adicionaContato(Contato contato);
    boolean removeContato(String telefone);
    Collection<Contato> getListaAgenda();
}
