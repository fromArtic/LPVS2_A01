/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Ex03{
    public static void main(String[] args){
        double valorCompra, valorPrestacoes;
        
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de sua compra, em reais"));
        valorPrestacoes = valorCompra/5;
        
        JOptionPane.showMessageDialog(null, "Dividindo o total de sua compra em cinco prestações sem juros, o valor por prestação a ser pago será de R$" 
                + valorPrestacoes);
    }
}
