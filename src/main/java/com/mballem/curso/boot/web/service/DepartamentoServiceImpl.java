package com.mballem.curso.boot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.web.dao.DepartamentoDao;
import com.mballem.curso.boot.web.domain.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoDao departamentoDao;

    @Autowired
    private DepartamentoService departamentoService;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {
        departamentoDao.salvar(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {
        departamentoDao.editar(departamento);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        departamentoDao.excluir(id);
    }

    @Transactional(readOnly = false)
    @Override
    public Departamento buscarId(long id) {
        return departamentoDao.buscarPorId(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Departamento> buscarTodos() {
        departamentoDao.buscarTodos();
        return null;
    }

}
