/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Registro_partoo {
    
    private int codigo;
    private int nascidos_mortos;
    private int nascidos_vivos;
    private float peso_leitoes;
    private String data_real_patrto;
    private int cd_porca;

    public String getData_real_patrto() {
        return data_real_patrto;
    }

    public void setData_real_patrto(String data_real_patrto) {
        this.data_real_patrto = data_real_patrto;
    }

    public int getCd_porca() {
        return cd_porca;
    }

    public void setCd_porca(int cd_porca) {
        this.cd_porca = cd_porca;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNascidos_mortos() {
        return nascidos_mortos;
    }

    public void setNascidos_mortos(int nascidos_mortos) {
        this.nascidos_mortos = nascidos_mortos;
    }

    public int getNascidos_vivos() {
        return nascidos_vivos;
    }

    public void setNascidos_vivos(int nascidos_vivos) {
        this.nascidos_vivos = nascidos_vivos;
    }

    public float getPeso_leitoes() {
        return peso_leitoes;
    }

    public void setPeso_leitoes(float peso_leitoes) {
        this.peso_leitoes = peso_leitoes;
    }
    
    
    
}
