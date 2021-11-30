/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Cadastro_porca {
    
    private int codigo;
    private int cd_mossa;
    private String data_entrada;
    private String data_cobertura;
    private String brinco;
    private boolean abate;

    public boolean isAbate() {
        return abate;
    }

    public void setAbate(boolean abate) {
        this.abate = abate;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCd_mossa() {
        return cd_mossa;
    }

    public void setCd_mossa(int cd_mossa) {
        this.cd_mossa = cd_mossa;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getData_cobertura() {
        return data_cobertura;
    }

    public void setData_cobertura(String data_cobertura) {
        this.data_cobertura = data_cobertura;
    }

    public String getBrinco() {
        return brinco;
    }

    public void setBrinco(String brinco) {
        this.brinco = brinco;
    }
    
    
    

    
}
