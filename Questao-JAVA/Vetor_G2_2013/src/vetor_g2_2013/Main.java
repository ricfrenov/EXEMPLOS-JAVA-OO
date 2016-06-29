/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor_g2_2013;

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
        /*
         * Questão 5
        int[] v = new int[4];
        int[] w = new int[4];
        int[] r = new int[4];

        System.out.println(" VALORES V");
        for (int i = 0; i < 4; i++) {

            String valor = JOptionPane.showInputDialog("Informe Valor V");
            int va = Integer.parseInt(valor);
            v[i] = va;
            System.out.println(" " + v[i]);

        }
        System.out.println(" VALORES W");
        for (int i = 0; i < 4; i++) {

            w[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe Valor W"));
            System.out.println(" " + w[i]);

        }

        System.out.println(" VALORES R");
        double soma = 0.0;
        double cont = 0.0;
        for (int i = 0; i < 4; i++) {
           r[i] = v[i] + w[i];
           System.out.println(" " + r[i]);
           if(r[i] > 25){
               soma = soma + r[i];
               cont++;
           }

        }

        if(cont == 0.0){
          System.out.println(" NENHUM MAIOR QUE 25");
        }else{
         double media = soma /cont;

        System.out.println(" MEDIA: " + media);
        }


         */

        String[] lp = new String[3];
        String[] bd = new String[4];

        System.out.println(" LOGICA PROGRAMAÇÃO");
        for (int i = 0; i < 3; i++) {

            lp[i] = JOptionPane.showInputDialog("Informe nome para lp");
            System.out.println(" " + lp[i]);

        }

        System.out.println(" BANCO DE DADOS");
        for (int i = 0; i < 4; i++) {

            bd[i] = JOptionPane.showInputDialog("Informe nome para BD");
            System.out.println(" " + bd[i]);

        }
        System.out.println(" Estão nas duas");
        int trava = 0;
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 4;j++){

                if(lp[i].equals(bd[j])==true){
                  System.out.println(" " + lp[i]);
                  trava = 1;
                }

            }
        }

        if(trava == 0){
         System.out.println(" Nenhum");
        }



    }

}
