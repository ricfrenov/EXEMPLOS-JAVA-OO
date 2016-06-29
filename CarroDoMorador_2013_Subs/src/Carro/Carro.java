/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Carro;

/**
 *
 * @author marcelo
 */
public class Carro {
    public String cpfDono;
    public String modelo;
    public String cor;
    public int anoFab;
    public boolean motor;

    public Carro(String cpf,String m,String c,int a){
        cpfDono = cpf;
        modelo = m;
        cor = c;
        anoFab = a;
    }

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
