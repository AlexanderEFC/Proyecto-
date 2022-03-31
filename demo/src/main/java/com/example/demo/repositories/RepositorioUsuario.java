package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModelo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends CrudRepository<UsuarioModelo, Long> {
    public abstract ArrayList<UsuarioModelo> findByPrioridad(Integer prioridad);

}