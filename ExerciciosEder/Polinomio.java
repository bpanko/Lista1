/**
 * class: Polinômio
 */
public class Polinomio {
    // array de double para armazenar os coeficientes do polinomio
    private int grau; 
    private double [] c;

    public Polinomio() {
        grau = 0;
        c = null;
    }

    public Polinomio(int grau) {
        this.grau = grau;
        c = new double[grau];
    }

    public Polinomio(double [] v) {
        this(v.length); // chamando o construtor
        setCs(v);
    }

    /**
     * Este método ajusta os coeficientes do polinômio
     * @param i: indice do coeficiente
     * @param valor: valor do coeficiente
     */
    public void setC(int i, double valor) {
        if (i >= 0 && i < grau)
            c[i] = valor;
        else 
            System.out.println("indice invalido: " + i);
    }

    public void setCs(double [] v) {
        if (v.length == c.length) 
            for (int i = 0; i < v.length; i++)
                c[i] = v[i];
        else
            System.out.println("array com quantidade de elentos diferentes" +
                    "do grau do polinômio ");
    }

    /**
     * Método resolver, resolve o polinômio P(x) em x.
     *
     * @param x número para qual o polinômio será resolvido
     * @return o valor do polinômio para o valor dado
     */
    public double resolver(double x) {
        double res = 0;
        for (int i = 0; i < grau; i++)
            res += c[i] * Math.pow(x,i);
        return res;
    }

    public String toString() {
        String ret = "P(x) : ";
        for (int i = grau-1; i > 0; i--)
            ret += c[i]+"x^"+i+" + ";
        ret += c[0];
        return ret;
    }


}
