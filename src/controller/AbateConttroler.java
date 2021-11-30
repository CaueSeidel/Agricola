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
import model.Abate;

/**
 *
 * @author caue.seidel
 */
public class AbateConttroler {
    
    public boolean inserir(Abate objeto){
        try{
            Connection con = Conexao.getConnection();
            PreparedStatement stmt, stmt2 = null;
            
            String sql = "insert into abate values(default, ?, ?, ?)";
            String sql2 = "update cadastro_porca set abate = 'true' where codigo ="+objeto.getCd_porca();
            
            java.sql.Date data = java.sql.Date.valueOf(objeto.getData_saida());
            
            stmt2 = con.prepareStatement(sql2);
            stmt = con.prepareStatement(sql);
            
            stmt.setDate(1, data);
            stmt.setInt(2, objeto.getCd_porca());
            stmt.setInt(3, objeto.getId_saida());
            
            stmt.executeUpdate();
            
            stmt2.executeUpdate();
            
            return true;
            
            
        }catch(SQLException e){
            System.out.println("erro inserir "+e.getMessage());
            return false;
        }
            
            
        
    }
    
}
