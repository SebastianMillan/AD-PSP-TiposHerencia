package com.example.demo.tablePerClass.clases;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter

@AllArgsConstructor
public class ClienteVip extends Cliente{
    private String tipo;

    public ClienteVip(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public ClienteVip() {

    }
}
