package com.salesianostriana.dam.Joined;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Builder
@Inheritance(strategy = InheritanceType.JOINED) //Esta anotación nos especifica el tipo de herencia que estamos usando - JOINED
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellidos, pais;
}
