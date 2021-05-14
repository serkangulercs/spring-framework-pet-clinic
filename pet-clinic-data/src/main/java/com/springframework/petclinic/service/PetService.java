package com.springframework.petclinic.service;

import com.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Set<Pet> findAll();

    Pet save(Pet pet);

    Pet findById(Long id);
}
