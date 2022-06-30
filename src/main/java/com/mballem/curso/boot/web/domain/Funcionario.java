package com.mballem.curso.boot.web.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long>{

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00" )
    private BigDecimal salario;

    @Column(name = "data_entrada", nullable = false, columnDefinition = "DATE")    
    private LocalDate data_entrada;

    @Column(name = "data_saida",  columnDefinition = "DATE")
    private LocalDate data_saida;
     
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_pk")
    private Endereco endereco;  

    @ManyToOne
    @JoinColumn(name = "cargo_id_pk")
    private Cargo cargo;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getData_entrada() {
        return this.data_entrada;
    }

    public void setData_entrada(LocalDate data_entrada) {
        this.data_entrada = data_entrada;
    }

    public LocalDate getData_saida() {
        return this.data_saida;
    }

    public void setData_saida(LocalDate data_saida) {
        this.data_saida = data_saida;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}

