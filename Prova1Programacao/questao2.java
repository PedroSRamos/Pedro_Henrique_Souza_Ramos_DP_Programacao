package br.edu.univas.main;
import java.util.Scanner;
import java.util.ArrayList;

public class questao2 {
	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
			ArrayList<String> notes = new ArrayList<>();
			int i = 0;
			while (true) {
				System.out.println("Digite a nota");
				i = sc.nextInt();
				if (i == 0)
					break;
				notes.add(whoNote(i));
				i++;
			}
			for (int j = 0; j < notes.size(); j++) {
				System.out.println(notes.get(j));
			}
		}
	}

	public static String whoNote(int numero) {
		if (numero == 1)
			return "dó";
		else if (numero == 2)
			return "ré";
		else if (numero == 3)
			return "mi";
		else if (numero == 4)
			return "fa";
		else if (numero == 5)
			return "sol";
		else if (numero == 6)
			return "lá";
		else if (numero == 7)
			return "si";
		else
			return "";
	}
}
