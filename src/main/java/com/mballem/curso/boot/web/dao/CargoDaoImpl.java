package com.mballem.curso.boot.web.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.web.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

    @Override
    public void salvar(Cargo cargo) {

    }

    @Override
    public void editar(Cargo cargo) {

    }

    @Override
    public void excluir(Long id) {

    }

}
