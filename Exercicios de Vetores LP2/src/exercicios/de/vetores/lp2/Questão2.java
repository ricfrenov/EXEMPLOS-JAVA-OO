package exercicios.de.vetores.lp2;

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
      
        double vet[] = new double[10];
        double cont=0,med=0;
        int cont2=0;
        
            System.out.println("Digite as 10 Notas: ");
        for (int i=0;i<10;i++){
            Scanner ler=new Scanner (System.in);
            vet[i]=ler.nextInt();
        
            cont=vet[i]+vet[i]/10;
            med=cont;
        }
        for (int j =0 ;j<10;j++){
        if (vet[j]<med){
            cont2=cont2+1;  
        }
        } 
            System.out.println("Quantidade de Medias Abaixo: "+cont2);  
    }
}
