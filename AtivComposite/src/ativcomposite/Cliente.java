/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;
import ativcomposite.Caixa;

/**
 *
 * @author tatia
 */
public class Cliente implements Assinaturas {
   private String assinatura;
    private int qtdItens;
    private Caixa caixa = new Caixa();
    
    public Cliente(String assinatura, int qtdItens) {
        this.assinatura = assinatura;
        this.qtdItens = qtdItens;
    }
    
  //Getters  
    public String getAssinatura() {
        return assinatura;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
