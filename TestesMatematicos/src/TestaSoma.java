/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colorindo Festas
 */
public class TestaSoma {
    
    public static void main(String[]args){
        MatematicaAvancada ma = new MatematicaAvancada();
        ma.soma(900, 750);
        double valorSeguro = ma.getResultado();
        System.out.println("Valor do seguro.........: " + valorSeguro);
        
        if(ma.par(valorSeguro)){
            System.out.println("----------------> Este número é 1 " );          
            
        }
        else{
            System.out.println("-------------> Este número é ");
        }
        double fatorDesconto = ma.descontoSeguro(9); // Classe bônus 5
        double seguroDesconto = valorSeguro * fatorDesconto;
        double seguroFinal = valorSeguro - seguroDesconto;
        
        System.out.println("Fator de desconto......: " + fatorDesconto);
        System.out.println("Valor do desconto......: "+ seguroDesconto);
        System.out.println("Seguro com desconto....: "+ seguroFinal);
    
    }
    
}
