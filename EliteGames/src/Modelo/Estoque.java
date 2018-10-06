/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 181610047
 */
public class Estoque {
    
    int cod_estoque;
    int quantidade;
    int estoque_minimo;

    public int getCod_estoque() {
        return cod_estoque;
    }

    public void setCod_estoque(int cod_estoque) {
        this.cod_estoque = cod_estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoque_minimo() {
        return estoque_minimo;
    }

    public void setEstoque_minimo(int estoque_minimo) {
        this.estoque_minimo = estoque_minimo;
    }
    
}
