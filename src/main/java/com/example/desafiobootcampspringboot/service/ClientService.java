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
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientDTO findById(Long id){
        return new ClientDTO(findClientById(id));
    }

    public Client findClientById(Long id){
       Optional<Client> client = clientRepository.findById(id);
       Client entity = client.orElseThrow(() -> new ResourceNotFoundException("Id not found: " + id));
        return entity;
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(Pageable pageable){
       Page<Client> clients = clientRepository.findAll(pageable);
       return clients.map(client -> new ClientDTO(client));
    };

    @Transactional
    public ClientDTO save(ClientDTO dto){
        Client entity = new Client();
        copyDtoToEntity(dto,entity);
        return new ClientDTO(clientRepository.save(entity));
    }

    @Transactional
    public ClientDTO update(@PathVariable Long id, ClientDTO dto){
        Client entity = findClientById(id);
        copyDtoToEntity(dto,entity);
        return new ClientDTO(clientRepository.save(entity));
    }

    @Transactional
    public void delete(Long id){
        Client entity = findClientById(id);
        clientRepository.delete(entity);
    }

    private void copyDtoToEntity(ClientDTO dto, Client entity){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setBirthDate(dto.getBirthDate());
        entity.setIncome(dto.getIncome());
        entity.setChildren(dto.getChildren());
    }


}
