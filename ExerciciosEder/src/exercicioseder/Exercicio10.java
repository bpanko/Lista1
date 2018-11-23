package exercicioseder;

import java.util.Scanner;

/**
 * @author Beatriz
 */
public class Exercicio10 {
    public static void main(String[] args){
	System.out.println("Digite o primeiro lado: ");
	Scanner scan = new Scanner(System.in);
	float lado1 = scan.nextFloat();

	System.out.println("Digite o segundo lado: ");
	float lado2 = scan.nextFloat();

	System.out.println("Digite o terceiro lado: ");
	float lado3 = scan.nextFloat();


	boolean a = (lado2 - lado3) < lado1,	//propriedades de existência de um triângulo
                b = (lado1 - lado3) < lado2, 
		c = (lado1 - lado2) < lado3,
		d = (lado2 + lado3) > lado1,
		e = (lado1 + lado3) > lado2,
		f = (lado1 + lado2) > lado3;

		if((a == d)&&(b == e)&&(c == f)){ 	//valida as propriedades
                    System.out.println("Essa forma geometrica é um triangulo! :)");
		}else
                    System.out.println("Essa forma geometrica nao é um triangulo! :(");
	}	
}
