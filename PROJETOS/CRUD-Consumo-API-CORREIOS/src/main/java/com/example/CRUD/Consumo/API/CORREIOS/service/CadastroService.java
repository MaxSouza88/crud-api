package com.example.CRUD.Consumo.API.CORREIOS.service;

import com.example.CRUD.Consumo.API.CORREIOS.model.CadastroModel;
import com.example.CRUD.Consumo.API.CORREIOS.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public List<CadastroModel> buscarCadastros(){
        return cadastroRepository.findAll();
    }

    public CadastroModel cadastrar(CadastroModel cadastroModel){
        cadastroModel.getId();
        cadastroModel.getNome();
        cadastroModel.getCep();
        return cadastroRepository.save(cadastroModel);
    }
}
