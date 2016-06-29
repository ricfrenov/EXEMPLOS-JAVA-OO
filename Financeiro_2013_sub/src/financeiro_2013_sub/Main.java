package financeiro_2013_sub;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Financeiro obj = new Financeiro();
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe Valor da venda"));
        
        obj.recebeValor(valor);
        
        double result = obj.pegueJuros();
        
        System.out.println("Venda total: " + result);
    }
}
