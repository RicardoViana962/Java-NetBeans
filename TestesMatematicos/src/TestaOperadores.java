/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colorindo Festas
 */
public interface TestaOperadores {
    
    /**
     *
     * @param args
     */
    public static void main(String[]args){
        
        int valor1 = 10;
        int valor2 = 5;
        
        if(valor1 == valor2) System.out.println("Valor1 é igual a valor2: ");
        
        if(valor1 != valor2) System.out.println("Valor1 não é igual a valor2: ");
        
        if(valor1 > valor2) System.out.println("Valor1 é maior que valor2: ");
        
        if(valor1 < valor2) System.out.println("Valor1 é menor que valor2: ");
        
        if(valor1 >= valor2) System.out.println("Valor1 é maior ou igual que valor2: ");
        
        if(valor1 <= valor2) System.out.println("Valor1 é menor ou igual que valor2");
    }
    
}
