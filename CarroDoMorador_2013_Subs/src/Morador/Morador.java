/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Morador;

/**
 *
 * @author marcelo
 */
import javax.swing.*;
public class Morador {

    public String cpf;
    public String nome;
    public String sobrenome;
    public String apart;
    public String telefone;
    public int anoChegada;


    public Morador(String cpf,String n,String s, String ap, String t, int a){
        this.cpf = cpf;
        nome = n;
        sobrenome = s;
        apart = ap;
        telefone = t;
        anoChegada = a;
    }

    public void informeNomeCompleto(){
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
    }

     public void telefone(){
        System.out.println("Tel: " + telefone);
    }

     public void permanencia(){
         int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe Ano"));
         int permanencia = anoAtual - anoChegada;
         System.out.println("Permanencia: "+ permanencia);

     }

}
