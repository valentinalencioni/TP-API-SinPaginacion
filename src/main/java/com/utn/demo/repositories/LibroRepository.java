package com.utn.demo.repositories;

import com.utn.demo.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
