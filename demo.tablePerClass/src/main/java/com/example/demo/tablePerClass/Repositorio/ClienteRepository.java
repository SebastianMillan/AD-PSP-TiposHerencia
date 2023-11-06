package com.example.demo.tablePerClass.Repositorio;

import com.example.demo.tablePerClass.clases.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}