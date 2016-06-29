package exercicios.de.vetores.lp2;
import java.util.Scanner;
public class Questão5 {
public static void main(String[] args) {
        
        int LP[]= new int [7];
        int BD[]= new int [4];
        int Result[]= new int [7];
        
            System.out.println("Digite a Matricula dos Alunos de Banco de Dados: ");
        for (int j=0;j<4;j++){
            Scanner ler2 = new Scanner (System.in);
            BD[j]=ler2.nextInt();
        }
            System.out.println("Digite a Matricula dos Alunos de Lógica de Programação: ");
        for (int i=0;i<7;i++){
            Scanner ler = new Scanner (System.in);
            LP[i]=ler.nextInt();
            
        if  ((((LP[i]==BD[0])||(LP[i]==BD[1])||(LP[i]==BD[2])||(LP[i]==BD[3])))){
            Result[i]=LP[i];
        }
        }    
            System.out.println("Os Números da Matricula dos Alunos que estão matriculados nas duas disciplinas são: ");
        for (int k=0;k<7;k++){
        if (Result[k]!=0){
            System.out.println(Result[k]+" \n"); 
            }
        }
        }      
}