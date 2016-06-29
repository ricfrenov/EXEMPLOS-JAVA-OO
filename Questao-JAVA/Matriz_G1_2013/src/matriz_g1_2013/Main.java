/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz_g1_2013;

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
        // TODO code application logic
        int[][] mat = new int [4][3];

        int cont = 0;
        for(int i = 0; i < 4;i++){
            System.out.println(" ");
            for(int j = 0;j < 3;j++){

                String valor = JOptionPane.showInputDialog("Informe valor");
                int v = Integer.parseInt(valor);
                mat[i][j] = v;
                System.out.print(" " + mat[i][j]);
                if(mat[i][j] == 55){
                    cont++;
                }

            }
        }
        System.out.println(" ");
        if(cont == 0){
            System.out.println(" Nenhum Encontrado ");
        }else{
          System.out.println(" Quantidade:  " + cont);
        }

        for(int i = 0; i < 4;i++){
            System.out.println(" ");
            for(int j = 0;j < 3;j++){

                if(mat[i][j] == 55){
                   System.out.println(" Linha: " + (i +1) + " Coluna: " + (j + 1));
                }

            }
        }


        System.out.println(" ");





    }

}
