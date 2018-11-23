/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioseder;

import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
public class Exercicio3 {
    private static float JOptionPane;

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de segundos:");
        Scanner scan = new Scanner(System.in);
        float segundo = scan.nextFloat();
        
        int minuto = (int) (60 * segundo);
        int hora = 60 * minuto;
        int dia = 24 * hora;
        int mes =  30 * dia;
        int ano = 12 * mes;
        float tempo = JOptionPane;
        
        int anos = (int) (tempo / ano);
        tempo = tempo % ano;
        
    }
    
}
