package com.salesianostriana.dam.Joined;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "cliente_id") //Esta anotación le da un nombre a la PK de nuestro padre
public class ClientePremium extends Cliente{

    private LocalDate inscripcion;
    private Double puntos;

    public ClientePremium(Long id, String nombre, String apellidos, String pais, LocalDate inscripcion, Double puntos) {
        super(id, nombre, apellidos, pais);
        this.inscripcion = inscripcion;
        this.puntos = puntos;
    }
}
