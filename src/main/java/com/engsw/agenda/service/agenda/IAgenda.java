package com.engsw.agenda.service.agenda;

import java.util.List;

import com.engsw.agenda.model.Contato;

public interface IAgenda {
    int localizaContato(String telefone);
    String getContato(String telefone);
    boolean adicionaContato(Contato contato);
    boolean removeContato(String telefone);
    List<Contato> getListaAgenda(); //list por causa de retorno para o front
}
