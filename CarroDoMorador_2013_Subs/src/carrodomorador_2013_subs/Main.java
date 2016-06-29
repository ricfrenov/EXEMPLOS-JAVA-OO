package carrodomorador_2013_subs;
import java.util.Vector;
import javax.swing.*;
import Carro.*;
import Morador.*;
public class Main {

    public static void main(String[] args) {

        Vector<Carro> vetCar = new Vector<Carro>();
        Vector<Morador> vetMor = new Vector<Morador>();
        
        String cpfDono;
        String modelo = null;
        String cor;
        int anoFab;
        
        String opcao = JOptionPane.showInputDialog("O que você deseja fazer?\nAdicionar Carro: C1 // C2 // C3\n"
                                                  +"Adicionar Morador : M1 // M2\nVer dono do carro: D\n FIM: fim");
        while(opcao.equalsIgnoreCase("fim")==false){
        if(opcao.equalsIgnoreCase("C")==true){
            
        cpfDono=JOptionPane.showInputDialog("Digite o CPF do Dono:");
        modelo=JOptionPane.showInputDialog("Digite o modelo");
        cor=JOptionPane.showInputDialog("digite a cor");
        anoFab= Integer.parseInt(JOptionPane.showInputDialog("Digite Ano de Fabricação"));
        
        Carro c1 = new Carro(cpfDono,modelo,cor,anoFab);
        vetCar.add(c1);
        }else{
        
        if(opcao.equalsIgnoreCase("C1")==true){
        cpfDono=JOptionPane.showInputDialog("Digite o CPF do Dono:");
        modelo=JOptionPane.showInputDialog("Digite o modelo");
        cor=JOptionPane.showInputDialog("digite a cor");
        anoFab= Integer.parseInt(JOptionPane.showInputDialog("Digite Ano de Fabricação"));
                
        Carro c2 = new Carro(cpfDono,modelo,cor,anoFab);
        vetCar.add(c2);
        }else{
        
        if(opcao.equalsIgnoreCase("C2")==true){
        cpfDono=JOptionPane.showInputDialog("Digite o CPF do Dono:");
        modelo=JOptionPane.showInputDialog("Digite o modelo");
        cor=JOptionPane.showInputDialog("digite a cor");
        anoFab= Integer.parseInt(JOptionPane.showInputDialog("Digite Ano de Fabricação"));
                
        Carro c3 = new Carro(cpfDono,modelo,cor,anoFab);
        vetCar.add(c3);
        }else{
        
        if(opcao.equalsIgnoreCase("M")==true){
       
        String cpf=JOptionPane.showInputDialog("Digite o CPF:");
        String nome=JOptionPane.showInputDialog("Digite o Nome:");
        String sobrenome=JOptionPane.showInputDialog("Digite Sobrenome");
        String apart=JOptionPane.showInputDialog("Digite número do apartamento");
        String telefone=JOptionPane.showInputDialog("Digite o telefone:");
        int anoChegada=Integer.parseInt(JOptionPane.showInputDialog("Digite ano de Chegada"));

        Morador m1 = new Morador(cpf,nome,sobrenome,apart,telefone,anoChegada);
        vetMor.add(m1);

        }else{
        if(opcao.equalsIgnoreCase("M")==true){  
        
        String cpf=JOptionPane.showInputDialog("Digite o CPF:");
        String nome=JOptionPane.showInputDialog("Digite o Nome:");
        String sobrenome=JOptionPane.showInputDialog("Digite Sobrenome");
        String apart=JOptionPane.showInputDialog("Digite número do apartamento");
        String telefone=JOptionPane.showInputDialog("Digite o telefone:");
        int anoChegada=Integer.parseInt(JOptionPane.showInputDialog("Digite ano de Chegada"));

        Morador m2 = new Morador(cpf,nome,sobrenome,apart,telefone,anoChegada);
        vetMor.add(m2);
        }else{
        if(opcao.equalsIgnoreCase("D")==true){
        int x = vetCar.size();
        System.out.println("Tamanho vetor carro: " + x);
        int y = vetMor.size();
        System.out.println("Tamanho vetor morador: " + y);
        
        String modelo2=JOptionPane.showInputDialog("Digite o Modelo do Carro que você deseja saber o dono:");
        if(modelo2.equalsIgnoreCase(modelo)){
        for(int i = 0;i < x;i++){
        Carro auxCar = vetCar.get(i);

        for(int j = 0; j < y; j++){
        Morador auxMor = vetMor.get(j);
        if(auxCar.modelo.equalsIgnoreCase(auxCar.modelo) && auxCar.cpfDono.equalsIgnoreCase(auxMor.cpf)){
        auxMor.informeNomeCompleto();
        }
      }
    }
  }
}
  }
    }
      }
        }
      }
        opcao = JOptionPane.showInputDialog("O que você deseja fazer?\nAdicionar Carro: C1 // C2 // C3\nAdicionar Morador : M1 // M2\nVer dono do carro: D\n FIM: fim");
    }
  }
}
