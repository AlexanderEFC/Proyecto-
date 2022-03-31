package com.example.demo.services;

import java.util.ArrayList;
//import java.util.Optional;

import com.example.demo.models.UsuarioModelo;
import com.example.demo.repositories.RepositorioUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServi {
    @Autowired
    RepositorioUsuario usuarioRepository;
    
    public ArrayList<UsuarioModelo> obtenerUsuarios(){
        return (ArrayList<UsuarioModelo>) usuarioRepository.findAll();
    }

   
    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}