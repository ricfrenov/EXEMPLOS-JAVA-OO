package publicidade;

public class publicidade {

    String[][] mat = new String[4][2];
    int cont = 0;

    public String alimentaMatriz(int l, int c, String dado) {
        mat[l][c] = dado;
        return mat[l][c];
    }
    private int nContra() {
        for (int i = 0; i < 4; i++) {
            if (mat[i][1].equalsIgnoreCase("1") == true) {
                cont++;
            }
        }
        return cont;
    }
    public int pegueCont() {
        return nContra();
    }
    public double porcAfavor() {
        int cont1 = 0;
        for (int i = 0; i < 4; i++) {
            if (mat[i][0].equalsIgnoreCase("m") == true) {
                if (mat[i][1].equalsIgnoreCase("2") == true) {
                    cont1++;
                }
            }
        }
        double porc = (cont1 * 100) / 4;
        double porc2 = 0;
        if(porc==0){
            return porc2;
        }else{
        return porc;
    }
}
}