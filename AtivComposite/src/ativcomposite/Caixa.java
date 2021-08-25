/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;

import java.util.ArrayList;

/**
 *
 * @author tatia
 */
public class Caixa implements Assinaturas{
    
       private ArrayList<Assinaturas> children = new ArrayList<>();
    
    @Override
    public double getPrice() {
        double soma = 0;
        
        for(Assinaturas item : this.children){
            soma += item.getPrice();
        }
        
        return soma; 
    }
    
    public void verCaixa(){
        this.children.forEach(item ->{
            if(item.getClass().equals(Produtos.class)){
                Produtos produtos = (Produtos) item;
                System.out.println("Item: " + produtos.getNome() + " - Preço: R$ " + produtos.getPrice());
            }
        });
    }
    
    public void add(Assinaturas item){
        this.children.add(item);
    }
    
    public void remove(Assinaturas item){
        this.children.remove(item);
    }

  //Setter
    public void setChildren(ArrayList<Assinaturas> children) {
        this.children = children;
    }
}
    

