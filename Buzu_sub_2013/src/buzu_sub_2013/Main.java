/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buzu_sub_2013;

/**
 *
 * @author marcelo
 */
import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Leito objL = new Leito("001", "salvador", "são paulo", 100, 20);
        SemiLeito objSL = new SemiLeito("002", "bh", "rio de janeiro", 80, 30);
        Convencional objC = new Convencional("003", "paraiso", "nosso lar", 60, 40);

        String opcao1 = JOptionPane.showInputDialog("Qual classe deseja? L: Leito; S:Semi Leito ou C:Convencional (digite fim para sair) ");

        while (opcao1.equalsIgnoreCase("fim") == false) {

            if (opcao1.equalsIgnoreCase("l")) {
                String opcao2 = JOptionPane.showInputDialog("Deseja Informações(I); Verificar Assentos Disponiveis(v) ou comprar passagem(c)(digite fim para sair)");

                while (opcao2.equalsIgnoreCase("fim") == false) {
                    if (opcao2.equalsIgnoreCase("i")) {
                        objL.mostreAtrubutos();
                    } else {
                        if (opcao2.equalsIgnoreCase("v")) {
                            objL.verificar_Lugar();
                        } else {
                            if (opcao2.equalsIgnoreCase("c")) {
                                objL.comprarAssento();
                            } else {
                                System.out.println("Opção Inválida");
                            }
                        }
                    }
                    opcao2 = JOptionPane.showInputDialog("Deseja Informações(I); Verificar Assentos Disponiveis(v) ou comprar passagem(c)(digite fim para sair)");

                }
            }


            opcao1 = JOptionPane.showInputDialog("Qual classe deseja? L: Leito; S:Semi Leito ou C:Convencional (digite fim para sair) ");


        }

    }
}
