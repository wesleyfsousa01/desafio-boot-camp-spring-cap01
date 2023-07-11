package com.example.desafiobootcampspringboot.dto;

import com.example.desafiobootcampspringboot.entities.Client;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.time.Instant;

public class ClientDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Long id;

    private String name;

    private  String cpf;

    private Double income;

    private Instant birthDate;

    private  Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client obj) {
        BeanUtils.copyProperties(obj, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
