/**
 *
 * @author Jv Loreti
 */

import javax.swing.JOptionPane;

public class Ex05{
    public static void main(String[] args){
        double alturaDegrau, alturaAlmejada, degrausNecessarios;
        
        alturaDegrau = Double.parseDouble(JOptionPane.showInputDialog("Informe, em cm, a altura de cada degrau que constitui a escada"));
        alturaAlmejada = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura, em cm, que deseja alcançar subindo a escada?"));
        
        degrausNecessarios = alturaAlmejada/alturaDegrau;
        
        JOptionPane.showMessageDialog(null, "Para alcançar a altura almejada de " + alturaAlmejada + "cm, você deverá subir " + degrausNecessarios 
                + " degraus.");
    }
}
