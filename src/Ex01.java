/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Ex01{
    public static void main(String[] args){
        double valorOriginal, percentual, valorDescontado, valorFinal;
        
        valorOriginal = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do produto que deseja comprar, em reais"));
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto"));
        
        valorDescontado = (valorOriginal * percentual)/100;
        valorFinal = valorOriginal - valorDescontado;
        
        JOptionPane.showMessageDialog(null, "Foram descontados R$" + valorDescontado + " de sua compra. Seu novo total a pagar: R$" + valorFinal);
    }
}
