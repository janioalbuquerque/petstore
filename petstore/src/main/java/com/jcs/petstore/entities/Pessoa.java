package com.jcs.petstore.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date data_nasc;
    private String genero;
    private Long endereco;
    private String fone_celular;
    private String fone_celular_reserva;
    private String fone_fixo;
    private String email;
    private String cpf;
    private Long nacionalidade;
    private Long estado_civil;
    private String profissao;

    private String observacao;

    public Pessoa() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
@Column()
    public Long getEndereco() {
        return endereco;
    }

    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }

    public String getFone_celular() {
        return fone_celular;
    }

    public void setFone_celular(String fone_celular) {
        this.fone_celular = fone_celular;
    }

    public String getFone_celular_reserva() {
        return fone_celular_reserva;
    }

    public void setFone_celular_reserva(String fone_celular_reserva) {
        this.fone_celular_reserva = fone_celular_reserva;
    }

    public String getFone_fixo() {
        return fone_fixo;
    }

    public void setFone_fixo(String fone_fixo) {
        this.fone_fixo = fone_fixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Long nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Long getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(Long estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}