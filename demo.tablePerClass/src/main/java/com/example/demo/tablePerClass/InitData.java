package com.example.demo.tablePerClass;

import com.example.demo.tablePerClass.Repositorio.ClienteRepository;
import com.example.demo.tablePerClass.Repositorio.ClienteVipRepository;
import com.example.demo.tablePerClass.clases.Cliente;
import com.example.demo.tablePerClass.clases.ClienteVip;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final ClienteRepository clienteRepository;
    private final ClienteVipRepository clienteVipRepository;

    @PostConstruct
    public void init(){
        Cliente c1 = Cliente.builder()
                .nombre("Paco")
                .build();
        clienteRepository.save(c1);

        ClienteVip c2 = new ClienteVip("nombre", "A");
        clienteRepository.save(c2);


    }
}
