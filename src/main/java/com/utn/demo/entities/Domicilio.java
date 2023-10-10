package com.utn.demo.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{
    @Column(name = "Calle")
    private String calle;
    @Column(name = "Número")
    private int numero;

    @ManyToOne(optional = false, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;
}
