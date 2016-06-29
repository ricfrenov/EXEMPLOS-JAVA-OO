package classe_cliente;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Cliente obj1 = new Cliente();

        String opcao = JOptionPane.showInputDialog("O que deseja? c:cadastrar,m:mostrar,a:atualizar ou fim");

        while (opcao.equalsIgnoreCase("fim") == false) {
            if (opcao.equalsIgnoreCase("c")) {
                obj1.cadastrarCliente();
            } else {
                if (opcao.equalsIgnoreCase("m")) {
                    obj1.mostrarInformacoes();
                } else {
                    if (opcao.equalsIgnoreCase("a")) {
                        obj1.atualizarEndereco();
                    } else {
                        System.out.println("Opcao Inválida");
                    }
                }
            }
            opcao = JOptionPane.showInputDialog("O que deseja? c:cadastrar,m:mostrar,a:atualizar ou fim");

        }



    }

}
