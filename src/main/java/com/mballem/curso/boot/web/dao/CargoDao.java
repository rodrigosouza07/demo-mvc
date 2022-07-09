package com.mballem.curso.boot.web.dao;

import com.mballem.curso.boot.web.domain.Cargo;

import java.util.List;

public interface CargoDao {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
