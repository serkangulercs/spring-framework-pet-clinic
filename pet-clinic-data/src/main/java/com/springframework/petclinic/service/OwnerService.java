package com.springframework.petclinic.service;

import com.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findAll();

    Owner save(Owner owner);

    Owner findById(Long id);

    Owner findByLastName(String lastName);
}
