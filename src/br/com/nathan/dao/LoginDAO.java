/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.dao;

import br.com.nathan.model.Login;
import br.com.nathan.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nathan
 */
public class LoginDAO {

    public static List<Login> buscarLogin() throws SQLException {
        List<Login> loginAux = new ArrayList<>();
        String sql = "select * from login";

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            loginAux.add(new Login(rs.getInt("id_login"),
                    rs.getString("login"), rs.getString("senha")));
        }
        return loginAux;
    }
}
