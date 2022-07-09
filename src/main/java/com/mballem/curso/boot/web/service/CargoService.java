package com.mballem.curso.boot.web.service;

import java.util.List;

import com.mballem.curso.boot.web.domain.Cargo;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();

}
