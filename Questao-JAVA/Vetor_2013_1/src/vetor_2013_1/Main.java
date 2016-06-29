/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor_2013_1;

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


        //questão 5
        /*
        int[] v = new int[4];
        int[] w = new int[4];
        int[] r = new int[4];

        System.out.println(" Informe valores de V");

        for (int i = 0; i < 4; i++) {

        String valor = JOptionPane.showInputDialog("Informe Valor para V");
        int va = Integer.parseInt(valor);
        v[i] = va;
        System.out.println(" " + v[i]);



        }

        System.out.println(" Informe valores de W");

        for (int i = 0; i < 4; i++) {

        String valor = JOptionPane.showInputDialog("Informe Valor para W");
        int va = Integer.parseInt(valor);
        w[i] = va;
        System.out.println(" " + w[i]);


        }
        System.out.println(" Vetor R");

        int soma = 0, cont = 0;
        for (int i = 0; i < 4; i++) {

        r[i] = v[i] + w[i];
        System.out.println(" " + r[i]);

        if (r[i] > 25) {
        soma = soma + r[i];
        cont++;
        }


        }


        if (cont == 0) {
        System.out.println("nenhum elemento maior que 25");
        } else {
        double media = soma / cont;

        System.out.println(" Media dos Elementos: " + media);
        }
         */

        //questão 6

        String[] lp = new String[4];
        String[] bd = new String[3];

        System.out.println(" Alunos LP");
        for (int i = 0; i < 4; i++) {

            lp[i] = JOptionPane.showInputDialog("Informe Aluno");
            System.out.println(" " + lp[i]);

        }
        System.out.println(" Alunos bd");
        for (int i = 0; i < 3; i++) {

            bd[i] = JOptionPane.showInputDialog("Informe Aluno");
            System.out.println(" " + bd[i]);

        }

        int cont = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                if (lp[i].equals(bd[j]) == true) {
                    System.out.println("Aluno: " + lp[i] + " cursa as duas Disciplinas");
                    cont = 1;
                }

            }
        }

        if(cont == 0){
            System.out.println("nenhum elemento cursa as duas");
        }











    }
}
