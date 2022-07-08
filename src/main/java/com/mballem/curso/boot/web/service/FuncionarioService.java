package com.mballem.curso.boot.web.service;

import java.util.List;

import com.mballem.curso.boot.web.domain.Funcionario;

public interface FuncionarioService {
    
    void salvar(Funcionario funcionario);

    void editar (Funcionario funcionario);

    void buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}