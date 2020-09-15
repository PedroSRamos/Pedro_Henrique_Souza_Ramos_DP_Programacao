package univas.edu.br;

public class questao1 {
	public static void main(String[] args) {
		
	}
	public int[] parse(int[] notas) {
		int loopcount = 0;
		int [] array = new int [20];
				for(int i = 0; i <20; i++) {
					if(i % 2==0) {
						array[i] = notas[loopcount];
					} else {
						if(array[i-1] > 60) {
							array[i] =1;
						}else {
							array[i] = 0;
						}
						loopcount++;
					}
				}
				return array;
	}
}
