/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carro_20131_sub;

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

        
        Carro obj = new Carro();
        obj.modelo = "Corsa";
        obj.cor = "Preto";
        obj.anoFab = 2010;

       obj.verificarInformacoes();
        
         

        Carro obj2 = new Carro();

        obj2.modelo = JOptionPane.showInputDialog("Informe modelo");
        obj2.cor = JOptionPane.showInputDialog("Informe cor");
        obj2.anoFab = Integer.parseInt(JOptionPane.showInputDialog("Informe ano"));

        obj2.verificarInformacoes();

        System.out.println("********* PODE SEGUIR COM O SEU CARRO *************");


        String opcao1 = JOptionPane.showInputDialog("Seu Carro é: " + obj.modelo + " ou "+ obj2.modelo );

        if(opcao1.equalsIgnoreCase(obj.modelo)==true){
            obj.verificarInformacoes();
          String opcao2 = JOptionPane.showInputDialog("l:ligar;d:desligar ou fim");

        while (opcao2.equalsIgnoreCase("fim") == false) {

            if (opcao2.equalsIgnoreCase("l") == true) {
                obj.ligueCarro();
            } else {
                if (opcao2.equalsIgnoreCase("d") == true) {
                    obj.desligueCarro();
                } else {
                    System.out.println("Opção Invalida");
                }
            }
            opcao2 = JOptionPane.showInputDialog("l:ligar;d:desligar ou fim");

        }
        }else{
            obj2.verificarInformacoes();
          String opcao2 = JOptionPane.showInputDialog("l:ligar;d:desligar ou fim");

        while (opcao2.equalsIgnoreCase("fim") == false) {

            if (opcao2.equalsIgnoreCase("l") == true) {
                obj2.ligueCarro();
            } else {
                if (opcao2.equalsIgnoreCase("d") == true) {
                    obj2.desligueCarro();
                } else {
                    System.out.println("Opção Invalida");
                }
            }
            opcao2 = JOptionPane.showInputDialog("l:ligar;d:desligar ou fim");

        }
        }
        
        

        




    }

}
