package com.projetoCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoCliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
