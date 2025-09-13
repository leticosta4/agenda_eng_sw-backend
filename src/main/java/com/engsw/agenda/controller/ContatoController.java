package com.engsw.agenda.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engsw.agenda.dto.contato.ContatoDTO;
import com.engsw.agenda.dto.contato.ContatoRespostaDTO;
import com.engsw.agenda.service.ContatoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
    @Autowired private ContatoService contatoService;

    @GetMapping
    public ResponseEntity<List<ContatoRespostaDTO>> listarContatos(){
        List<ContatoRespostaDTO> contatos = contatoService.buscarContatos();
        return ResponseEntity.ok(contatos);
    }

    @GetMapping("/{contatoId}")
    public ResponseEntity<ContatoRespostaDTO> buscarPorId(@PathVariable UUID contatoId){
        return contatoService.buscarContatoPorId(contatoId)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{contatoId}")
    public ResponseEntity<ContatoRespostaDTO> editarContato(@PathVariable UUID contatoId, @Valid @RequestBody ContatoDTO contatoNovo){
        System.out.println("Nome" + contatoNovo.getNome() + "TELEFONE:" + contatoNovo.getTelefone());
        ContatoRespostaDTO contatoEditado = contatoService.editarContato(contatoId, contatoNovo);
        return ResponseEntity.ok(contatoEditado);
    }

    @DeleteMapping("/{contatoId}")
    public ResponseEntity<Void> excluirContato(@PathVariable UUID contatoId){
        contatoService.excluirContato(contatoId);

        return ResponseEntity.noContent().build();
    }


}
