package com.mballem.curso.boot.web.service;

import java.util.List;

import com.mballem.curso.boot.web.domain.Departamento;

public interface DepartamentoService {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarId(long id);

    List<Departamento> buscarTodos();
}
