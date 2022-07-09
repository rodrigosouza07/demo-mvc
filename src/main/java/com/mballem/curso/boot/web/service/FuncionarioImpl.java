package com.mballem.curso.boot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.web.dao.FuncionarioDao;
import com.mballem.curso.boot.web.domain.Funcionario;

@Service
@Transactional(readOnly = false)
public class FuncionarioImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao funcionarioDao;

    @Override
    public void salvar(Funcionario funcionario) {
        funcionarioDao.save(funcionario);
    }

    @Override
    public void editar(Funcionario funcionario) {
        funcionarioDao.editar(funcionario);
    }

    @Override
    @Transactional(readOnly = true)
    public void buscarPorId(Long id) {
        
    }

    @Override
    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}
