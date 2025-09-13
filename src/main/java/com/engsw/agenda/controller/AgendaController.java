package com.engsw.agenda.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engsw.agenda.dto.AgendaDTO;
import com.engsw.agenda.model.Agenda;
import com.engsw.agenda.service.agenda.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {
    @Autowired private AgendaService agendaService;

    @PostMapping("/criar")
    public ResponseEntity<Agenda> criarAgenda(@RequestParam String noemAgenda) { //revisar se esse tipo mesmo de retorno ou outro
        AgendaDTO dto = new AgendaDTO();
        dto.setNome(noemAgenda);

        //ver como passar o numero certo para criação de list ou map
        Agenda nova = agendaService.criarAgenda(dto, 0);
        return ResponseEntity.ok(nova);
    }


    @GetMapping("/{idAgenda}")
    public ResponseEntity<Agenda> buscarId(@PathVariable UUID idAgenda) {
        return agendaService.retornaAgendaUnica(idAgenda)
                        .map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }
}
