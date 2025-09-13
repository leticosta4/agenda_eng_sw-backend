package com.engsw.agenda.service.agenda;
import java.util.HashMap;
import java.util.Collection;

import com.engsw.agenda.model.Contato;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class AgendaMap implements IAgenda{
    private HashMap<String, Contato> listaContato = new HashMap<String, Contato>();

    @Override
    public int localizaContato(String telefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'localizaContato'");
    }

    @Override
    public String getContato(String telefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getContato'");
    }

    @Override
    public boolean adicionaContato(Contato contato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionaContato'");
    }

    @Override
    public boolean removeContato(String telefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeContato'");
    }

    @Override
    public Collection<Contato> getListaAgenda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListaAgenda'");
    }

    //fazer override dos metodos
}
