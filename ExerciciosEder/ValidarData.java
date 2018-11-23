import java.util.Scanner;

public class ValidarData{
	public static void main(String[] args){
		System.out.println("Digite a data no formato dd/mm/aa:")
		Scanner scan = new Scanner(System.in);

		/* Como verificar se a data digitada é uma data válida:

		a) JAN, MAR, MAI, JUL, AGO, OUT e DEZ podem possuir no máximo 31 dias.

		B) ABR, JUN, SET e NOV podem possuir no máximo 30 dias.

		c) FEV pode possuir no máximo 29 dias se o ano for bissexto, ou seja,
		   se o resto da divisão do ano por 4 for igual a zero.

		d) FEV pode possuir no máximo 28 dias se o ano não for bissexto.

		e) A quantidade de meses deve ser maior ou igual a 12.

		*/
	}
}