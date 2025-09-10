package com.engsw.agenda.service.agenda;
import java.util.ArrayList;
import java.util.List;

import com.engsw.agenda.model.Contato;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class AgendaList implements IAgenda{
    private List<Contato> listaContato = new ArrayList<>();

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
    public List<Contato> getListaAgenda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListaAgenda'");
    }

    //fazer override dos metodos
}
