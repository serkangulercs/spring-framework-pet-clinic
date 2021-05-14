package com.springframework.petclinic.service;

import com.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Set<Vet> findAll();

    Vet save(Vet vet);

    Vet findById(Long id);
}
