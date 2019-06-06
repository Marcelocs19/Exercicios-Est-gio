package pucrs.java;


public class App {

	public static void main(String[] args) {
		
		int vetor[] = new int[20];	
		int vetorNormal[] = {2,5,7,1};
		int vetorInvertido[] = new int[4];
		int vetorOcorrencia[] = {1,2,3,4,1};
		int aux = vetorNormal.length-1;
		
		System.out.print("Arranjo de 20 posições: ");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i*10;
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("");
		System.out.print("Arranjo Invertido: ");
		for(int i = 0; i < vetorNormal.length; i++) {
			vetorInvertido[i] = vetorNormal[aux--];
			System.out.print(vetorInvertido[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("Numero Ocorrencias: " + nOcorrencias(vetorOcorrencia, 1));
	}
	
	public static int nOcorrencias(int[] vetor, Integer el) {
		int count = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == el) {
				count++;
			}
		}
		
		return count;
	}

}
