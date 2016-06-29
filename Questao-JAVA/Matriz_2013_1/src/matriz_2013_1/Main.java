/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz_2013_1;

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

        //Questão 1 e 2
        /*
        int[][] mat = new int[3][2];


        for (int i = 0; i < 3; i++) {
        System.out.println(" ");
        for (int j = 0; j < 2; j++) {
        String valor = JOptionPane.showInputDialog("Informe Valor");
        mat[i][j] = Integer.parseInt(valor);
        System.out.print(" " + mat[i][j]);
        }
        }
        System.out.println(" ");
        int cont = 0;
        for (int i = 0; i < 3; i++) {
        System.out.println(" ");
        for (int j = 0; j < 2; j++) {
        if(mat[i][j] == 55){
        cont++;
        System.out.println("Posição: Linha: " + (i+1) + " Coluna: "+ (j+1) + " Tem 55");


        }
        }
        }

        if(cont == 0){
        System.out.println(" Nenhum igual a 55 ");
        }else{
        System.out.println("Quantidade: " + cont);
        }
         */

        // Quarta questão

        /*
        int[][] mat = new int[4][3];


        for (int i = 0; i < 4; i++) {
        System.out.println(" ");
        for (int j = 0; j < 3; j++) {
        String valor = JOptionPane.showInputDialog("Informe Valor");
        mat[i][j] = Integer.parseInt(valor);
        System.out.print(" " + mat[i][j]);
        }
        }


        System.out.println(" ");

        int soma;
        for (int j = 0;j < 3;j++)  {
        soma = 0;
        for (int i = 0;i < 4;i++)  {
        soma = soma + mat[i][j];

        }
        System.out.println(" Soma: " + soma);
        }

         */
        // questão 5
        /*
        int[][] mat = new int[4][3];
        int[][] mat2 = new int[4][3];

        System.out.println(" MATRIZ 1");
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                String valor = JOptionPane.showInputDialog("Informe Valor");
                mat[i][j] = Integer.parseInt(valor);
                System.out.print(" " + mat[i][j]);
            }
        }

        System.out.println(" ");
        System.out.println(" MATRIZ 2");
        int cont = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                mat2[i][j] = mat[i][j] + cont;
                System.out.print(" " + mat2[i][j]);
                cont++;
            }
        }
         */

        String [][] mat = new String[4][2];

        for(int i = 0; i < 4;i++){
            for(int j = 0;j < 2;j++){
                if(j == 0){
                    mat[i][j] = JOptionPane.showInputDialog("Digite Cidade");
                }else{
                    mat[i][j] = JOptionPane.showInputDialog("Digite DDD de " + mat[i][j-1]);
                }
            }
        }

        String cidade = JOptionPane.showInputDialog("Digite Cidade para saber DDD ou fim");

        while(cidade.equals("fim") == false){
        boolean trava = false;
        for(int i = 0;i < 4;i++){
            if(mat[i][0].equalsIgnoreCase(cidade)==true){
                JOptionPane.showMessageDialog(null, " DDD: " + mat[i][1]);
                trava = true;
            }
        }

        if(trava == false){
            JOptionPane.showMessageDialog(null, " DDD: Cidade não cadastrada");
        }

        cidade = JOptionPane.showInputDialog("Digite Cidade para saber DDD ou fim");

        }


        System.out.println(" ");
    }
}
