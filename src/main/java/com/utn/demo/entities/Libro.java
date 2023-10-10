package com.utn.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base {
    @Column(name = "Título")
    private String titulo;
    @Column(name = "Fecha")
    private int fecha;
    @Column(name = "Género")
    private String genero;
    @Column(name = "Páginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores= new ArrayList<Autor>();
}
