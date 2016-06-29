/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carro_20131_sub;

/**
 *
 * @author marcelo
 */
public class Carro {
    String modelo;
    String cor;
    int anoFab;
    boolean motor;

    public void verificarInformacoes(){
        System.out.println("Informações: " + modelo + " " + cor + " " + anoFab);

    }

    public void ligueCarro(){

        if(motor == false){
            motor = true;
            System.out.println("Carro foi ligado");
        }else{
            System.out.println("O Carro já tá ligado seu burro");
        }

    }

    public void desligueCarro(){
        if(motor == true){
            motor = false;
             System.out.println("Carro foi desligado");
            }else{
            System.out.println("O Carro já tá desligado seu burro");
            }

    }


}
