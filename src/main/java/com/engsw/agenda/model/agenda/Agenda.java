package com.engsw.agenda.model.agenda;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    private String nome;
    
    public Agenda(String nome){
        this.nome = nome;
    }

    //poderia difinir os metodos aqui ou aplicar a interface para Agenda q se comunica com interface de contato (diag de classes do prof)
}
