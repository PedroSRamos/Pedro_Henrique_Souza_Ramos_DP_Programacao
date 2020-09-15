package univas.edu.br;
import java.util.Scanner;

public class questao2 {
	static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
		 System.out.println("Digite as 10 notas dos alunos: ");
			Object nota = null;
			lerNotas(nota);
		 
		 	String s = "TEXTO";
	        String invertida = ""; 
	        for (int i = s.length()-1; i >= 0; i--) 
	        {invertida += s.charAt(i);} 
	        System.out.println(invertida);


	 }
	private static void lerNotas(Object nota) {

	}

}
