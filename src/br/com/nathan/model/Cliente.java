/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Nathan
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private Date data_nasc;
    private String telefone;
    private String endereco;
    

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Date data_nasc, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    
    
    public Cliente(String nome, String cpf, String sexo, Date data_nasc, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.data_nasc = data_nasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente(int id, String nome, String cpf, String sexo, Date data_nasc, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.data_nasc = data_nasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
}
