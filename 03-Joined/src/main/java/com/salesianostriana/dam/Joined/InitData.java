package com.salesianostriana.dam.Joined;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Component
public class InitData {

    private final ClientePremiumRepository clientePremiumRepository;
    private final ClienteRepository clienteRepository;

    @PostConstruct
    public void initData(){
        Cliente c1 = Cliente.builder()
                .nombre("Sebastián")
                .apellidos("Millán")
                .pais("España")
                .build();

        Cliente c2 = Cliente.builder()
                .nombre("Manolo")
                .apellidos("Molina")
                .pais("España")
                .build();


        clienteRepository.saveAll(List.of(c1,c2));

        ClientePremium cp1 = new ClientePremium();
        cp1.setNombre("Fernando");
        cp1.setApellidos("Claro");
        cp1.setPais("España");
        cp1.setInscripcion(LocalDate.of(2020,3,20));
        cp1.setPuntos(243.3);

        clientePremiumRepository.save(cp1);

    }
}
