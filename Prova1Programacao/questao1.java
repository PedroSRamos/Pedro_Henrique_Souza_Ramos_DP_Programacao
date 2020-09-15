package br.edu.univas.main;
import java.util.Scanner;

public class questao1 {
	    private static Scanner sc;

		public static void main(String[] args) {
	        sc = new Scanner(System.in);
	        int[] moradorA = new int[12];
	        int[] moradorB = new int[12];
	        int maiorA = 0, menorA = 9999, mediaA = 0;
	        int maiorB = 0, menorB = 9999, mediaB = 0;

	        System.out.println("informação do morador a");
	        for (int i = 0; i < 12; i++) {
	            System.out.println("digite valor dos mes: " + (i + 1));
	            moradorA[i] = sc.nextInt();
	            if (moradorA[i] > maiorA) {
	                maiorA = moradorA[i];
	            }
	            if (moradorA[i] < menorA) {
	                menorA = moradorA[i];
	            }
	            mediaA += moradorA[i];
	        }
	        System.out.println("Menor: " + menorA);
	        System.out.println("Maior: " + maiorA);
	        System.out.println("Média: " + (mediaA / 12));

	    System.out.println("informação do morador B");
	    for (int i = 0; i < 12; i++) {
	        System.out.println("digite valor dos mes: " + (i + 1));
	        moradorB[i] = sc.nextInt();
	        if (moradorB[i] > maiorB) {
	            maiorB = moradorB[i];
	        }
	        if (moradorB[i] < menorB) {
	            menorB = moradorB[i];
	        }
	        mediaB += moradorB[i];
	    }
	    System.out.println("Menor: " + menorB);
	    System.out.println("Maior: " + maiorB);
	    System.out.println("Média: " + (mediaB / 12));
	}
}
