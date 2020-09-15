package br.edu.univas.main;
import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario[] = new float[150];
		float pagamentoA = 0;
		float pagamentoB;
		
		System.out.println("Leitura dos 150 salários: ");
		for (int i = 0; i < 150; i++) {
			salario[i] = sc.nextFloat();
			pagamentoA = pagamentoA + salario[i];
		}
		pagamentoB = pagamentoA * 1.15f;
		sc.close();
		System.out.println("total antes do aumento: " + pagamentoA);
		System.out.println("aumento de 15%: " + pagamentoB);
	}
}
