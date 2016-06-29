package carro_20131_sub;
public class Main {
    public static void main(String[] args) {

        Carro obj = new Carro();
        obj.modelo = " Corsa";
        obj.cor = "Preto";
        obj.anoFab = 2010;

        obj.verificarInformacoes();
        obj.ligueCarro();

        Carro obj2 = new Carro();

        obj2.modelo = "palio";
        obj2.cor = "Prata";
        obj2.anoFab = 2012;
        
        obj2.verificarInformacoes();
        obj2.ligueCarro();


    }

}
