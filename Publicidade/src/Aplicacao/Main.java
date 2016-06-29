package Aplicacao;

import javax.swing.*;

import publicidade.*;

public class Main {

    public static void main(String[] args) {

        publicidade obj = new publicidade();

        String opcao = JOptionPane.showInputDialog("O que você deseja fazer?\n V: Votar;\n"
              + "C: Ver quantidade de votos contra;\nP: Ver % de homens contra;\nF: Fim");
        while (!"fim".equalsIgnoreCase(opcao) == true) {
            if ("V".equalsIgnoreCase(opcao) == true) {
                for (int i = 0; i < 4; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            String valor = JOptionPane.showInputDialog("Informe sexo");
                            String v = obj.alimentaMatriz(i, j, valor);
                            System.out.print(" " + v);
                        } else {
                            String valor = JOptionPane.showInputDialog("Informe voto 1: contra;\n2: afavor;\n3: indeciso");
                            String v = obj.alimentaMatriz(i, j, valor);
                            System.out.print(" " + v);
                        }
                    }
                }
                System.out.println(" ");
            } else {
                if ("C".equalsIgnoreCase(opcao) == true) {
                    int result = obj.pegueCont();
                    if (result == 0) {
                        System.out.println("Não Tivemos Votos Contra!");
                    } else {
                        System.out.println("Numero de pessoas contra: " + result);
                    }
                } else {
                    if ("P".equalsIgnoreCase(opcao) == true) {
                        double porc = obj.porcAfavor();
                        if (porc == 0) {
                            System.out.println(" Não tiveram votos a favor por parte de um Homem! ");
                        } else {
                            System.out.println("Porcentagem: " + porc);
                        }
                    }
                }
            }
            opcao = JOptionPane.showInputDialog("O que você deseja fazer?\n V: Votar;\nC: Ver quantidade de votos contra;\nP: Ver % de homens contra;\nF: Fim");
            if ("v".equalsIgnoreCase(opcao) == true) {

                    }
                }
            }
        }

    //VER COMO LIMPAR O VETOR PARA FAZER UMA NOVA CONSULTA//

