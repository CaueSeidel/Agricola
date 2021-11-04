/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Registro_parto {
    
    private int codigo;
    private int nascidos_mortos;
    private int nascidos_vivos;
    private int peso_leitoes;

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

    public int getPeso_leitoes() {
        return peso_leitoes;
    }

    public void setPeso_leitoes(int peso_leitoes) {
        this.peso_leitoes = peso_leitoes;
    }
    
    
    
}
