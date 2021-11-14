/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import database.Conexao;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import model.Cadastro_porca;
import tools.CaixaDeDialogo;

/**
 *
 * @author caue.seidel
 */
public class Cadastro_porcaConttroler {
    
    public boolean incluir(Cadastro_porca objeto){
        try{
            
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        StringBuilder sql = new StringBuilder();

        //tem aquele outro campo tem de ver a posicao dele e tal se for not null etc
        sql.append(" insert into cadastro_porca values (22 , ? , ? , ?)");
        
        stmt = con.prepareStatement(sql.toString());
        stmt.setInt(1, objeto.getCd_mossa());
       
           //System.out.println(""+objeto.getData_entrada());
        java.sql.Date data = java.sql.Date.valueOf(objeto.getData_entrada());
       
        
        stmt.setDate(2, data);
        stmt.setString(3, objeto.getBrinco());
            //System.out.println("data incluir "+data);
        
        stmt.executeUpdate();
        
        return true;
        
        
        
        }catch(SQLException  e){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro incluir cadastroporcaController "+e);
            return false;
        
        }
        
    }
    
}
