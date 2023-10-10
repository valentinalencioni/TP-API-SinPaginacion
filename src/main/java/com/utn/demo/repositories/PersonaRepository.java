package com.utn.demo.repositories;

import com.utn.demo.entities.Persona;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
