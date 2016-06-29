
package carro_obj;

public class Carro {
    String cor;
    String modelo;   //dados dos carro
    int anoFab;
    boolean motor;
    
    public void verificarInformacoes(){
        System.out.println("Informação:" + modelo +"  "+cor+"  "+ anoFab);
    }
    
    
      public void ligueCarro(){
          
          if(motor==false){
              motor= true;
              System.out.println("Carro ligado");
          }else{
              System.out.println("0 Carro já está ligado!");
          }
      }
      
      public void desligueCarro(){
          if(motor==true){
              motor=false;
              System.out.println("O Carro foi Desligado");
          }else{
            System.out.println("O Carro já está Desligado!");  
          }
      }
}
