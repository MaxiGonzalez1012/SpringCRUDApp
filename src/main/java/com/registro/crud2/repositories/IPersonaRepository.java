package com.registro.crud2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.crud2.models.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
}
