public class PolinomioPrincipal {
    public static void main(String [] args) {
        // p armazenará uma instancia de um objeto Polinomio
        Polinomio p = new Polinomio(2);
        p.setC(0, 0);
        p.setC(1, 1);
        p.setC(3, 1);
        double [] v = {1, 4, 3, 0, 1, 5};
        Polinomio q = new Polinomio(v);
        System.out.println(q);
        System.out.println(q.resolver(2));

        PolinomioGrau2 p2 = new PolinomioGrau2(1, 2, 3);
        System.out.println(p2);
        System.out.println(p2.resolver(2));
    }
}
