package pucrs.java;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		int vetor[] = new int[20];
		int vetorNormal[] = { 2, 5, 7, 1 };
		int vetorInvertido[] = new int[4];
		int vetorOcorrencia[] = { 1, 2, 3, 4, 1 };
		int vetorRepetido[] = { 1, 2, 3, 4, 2 };
		int vetorUnion[] = { 1, 2, 3, 4 };
		int vetorUnion2[] = { 1, 4, 5, 6 };
		int interserct1[] = { 1, 2, 3, 4, 8, 9};
		int interserct2[] = { 1, 2, 5, 6, 8};
		int difference1[] = { 1, 2, 3, 4, 8, 9};
		int difference2[] = { 1, 2, 5, 6, 8};
		int aux = vetorNormal.length - 1;

		System.out.print("Arranjo de 20 posições: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 10;
			System.out.print(vetor[i] + " ");
		}

		System.out.println("");
		System.out.print("Arranjo Invertido: ");
		for (int i = 0; i < vetorNormal.length; i++) {
			vetorInvertido[i] = vetorNormal[aux--];
			System.out.print(vetorInvertido[i] + " ");
		}

		System.out.println("");

		System.out.println("Numero Ocorrencias: " + nOcorrencias(vetorOcorrencia, 1));

		System.out.println("Tem Repetido: " + hasRepeat(vetorRepetido));

		System.out.println("Numero Repetido: " + nroRepeat(vetorRepetido));

		System.out.print("Lista de valores repetidos: ");
		int[] vetorAux = listRepeat(vetorRepetido);

		for (int i = 0; i < vetorAux.length; i++) {
			System.out.print(vetorAux[i] + " ");
		}

		System.out.println("\nUnião dois vetores: ");
		int[] vetorAux2 = union(vetorUnion, vetorUnion2);
		for (int i = 0; i < vetorAux2.length; i++) {
			System.out.print(vetorAux2[i] + " ");
		}
		
		System.out.println("\nIntersecção de dois vetores: ");
		int[] vetorAux3 = interserct(interserct1,interserct2);
		for (int i = 0; i < vetorAux3.length; i++) {
			System.out.print(vetorAux3[i] + " ");
		}
		
		System.out.println("\nDiferença entre dois vetores: ");
		int[] vetorAux4 = difference(difference1,difference2);
		for (int i = 0; i < vetorAux4.length; i++) {
			System.out.print(vetorAux4[i] + " ");
		}
	}

	// a) Método que retorna quantas ocorrências de um elemento estão na lista
	public static int nOcorrencias(int[] vetor, Integer el) {
		int count = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == el) {
				count++;
			}
		}

		return count;
	}

	// b) Método que retorna true se o vetor tem elementos repetidos
	public static boolean hasRepeat(int[] vetor) {
		int valor, valorRepetido;
		boolean resposta = false;

		for (int i = 0; i < vetor.length; i++) {
			valor = vetor[i];
			for (int j = 0; j < vetor.length; j++) {
				valorRepetido = vetor[j];
				if (i != j) {
					if (valor == valorRepetido) {
						resposta = true;
					}
				}
			}
		}
		return resposta;
	}

	// c) Método que retorna o número de elementos repetidos
	public static int nroRepeat(int[] vetor) {
		int count = 0;	
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = i+1; j < lista.size(); j++) {
				if(lista.get(i) == lista.get(j)) {
					lista.remove(j);
					count++;
				}
				if(j > lista.size()) {
					break;
				}
			}
		}
		return count;
	}

	// d) Método que retorna um vetor dos elementos repetidos
	public static int[] listRepeat(int[] vetor) {
		List<Integer> listaVetor = new ArrayList<>();
		List<Integer> listaRepetidos = new ArrayList<>();
		int[] vetorRepetido;

		for(int i = 0; i < vetor.length; i++) {
			listaVetor.add(vetor[i]);
		}
		
		for (int i = 0; i < listaVetor.size(); i++) {
			for (int j = i+1; j < listaVetor.size(); j++) {
				if(listaVetor.get(i) == listaVetor.get(j)) {
					listaRepetidos.add(listaVetor.get(j));
					listaVetor.remove(j);
				}
				if(j > listaVetor.size()) {
					break;
				}
			}
		}
		vetorRepetido = new int[listaRepetidos.size()];
		for(int i = 0; i < listaRepetidos.size(); i++) {
			vetorRepetido[i] = listaRepetidos.get(i);
		}
		return vetorRepetido;
	}

	// e) Método que retorna a união dos vetores
	public static int[] union(int[] vetor1, int[] vetor2) {
		int[] vetorUnion;
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i < vetor1.length; i++) {
			if(i < vetor1.length) {
				lista.add(vetor1[i]);
			}
			if(i < vetor2.length) {
				lista.add(vetor2[i]);
			}
		}
		

		for (int i = 0; i < lista.size(); i++) {
			for (int j = i+1; j < lista.size(); j++) {
				if(lista.get(i) == lista.get(j)) {
					lista.remove(j);
				}
				if(j > lista.size()) {
					break;
				}
			}
		}		
		vetorUnion = new int[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			vetorUnion[i] = lista.get(i);
		}
				
		return vetorUnion;
	}

	// f) Metodo que retorna a intersecção dos vetores
	// o que existe no vetor1 e também no vetor2
	public static int[] interserct(int[] vetor1, int[] vetor2) {
		int[] vetorInterserct;
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i < vetor1.length; i++) {
			for(int j = 0; j < vetor2.length; j++) {
				if(vetor1[i] == vetor2[j]) {
					lista.add(vetor1[i]);
				}
			}
		}
		vetorInterserct  = new int[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			vetorInterserct[i] = lista.get(i);
		}
		return vetorInterserct;
	}

	// g) Método que retorna a diferença entre os vetores
	//Trabalhando
	public static int[] difference(int[] vetor1, int[] vetor2) {
		int[] vetorDifference = new int[20];
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i < vetor1.length; i++) {
			if(i < vetor1.length) {
				lista.add(vetor1[i]);
			}
			if(i < vetor2.length) {
				lista.add(vetor2[i]);
			}
		}
		
		for(int i = 0; i < lista.size(); i++) {
			for(int j = 0; j < lista.size(); j++) {
				if(lista.get(i) == lista.get(j)) {
					lista.remove(j);
				}
//				if(j > lista.size()) {
//					break;
//				}
			}
		}
		
		vetorDifference  = new int[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			vetorDifference[i] = lista.get(i);
		}
		return vetorDifference;
	}

	
	

}
