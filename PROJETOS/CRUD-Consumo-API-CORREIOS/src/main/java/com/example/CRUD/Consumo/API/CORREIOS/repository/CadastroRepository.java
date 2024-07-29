package com.example.CRUD.Consumo.API.CORREIOS.repository;

import com.example.CRUD.Consumo.API.CORREIOS.model.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository <CadastroModel, Integer> {

}
