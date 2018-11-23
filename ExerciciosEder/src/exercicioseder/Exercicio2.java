package exercicioseder;

import java.util.Scanner;

/**
 * @author Beatriz
 */
public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Qual é o raio da circunferência?");
        Scanner scan = new Scanner(System.in);
        float raio = scan.nextFloat();
        float area = (float) (Math.PI*(raio*raio));
        
        System.out.println("Então a área é: " + area);
    }
}
