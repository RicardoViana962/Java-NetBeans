/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colorindo Festas
 */
public class MatematicaAvancada {
    
    private double resultado;
    
    public void soma(double valor1, double valor2){
        setResultado(valor1 + valor2);
    
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    
    public boolean par(double valorDec){
        boolean retorno = false;
        int valorInt = (int) valorDec;
        if (valorDec / 2 == valorInt / 2) retorno = true;
        return retorno;
    }
    
        public double descontoSeguro(int classeBonus){
            double retorno = 0;
            switch (classeBonus){
                case 1:
                    retorno = 0.05; //5%
                    break;
                case 2:
                    retorno = 0.06; //6%
                    break;
                case 3:
                    retorno = 0.065; //6,5%
                    break;
                case 4:
                    retorno = 0.07; // 7%
                    break;
                case 5:
                    retorno = 0.08; //8%
                    break;
                case 6:
                    retorno = 0.85; //8,5%
                    break;
                case 7:
                    retorno = 0.87; //8,7%
                    break;
                case 8:
                    retorno = 0.90; //9%
                    break;
                case 9:
                    retorno = 0.010; //10%
                    break;
            }
            return retorno;
        }
}
