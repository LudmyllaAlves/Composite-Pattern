/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativcomposite;

import java.util.ArrayList;
import java.util.Random;
import ativcomposite.Cliente;
import ativcomposite.AssCliente;
import ativcomposite.Produtos;

/**
 *
 * @author tatia
 */
public class AtivComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<Produtos> produtos = new ArrayList<>();
        itens(produtos);
        
        ArrayList<Cliente> clientes = new ArrayList();
        
        clientes.add(AssCliente.BRONZE.getCriator());
        clientes.add(AssCliente.PRATA.getCriator());
        clientes.add(AssCliente.OURO.getCriator());
        clientes.add(AssCliente.PLATINA.getCriator());
        
        clientes.forEach(cliente ->{
           System.out.println("----------------------------------------");
           System.out.println("Tipo Cliente: " + cliente.getAssinatura());
           cliente.getCaixa().setChildren( 
                escolherItensBox(cliente.getQtdItens(), produtos));
        
            System.out.println("Ver Box: ");
            cliente.getCaixa().verCaixa();
            System.out.println("Preço total: " + cliente.getCaixa().getPrice());
            System.out.println("----------------------------------------\n");
        });
        
        
    }
    
    private static void itens(ArrayList<Produtos> produtos){ 
        
        produtos.add(new Produtos("Quadrinhos", 15));
        produtos.add(new Produtos("Chaveiros", 5));
        produtos.add(new Produtos("Bustos", 10));
        produtos.add(new Produtos("Adesivos", 1));
        produtos.add(new Produtos("Posters", 25));
        produtos.add(new Produtos("Camisetas", 25));
        produtos.add(new Produtos("Miniaturas", 20));
        
    }
    
    private static ArrayList escolherItensBox(int numeroItens, ArrayList produtos){
        Random random = new Random();
        ArrayList array = new ArrayList();
        
        while(numeroItens > 0){
            int item = random.nextInt(7);
            array.add(produtos.get(item));
            numeroItens--;
        }
        
        return array;
    }

    
}
