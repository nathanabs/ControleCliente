/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.controller;

import br.com.nathan.dao.LoginDAO;
import br.com.nathan.model.Login;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class LoginController {
    public List<Login> buscarLoginSenha() throws SQLException, ClassNotFoundException{
        return LoginDAO.buscarLogin();
    }
}
