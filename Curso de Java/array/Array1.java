package array;

/**
 * Array simples (Vetor)
 * 
 * @author Professor Jose de Assis
 * 
 */
public class Array1 {

	public static void main(String[] args) {
		String[] nomes = { "Bill", "José", "Bruce", "Frank" };
		// indice [0] [1] [2] [3]
		// tamanho do array
		System.out.println("Tamanho do array: " + nomes.length);
		// recuperando um conteudo do array
		System.out.println("Nome: " + nomes[1]);
		System.out.println("--------------------");
		System.out.println("Nomes:");
		System.out.println("");
		// percorrendo o array com o laço for
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
