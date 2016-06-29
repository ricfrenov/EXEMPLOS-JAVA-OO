/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buzu_sub_2013;

/**
 *
 * @author marcelo
 */
import javax.swing.*;
public class Convencional extends Onibus {

    int valorPass;
    int quantLugares;

    public Convencional(String m, String o, String d, int v, int q) {
        super(m, o, d);
        valorPass = v;
        quantLugares = q;

    }

    public void verificar_Lugar() {
        System.out.println("Assentos disponiveis: " + quantLugares);
    }

    public void comprarAssento() {
        verificar_Lugar();

        if (quantLugares > 0) {
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Informe Quantidade"));
            if (quant > quantLugares) {
                System.out.println("Quantidade maior que Assentos disponiveis");
                verificar_Lugar();
            } else {
                System.out.println("Compra realizada");
                quantLugares = quantLugares - quant;

            }


        } else {
            System.out.println("Não tem Assentos disponiveis");

        }

    }
}
