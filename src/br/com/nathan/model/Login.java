/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nathan.model;

/**
 *
 * @author Nathan
 */
public class Login {
    
    private int id_log;
    private String login;
    private String senha;

    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Login(int id_log, String login, String senha) {
        this.id_log = id_log;
        this.login = login;
        this.senha = senha;
    }

    public int getId_log() {
        return id_log;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
