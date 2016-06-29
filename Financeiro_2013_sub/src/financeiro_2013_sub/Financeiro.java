package financeiro_2013_sub;

public class Financeiro {

    double valor;
    private double result;
    
    public double recebeValor(double valor) {
        this.valor = valor;
        return acrescenteJuros();
    }
    private double acrescenteJuros() {
       double porc = 10.0 / 100.0;
        result = valor + (valor * porc);
        return result;
    }
    public double pegueJuros() {
        return acrescenteJuros();
    }
}
