/**
 *
 * @author Jv Loreti
 */

import java.util.Scanner;

public class Ex02{
    public static void main(String[] args){
        double quantDolares, cotacao, conversaoParaReais;
        
        Scanner teclado =  new Scanner(System.in);
        
        System.out.println("Informe a quantidade de dólares guardada no cofre: ");
        quantDolares = teclado.nextDouble();
        System.out.println("Qual a cotação do dólar no dia atual? ");
        cotacao = teclado.nextDouble();
        
        conversaoParaReais = quantDolares*cotacao;
        
        System.out.println("Valor equivalente ao total guardado no cofre, em reais: R$" + conversaoParaReais);
    }
}
