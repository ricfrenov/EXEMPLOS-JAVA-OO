package carro_20131_sub;
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


}
