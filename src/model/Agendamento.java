/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author caue.seidel
 */
public class Agendamento {
    
    private int codigo;
    private String descricao;
    private String data;
    private int cd_porca;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCd_porca() {
        return cd_porca;
    }

    public void setCd_porca(int cd_porca) {
        this.cd_porca = cd_porca;
    }
    
    
    
}
