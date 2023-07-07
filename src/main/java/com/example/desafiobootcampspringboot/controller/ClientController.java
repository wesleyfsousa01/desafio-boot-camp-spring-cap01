package com.example.desafiobootcampspringboot.controller;

import com.example.desafiobootcampspringboot.entities.Client;
import com.example.desafiobootcampspringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findClientById(@PathVariable(name = "id") Long id){
        Client client = clientService.findClientById(id);
        return ResponseEntity.ok().body(client);
    }

    @GetMapping
    public List<Client> findAll(){
        return  clientService.findAll();
    }
}
