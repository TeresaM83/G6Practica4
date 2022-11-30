package com.idat.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.app.modelo.ClienteDetalle;


@Repository
public interface DetalleClienteRepository extends JpaRepository<ClienteDetalle, Integer> {

}
