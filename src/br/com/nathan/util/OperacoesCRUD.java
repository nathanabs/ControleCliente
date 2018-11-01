/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.util;

/**
 *
 * @author Nathan
 */
public enum OperacoesCRUD {
    NOVO(1), EDITAR(2), EXCLUIR(3);
    
    private final Integer operacao;

    private OperacoesCRUD(Integer operacao) {
        this.operacao = operacao;
    }

    public Integer getOperacao() {
        return operacao;
    }
    
    
}
