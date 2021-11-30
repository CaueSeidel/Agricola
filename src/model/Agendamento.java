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
    private String data_parto;
    private String data_ins;
    private int cd_porca;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData_parto() {
        return data_parto;
    }

    public void setData_parto(String data_parto) {
        this.data_parto = data_parto;
    }

    public String getData_ins() {
        return data_ins;
    }

    public void setData_ins(String data_ins) {
        this.data_ins = data_ins;
    }

    public int getCd_porca() {
        return cd_porca;
    }

    public void setCd_porca(int cd_porca) {
        this.cd_porca = cd_porca;
    }

    
    
    
    
}
