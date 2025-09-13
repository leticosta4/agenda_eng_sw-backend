package com.engsw.agenda.repository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engsw.agenda.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, UUID>{
    boolean existsByIdAgenda(String idAgenda);
    ArrayList <Agenda> findAll();
    Optional<Agenda> findByIdAgenda(String idAgenda);
}