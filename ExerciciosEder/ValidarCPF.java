import java.util.Scanner;

public class ValidarCPF{
	
	public static void main(String[] args){

		System.out.println("Informe o valor do seu CPF (sem pontos, hifens ou espacos):");
		Scanner scan = new Scanner(System.in);
		String cpf = scan.next();

		/* Para fazer a verificação do primeiro dígito:
		1º Distribua os 9 primeiros dígitos do CPF na primeira linha de uma tabela, e na 
		linha abaixo distribua os pesos 10, 9, 8, 7, 6, 5, 4, 3, 2.

		2º Multiplique os valores de cada coluna.

		3º Calcule a somatória dos resultados.

		4º  O resultado obtido será divido por 11. Considere como quociente apenas o valor 
		inteiro obtido na divisão, o resto da divisão será responsável pelo cálculo do 
		primeiro dígito verificador.

		5º Caso o resto da divisão seja menor que 2, o nosso primeiro dígito verificador 
		se torna 0, caso contrário subtrai-se o valor obtido de 11.  

		*/

		int soma = 0;

		for(int contador = 10; contador > 1; contador--){
			int num = Integer.parseInt(cpf.substring(10 - contador,11 - contador));
			soma += num * contador;
		}

		System.out.println("Soma: " + soma % 11);
			
		soma = soma % 11;
		if(soma < 2){
			soma = 0;
		}else{
			soma = 11 - soma;
		}
			

		if(Integer.parseInt(cpf.substring(9,10)) == soma){
			System.out.println("CPF invalido! :(");
		}else{
			System.out.println("CPF valido!");
		}
			

		/* Para fazer a verificação do segundo dígito:
		1º Para o cálculo do segundo dígito será usado o primeiro dígito verificador já
		calculado. Montaremos uma tabela semelhante a anterior só que desta vez usaremos
		na segunda linha os valores 11,10,9,8,7,6,5,4,3,2 já que estamos incorporando mais
		um algarismo para esse cálculo. 

		2º Na próxima etapa faremos como na situação do cálculo do primeiro dígito verificador,
		multiplicaremos os valores de cada coluna e efetuaremos o somatório dos resultados
		obtidos.

		3º Realizamos novamente o cálculo do módulo 11. Dividimos o total do somatório por 11
		e consideramos o resto da divisão.

		4º  Caso o valor do resto da divisão seja menor que 2, esse valor passa 
		automaticamente a ser zero, caso contrário é necessário subtrair o valor obtido de 11
		para se obter o dígito verificador. 

		*/




		/*
		Último código de Identificação por Estado:      

		Código 0:  Rio Grande do Sul    
		Código 1:  Distrito Federal – Goiás – Mato Grosso – Mato Grosso do Sul – Tocantins    
		Código 2:  Pará – Amazonas – Acre – Amapá – Rondônia – Roraima    
		Código 3:  Ceará – Maranhão – Piauí    
		Código 4:  Pernambuco – Rio Grande do Norte – Paraíba – Alagoas    
		Código 5:  Bahia – Sergipe    
		Código 6:  Minas Gerais    
		Código 7:  Rio de Janeiro – Espírito Santo
		Código 8:  São Paulo
		Código 9:  Paraná – Santa Catarina
		*/
		
	}
}