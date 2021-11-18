/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Conexao;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Registro_partoo;

/**
 *
 * @author caue.seidel
 */
public class Registro_partoConttroler {
    public boolean inserir(Registro_partoo objeto){
        try{
            Connection con = Conexao.getConnection();
            PreparedStatement stmt = null;
            
            java.sql.Date date = java.sql.Date.valueOf(objeto.getData_real_patrto());
            
            StringBuilder sql = new StringBuilder();
            sql.append("insert into registro_parto values(default, ?, ?, ?, ?, ?)");
            stmt = con.prepareStatement(sql.toString());
            
            stmt.setInt(1, objeto.getNascidos_mortos());
            stmt.setInt(2, objeto.getNascidos_vivos());
            stmt.setFloat(3, objeto.getPeso_leitoes());
            stmt.setInt(4, objeto.getCd_porca());
            stmt.setDate(5, date);
            
            stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println("Erro inserir " +e);
            return false;
        }
        
        
        
    }
    
     public void preencher(JTable jtbUsuarios) {

        Conexao.abreConexao();

        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector(); //receber os dados do banco

        cabecalhos.add("Id");
        cabecalhos.add("Nsc Mortos ");
        cabecalhos.add("Nsc Vivos ");
        cabecalhos.add("Peso medio ");
        cabecalhos.add("Dt Parto ");
        cabecalhos.add("Brinco Porca");
        
        try{
        ResultSet result = null;
        StringBuilder wSql = new StringBuilder();
        wSql.append(" select  r.codigo, r.nascidos_vivos, r.peso_leitoes, r.nascidos_mortos,  ");
        wSql.append(" to_char(r.data_real_parto, 'dd / mm / yyyy'), r.cd_porca ");
        wSql.append(" from registro_parto r ");

            result = Conexao.stmt.executeQuery(wSql.toString());

            Vector<Object> linha;
            while (result.next()) {
                linha = new Vector<Object>();
               // for(int i =1; i <= contado)

                linha.add(result.getInt(1));
                linha.add(result.getInt(2));
                linha.add(result.getFloat(3));
                linha.add(result.getInt(4));
                linha.add(result.getString(5));
                linha.add(result.getInt(6));

                dadosTabela.add(linha);
            }

        } catch (SQLException e) {
            System.out.println("problemas para popular tabela..." +e);
            System.out.println(e);
        }

        jtbUsuarios.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {
            /*
            @Override
            public Class getColumnClass(int column){
                if(column == 3){
                    return Icon.class;
                }else {
                return null;
                }
            }
              */  
            
            @Override
            public boolean isCellEditable(int row, int column) {
                //se column == 3 retorna true else false
                return false;
            }
            // permite seleção de apenas uma linha da tabela
        });

        // permite seleção de apenas uma linha da tabela
        jtbUsuarios.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        /*
        TableColumn column = null;
        for (int i = 0; i <= 2; i++) {
            column
                    = jtbUsuarios.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(60);
                    break;
                case 1:
                    column.setPreferredWidth(200);
                    break;
                case 3:
                    column.setPreferredWidth(10);
                    break;
            }
        }*/

        //função para deixar a tabela zebrada
        jtbUsuarios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.LIGHT_GRAY);
                } else {
                    setBackground(Color.WHITE);
                }

                return this;
            }
        });
        //return (true);
    }
    
    
}
