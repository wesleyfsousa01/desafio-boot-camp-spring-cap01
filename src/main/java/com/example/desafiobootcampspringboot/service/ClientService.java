package com.example.desafiobootcampspringboot.service;

import com.example.desafiobootcampspringboot.dto.ClientDTO;
import com.example.desafiobootcampspringboot.entities.Client;
import com.example.desafiobootcampspringboot.repository.ClientRepository;
import com.example.desafiobootcampspringboot.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientDTO findById(Long id){
        return new ClientDTO(findClientById(id));
    }

    public Client findClientById(Long id){
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found" + id));
        return client;
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(Pageable pageable){
       Page<Client> clients = clientRepository.findAll(pageable);
       return clients.map(client -> new ClientDTO(client));
    };

    @Transactional
    public ClientDTO save(ClientDTO clientDto){
        Client client = new Client();
        client.setName(clientDto.getName());
        client.setCpf(clientDto.getCpf());
        client.setChildren(clientDto.getChildren());
        client.setBirthDate(clientDto.getBirthDate());
        client.setIncome(clientDto.getIncome());
        return new ClientDTO(clientRepository.save(client));
    }


}
