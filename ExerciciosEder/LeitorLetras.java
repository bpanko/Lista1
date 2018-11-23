import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorLetras{
	public static void main(String[] args){
		LeitorLetras ll = new LeitorLetras();
		ll.percorrerArquivo(args[0]);
	}

	public void percorrerArquivo(String nomeArquivo){

		try{
			BufferedReader entrada = new BufferedReader(new FileReader(nomeArquivo));
			String linha = entrada.readLine();

			while (linha != null) {
				for(int i = 0; i < linha.length(); i++){
					System.out.print(linha.charAt(i));
				}
				linha = entrada.readLine();
			}
		} 	
			
		catch(Exception e){
			System.out.println(e);
		}
	}
}