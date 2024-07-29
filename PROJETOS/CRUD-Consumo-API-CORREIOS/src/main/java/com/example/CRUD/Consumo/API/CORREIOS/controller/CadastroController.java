package com.example.CRUD.Consumo.API.CORREIOS.controller;

import com.example.CRUD.Consumo.API.CORREIOS.model.CadastroModel;
import com.example.CRUD.Consumo.API.CORREIOS.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @GetMapping(path = "/buscarcadastros")
    @ResponseStatus(HttpStatus.OK)
    public List<CadastroModel> retornoTodosCadastros(){
        return cadastroService.buscarCadastros();
    }

    @PostMapping(path = "/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public CadastroModel cadastrarPessoas(@RequestBody CadastroModel cadastroModel){
        return cadastroService.cadastrar(cadastroModel);
    }



}
