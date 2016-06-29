package classe_cliente;
import javax.swing.*;
public class Cliente {

    String cpf;
    String nome;
    String end;
    int idade;


    public void cadastrarCliente(){
        cpf = JOptionPane.showInputDialog("Informe CPF");
        nome = JOptionPane.showInputDialog("Informe nome");
        end = JOptionPane.showInputDialog("Informe end");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade"));
    }

    public void mostrarInformacoes(){
        System.out.println("Cliente: " + nome + " " + cpf + " " + end + " " + idade);
    }

    public void atualizarEndereco(){

        end = JOptionPane.showInputDialog("Informe novo endereco");
        System.out.println("Cliente: " + nome + " " + cpf + " " + end + " " + idade);
    }


}
