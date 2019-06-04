package pucrs.java;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		int vetor[] = new int[20];	
		int vetorNormal[] = {2,5,7,1};
		int vetorInvertido[] = new int[4];
		int aux = vetorNormal.length-1;
		
		System.out.println("Arranjo de 20 posições");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i*10;
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < vetorNormal.length; i++) {
			vetorInvertido[i] = vetorNormal[aux--];
			System.out.print(vetorInvertido[i] + " ");
		}
	}

}
