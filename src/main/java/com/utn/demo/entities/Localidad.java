package com.utn.demo.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Localidad extends Base {
    @Column(name = "Denominacion")
    private String denominacion;
}
