package exercicios.de.vetores.lp2;
import java.util.Scanner;
public class Questão1 {
    public static void main(String[] args) {
        
        int vet[] = new int [8];
        int num;
        double cont=0;
        
            System.out.println("Digite os Oito Valores");
        for (int i=0;i<8;i++){
            Scanner ler = new Scanner (System.in);   
            vet[i]=ler.nextInt();
        }
            System.out.println("Digite um Número: ");
            Scanner ler2=new Scanner (System.in);
            num=ler2.nextInt();
        for (int j=0;j<8;j++){
        if (num==vet[j]){
            cont=cont+1;
        }
        }
            System.out.println("Temos "+cont+" posições com este Número");
    }
}

