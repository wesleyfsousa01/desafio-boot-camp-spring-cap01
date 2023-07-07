package com.example.desafiobootcampspringboot.service;

import com.example.desafiobootcampspringboot.entities.Client;
import com.example.desafiobootcampspringboot.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
       List<Client> clients = clientRepository.findAll();
       return clients;
    };
}
