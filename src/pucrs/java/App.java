package pucrs.java;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		int vetor[] = new int[20];
		int vetorNormal[] = { 2, 5, 7, 1 };
		int vetorInvertido[] = new int[4];
		int vetorOcorrencia[] = { 1, 2, 3, 4, 1 };
		int vetorRepetido[] = { 1, 2, 3, 4, 2};
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

		System.out.println("Numero Repetido: " + hasRepeat(vetorRepetido));

		System.out.println("Numero Repetido: " + nroRepeat(vetorRepetido));
		
		System.out.print("Lista de valores repetidos: ");
		int[] vetorAux = listRepeat(vetorRepetido);
		
		for(int i = 0; i < vetorAux.length; i++) {
			System.out.print(vetorAux[i] + " ");
		}
	}

	//a)
	public static int nOcorrencias(int[] vetor, Integer el) {
		int count = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == el) {
				count++;
			}
		}

		return count;
	}

	//b)
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

	//c)
	public static int nroRepeat(int[] vetor) {
		int valor, valorRepetido;
		int count = 0;
		boolean aux = false;

		for (int i = 0; i < vetor.length; i++) {
			valor = vetor[i];
			for (int j = 0; j < vetor.length; j++) {
				valorRepetido = vetor[j];
				if (i != j) {
					if (valor == valorRepetido) {
						aux = true;
						count++;
					}
				}
			}
			if (aux == true) {
				count++;
				break;
			}
		}
		return count;
	}
	
	//d)
	public static int[] listRepeat(int[] vetor) {
		int valor,valorRepetido;
		List<Integer> lista = new ArrayList<Integer>();
		int[] vetorRepetido;

		for(int i = 0; i < vetor.length; i++) {
			valor = vetor[i];
			for (int j = 0; j < vetor.length; j++) {
				valorRepetido = vetor[j];
				if (i != j) {
					if (valor == valorRepetido) {
						lista.add(valorRepetido);
					}
				}
			}
		}
		vetorRepetido = new int[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			vetorRepetido[i] = lista.get(i);
		}
		
		return vetorRepetido;
	}
	
	//e) Método que retorna a união dos vetores
	public static int[] union(int[] vetor1, int[] vetor2) {
		int[] vetorUnion = new int[20];
		
		return vetorUnion;
	}
	
	//f) Metodo que retorna a intersecção dos vetores
	public static int[] interserct(int[] vetor1, int[] vetor2) {
		int[] vetorInterserct = new int[20];
		
		return vetorInterserct;
	}
	
	//g) Método que retorna a diferença entre os vetores
	public static int[] difference(int[] vetor1, int[] vetor2) {
		int[] vetorDifference = new int[20];
		
		return vetorDifference;
	}

}
