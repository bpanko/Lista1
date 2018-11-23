package exercicioseder;

import java.util.Scanner;

/**
 * @author Beatriz
 */
public class Exercicio7 {
    
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner scan = new Scanner(System.in);
        float numero = scan.nextFloat();
        
        float porcentagem = numero * 1.15f;
        System.out.println("Com acrésimo de 15%: " + porcentagem);
    }
    
}
