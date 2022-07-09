package com.mballem.curso.boot.web.dao;

import java.util.List;

import com.mballem.curso.boot.web.domain.Funcionario;

public interface FuncionarioDao {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

}
