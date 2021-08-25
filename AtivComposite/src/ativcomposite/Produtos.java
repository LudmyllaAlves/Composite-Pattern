/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tatia
 */
public class Produtos implements Assinaturas {
    
    
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public double getPrice() {
        return this.preco;
    }
    
    
    public String getNome() {
        return this.nome;
    }
}

