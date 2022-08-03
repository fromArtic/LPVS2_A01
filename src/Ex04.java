/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Ex04{
    public static void main(String[] args){
        double precoDeCusto, margemDeLucro, precoDeVenda;
        
        precoDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço de custo do produto"));
        margemDeLucro = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o percentual da margem de lucro obtida com o produto"));
        
        precoDeVenda = (precoDeCusto * margemDeLucro) + precoDeCusto;
        
        JOptionPane.showMessageDialog(null, "O valor de venda do produto em questão equivale a R$" + precoDeVenda);
    }
}
