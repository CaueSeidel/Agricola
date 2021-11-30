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
import model.Agendamento;

/**
 *
 * @author caue.seidel
 */
public class AgendamentoConttroler {
    
    public boolean inserir(Agendamento objeto){
        try{
            
            Connection con = Conexao.getConnection();
            PreparedStatement stmt = null;
            
            java.sql.Date inseminacao = java.sql.Date.valueOf(objeto.getData_ins());
            java.sql.Date parto = java.sql.Date.valueOf(objeto.getData_parto());
            
            String sql = "insert into agendamento values (default, ?,?,?)";
            
            stmt = con.prepareStatement(sql);
            System.out.println(""+objeto.getCodigo());
            
            stmt.setDate(1, inseminacao);
            stmt.setInt(2, objeto.getCd_porca());
            stmt.setDate(3, parto);
            stmt.executeUpdate();
            return true;
            
            
        }catch(SQLException e){
            System.out.println("erro sql inserir"+e.getMessage());
            return false;
        }
        
    }
    
}
