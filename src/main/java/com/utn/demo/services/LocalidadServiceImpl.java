package com.utn.demo.services;

import com.utn.demo.entities.Localidad;
import com.utn.demo.entities.Persona;
import com.utn.demo.repositories.BaseRepository;
import com.utn.demo.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;


    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
