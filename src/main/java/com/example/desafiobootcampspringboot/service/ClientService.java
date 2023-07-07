package com.example.desafiobootcampspringboot.service;

import com.example.desafiobootcampspringboot.entities.Client;
import com.example.desafiobootcampspringboot.repository.ClientRepository;
import com.example.desafiobootcampspringboot.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client findClientById(Long id){
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found" + id));
        return client;
    }

    public List<Client> findAll(){
       List<Client> clients = clientRepository.findAll();
       return clients;
    };
}
