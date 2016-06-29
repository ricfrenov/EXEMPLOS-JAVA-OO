/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carro_obj;
import javax.swing.JOptionPane;
public class CARRO_OBJ {

    public static void main(String[] args) {
/*
        Carro obj = new Carro();
        obj.modelo = "corsa";
        obj.cor = "preto ";
        obj.anoFab = 2010;

        obj.verificarInformacoes();
*/

        Carro obj2 = new Carro();

        obj2.modelo = JOptionPane.showInputDialog("Digite o Modelo do Carro");
        obj2.cor = JOptionPane.showInputDialog("Digite a Cor");
        obj2.anoFab = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano"));

        obj2.verificarInformacoes();
        
        String opcao = JOptionPane.showInputDialog("l: ligar;d: desligar ou fim");
        
        while ()
        if (opcao.equalsIgnoreCase("l")==true){
            obj2.desligueCarro();
        }else{
            System.out.println("Opção Invalida!");
        }
        
        obj2.ligueCarro();
        
        obj2.desligueCarro();
    }
}
