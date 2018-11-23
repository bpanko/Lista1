package exercicioseder;

import java.util.Scanner;

/**
 * @author Beatriz
 */
public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Qual a temperatura(Cº)? ");
        Scanner scan = new Scanner(System.in);
        float celsius = scan.nextFloat();
        
            float fahrenheit = 1.8f * celsius + 32;           
            System.out.println("A temperatura é de: " + fahrenheit + "F");
       
    }
    
}
