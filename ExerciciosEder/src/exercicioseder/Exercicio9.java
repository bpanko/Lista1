package exercicioseder;

import java.util.Scanner;

/**
 * @author Beatriz
 */

public class Exercicio9 {
    public static void main(String[] args){
        System.out.println("Digite o raio da circunferencia:");
        Scanner scan = new Scanner(System.in);
        int raio = scan.nextInt();

	System.out.println("Digite a distancia do ponto ao centro da circunferencia:");
	int distancia = scan.nextInt();
               
        /*se a distância < raio o ponto é dentro 
	se a distância = raio o ponto é sobre a circunferencia 
	se a distância > raio o ponto é fora 
        */

	if(distancia < raio){
            System.out.println("O ponto esta dentro da circunferencia.");
	}else if(distancia == raio){
            System.out.println("O ponto esta sobre a circunferencia.");
	}else{
            System.out.println("O ponto esta fora da circunferencia.");
	}      
    }
}
