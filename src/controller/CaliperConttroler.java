/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Caliper;

/**
 *
 * @author caue.seidel
 */
public class CaliperConttroler {
    
    public boolean inserir(Caliper objeto){
        try{
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        
        StringBuilder sql = new StringBuilder();
        
        sql.append("insert into caliper values(default, ?, ?, ?)");
        
        java.sql.Date data = java.sql.Date.valueOf(objeto.getData());
            System.out.println("data banco"+data);
        stmt = con.prepareStatement(sql.toString());
        stmt.setDate(1, data);
        stmt.setInt(2, objeto.getCd_porca());
        stmt.setInt(3, objeto.getSituacao());
        
        
        
        stmt.executeUpdate();
        
        return true;
        }catch(SQLException e){
            System.out.println("erro inserir caliperController"+e);
            return false;
        }
    }
    
}
