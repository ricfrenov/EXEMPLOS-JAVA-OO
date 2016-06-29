package exercicios.de.vetores.lp2;
import java.util.Scanner;
public class Questão4 {
public static void main(String[] args) {
    
int v[] = new int[8];
int w[] = new int [8];
double r[] = new double[8];
double med=0,soma;
int cont=0;

    System.out.println("Digite os Valores para o Vetor V: ");
for (int i=0;i<8;i++){
    Scanner ler = new Scanner (System.in);
    v[i]=ler.nextInt();
    r[i]=v[i];  //O VETOR 'R' JÁ RECEBE OS VALORES DO VETOR 'V' PARA QUE MAIS ABAIXO SEJA 
               // NECESSÁRIO SOMENTE A SOMA DOS VETORES R E W PARA OBTER O RESULTADO DA SOMA DAS POSIÇÕES DOS VETORES 'V & W';
}               
    System.out.println("Digite os valores para o vetor W: ");
for (int j=0;j<8;j++){
    Scanner ler2= new Scanner(System.in);
    w[j]=ler2.nextInt();
    r[j]=r[j]+w[j];   
if (r[j]>25){       // Condição para iniciar o calculo da média dos valores maiores que 25;
    cont=cont+1;    // Contador para fazer a média da soma dos valores;
    soma=r[j];
    med=med+soma;
}
}
for (int k=0;k<8;k++){
    System.out.print("O Vetor R é: "+r[k]+"\n");       
}
    med=med/cont; // Termino do calculo da Média;
    System.out.println("A Media dos valores de R que sao maiores que 25 é: "+med);
}
}