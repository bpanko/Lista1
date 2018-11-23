package exercicioseder;

import java.util.Scanner;

/**
 * @author Beatriz
 */

public class Exercicio4_5_6 {
    public static void main(String[] args) {
        System.out.println("Digite o valor da primeira prova:");
        Scanner scan = new Scanner(System.in);
        float p1 = scan.nextFloat();
        
        System.out.println("Digite o valor da segunda prova:");
        float p2 = scan.nextFloat();
        
        System.out.println("Digite o valor da terceira prova:");
        float p3 = scan.nextFloat();
        
        System.out.println("Agora digite a frêquencia(já em %):");
        float frequencia = scan.nextFloat();
        
        float media = (p1 + p2 + p3) /3;
        System.out.println("A média é: " + media);
        if(media >= 7){
            if(frequencia >= 75){
            System.out.println("O aluno está aprovado! :)");
            }else{
                System.out.println("O aluno está reprovado! :(");
            }
        }else{
            System.out.println("O aluno está reprovado! :(");
        }
    }
}
