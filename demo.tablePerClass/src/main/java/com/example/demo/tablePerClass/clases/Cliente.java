package com.example.demo.tablePerClass.clases;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Cliente {

    @Id @GeneratedValue
    private Long id;

    private String nombre;


    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente() {
    }
}
