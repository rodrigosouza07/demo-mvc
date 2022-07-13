package com.mballem.curso.boot.web.dao;

import java.util.List;

import com.mballem.curso.boot.web.domain.Departamento;

public interface DepartamentoDao {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();

}
