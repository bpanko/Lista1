public class PolinomioGrau2 extends Polinomio {
    
    public PolinomioGrau2(double a, double b, double c) {
       super(3);
       setC(0, c);
       setC(1, b);
       setC(2, a);
    }

}
