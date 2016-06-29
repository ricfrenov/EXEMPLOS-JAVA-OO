package exercicios.de.vetores.lp2;
import java.util.Scanner;
public class Questão3_Dois_em_um {
public static void main(String[] args) {
       
        int vet[]= new int[10];
        int maior=0;
        int menor = Integer.MAX_VALUE;
        int Posi=-1;
        
            System.out.println("Digite os Valores: ");
        for (int i=0;i<10;i++){
            Scanner ler = new Scanner (System.in);
            vet[i]=ler.nextInt();
        }
        for(int j=0;j<10;j++){   
        if (vet[j]>maior){ 
            maior=vet[j];
            Posi=Posi+1;
            }else{
        if(vet[j]<menor){
            menor=vet[j];
        }
        }
        } 
            System.out.println("O Maior Valor é: "+maior);
            System.out.println("Posição do Maior numero é: "+Posi);
}
}