/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;

/**
 *
 * @author tatia
 */
public enum AssCliente  {
    BRONZE(new Cliente("Bronze", 3)),
    PRATA(new Cliente("Prata", 5)),
    OURO(new Cliente("Ouro", 7)),
    PLATINA(new Cliente("Platina", 10));
    
    private Cliente cliente;
    
    AssCliente(Cliente cliente){
        this.cliente = cliente;
    };

    public Cliente getCriator() {
        return this.cliente;
    }
     
}

    

