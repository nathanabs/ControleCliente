/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.dao;

import br.com.nathan.model.Cliente;
import br.com.nathan.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nathan
 */
public class ClienteDAO  extends DAO<Cliente>{

    @Override
    public boolean cadastrar(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (nome, cpf, sexo, data_nasc, telefone, endereco)"
                +" values (?,?,?,?,?,?)";
        
        try(Connection conn = this.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getSexo());
            ps.setDate(4, cliente.getData_nasc());
            ps.setString(5, cliente.getTelefone());
            ps.setString(6, cliente.getEndereco());
            
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    @Override
    public boolean atualizar(Cliente cliente) throws SQLException {
        String sql = "update cliente set nome = ?, cpf = ?, sexo = ?, data_nasc = ?,"
                +" telefone = ?, endereco = ? where id = ?";
        
        try(Connection conn = this.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getSexo());
            ps.setDate(4, cliente.getData_nasc());
            ps.setString(5, cliente.getTelefone());
            ps.setString(6, cliente.getEndereco());
            ps.setInt(7, cliente.getId());
            
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    @Override
    public boolean excluir(Cliente pojo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getCodigo(Cliente cliente) throws SQLException {
        String sql = "select id from cliente where cpf = ?";
        Integer codigo = null;
        
        try(Connection conn = this.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql) ){
            
            ps.setString(1, cliente.getCpf());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                cliente.setId(rs.getInt("id"));
                codigo = cliente.getId();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return codigo;
    }
    
    public List<Cliente> ListarTudo(){
        List<Cliente> lista = new ArrayList<>();
        String sql = "select id, nome, cpf, sexo, data_nasc, telefone, endereco from cliente";
        
        try(Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                lista.add(new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"),
                        rs.getString("sexo"), rs.getDate("data_nasc"), 
                        rs.getString("telefone"), rs.getString("endereco")));
            }
            rs.close();
            return lista;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
