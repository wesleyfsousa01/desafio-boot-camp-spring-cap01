package com.example.desafiobootcampspringboot.controller;

import com.example.desafiobootcampspringboot.entities.Client;
import com.example.desafiobootcampspringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> findAll(){
        return  clientService.findAll();
    }
}
