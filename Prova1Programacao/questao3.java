package univas.edu.br;
import java.util.Scanner;

public class questao3 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String test = sc.nextLine();
		
		int tamanho = test.length();
		String Palavra = "";
		char Letra;
		
		for (int i = tamanho; i > 0 ; i--) {
			
			Letra = test.charAt(i-1);
			System.out.println(Letra);
			Palavra = Palavra + Letra;
			
		}	
		sc.close();
	}
}