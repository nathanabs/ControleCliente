/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.controller;

import br.com.nathan.dao.ClienteDAO;
import br.com.nathan.dao.DAO;
import br.com.nathan.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class ClienteController extends DAO<Cliente>{

    @Override
    public boolean cadastrar(Cliente cliente) throws SQLException {
        boolean resultado = false;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        if (clienteDAO.cadastrar(cliente)) {
            resultado = true;
        }
        return resultado;
    }

    @Override
    public boolean atualizar(Cliente cliente) throws SQLException {
        boolean resultado = false;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        if (clienteDAO.atualizar(cliente)) {
            resultado = true;
        }
        return resultado;
    }

    @Override
    public boolean excluir(Cliente cliente) throws SQLException {
         boolean resultado = false;
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        if (clienteDAO.excluir(cliente)) {
            resultado = true;
        }
        return resultado;
    }

    @Override
    public Integer getCodigo(Cliente cliente) throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.getCodigo(cliente);
    }
    
    public List<Cliente> listar(){
         ClienteDAO clienteDAO = new ClienteDAO();
         return clienteDAO.ListarTudo();
    }
    
}
