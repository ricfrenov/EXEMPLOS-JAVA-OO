/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package buzu_sub_2013;

/**
 *
 * @author marcelo
 */
public class Onibus {

    String matricula;
    String origem;
    String destino;

    public Onibus(String m, String o,String d){
        matricula = m;
        origem = o;
        destino = d;

        }

    public void mostreAtrubutos(){
        System.out.println("Onibus: " + matricula + " Sai: " +origem + " chega: "+destino);
    }

}
