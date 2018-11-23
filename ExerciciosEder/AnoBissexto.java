import java.util.Scanner;

public class AnoBissexto{
	
	public static void main(String[] args) {
		System.out.println("Digite o ano desejado: ");
        Scanner scan = new Scanner(System.in);
        int ano = scan.nextInt();

        if(ano % 400 ==0){ 	 
         //valida se o ano é  divisível por 400.
        	}else if (ano % 100 != 0 && ano % 4 == 0){ 
        			//valida se o ano não é divisível por 100 e por 4.
        			System.out.println("O ano " + ano + " eh bissexto!");
        	} else{
        	System.out.println("Sinto muito, o ano " + ano + " nao eh bissexto.");
        }
	}
}