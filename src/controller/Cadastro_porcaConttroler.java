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
import java.text.SimpleDateFormat;
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
        ResultSet rs = null;
        StringBuilder sql = new StringBuilder();

        //tem aquele outro campo tem de ver a posicao dele e tal se for not null etc
        sql.append(" insert into cadastro_porca values default , ? , ? , ?");
        stmt = con.prepareStatement(sql.toString());
        stmt.setInt(1, objeto.getCd_mossa());
        stmt.setInt(2, objeto.getBrinco());
        SimpleDateFormat sd = new SimpleDateFormat();
        
        stmt.setDate(3, objeto.getData_entrada());
        
        stmt.executeQuery();
        return true;
        
        }catch(SQLException e){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro incluir cadastroporcaController "+e);
            return false;
        
        }
        
    }
    
}
