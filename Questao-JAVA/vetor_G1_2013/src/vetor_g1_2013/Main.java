/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vetor_g1_2013;

/**
 *
 * @author marcelo
 */
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] lp = new String[4];
        String[] bd = new String[3];

        System.out.println("Alunos LP");
        for(int i = 0; i < 4;i++){
            String valor = JOptionPane.showInputDialog("Informe nome LP");
            lp[i] = valor;
            System.out.println(" " + lp[i]);

        }

        System.out.println("Alunos BD");
        for(int i = 0; i < 3;i++){
            bd[i] = JOptionPane.showInputDialog("Informe nome BD");
            System.out.println(" " + bd[i]);

        }

        System.out.println("Estão nas duas: ");

        int trava = 0;
        for(int i = 0;i < 4;i++){
            for(int j = 0; j < 3;j++){
               if(lp[i].equals(bd[j])==true){
                 System.out.println(" " + lp[i]);
                 trava = 1;
               }
            }
        }

        
        if(trava == 0){
         System.out.println("Nenhum Aluno Encontrado");
        }

         





    }

}
