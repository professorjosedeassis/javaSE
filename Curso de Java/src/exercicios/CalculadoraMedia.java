package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Exercicio
 * 
 * @author Professor Jose de Assis
 *
 */
public class CalculadoraMedia {
	public static void main(String[] args) {
		// variaveis
		String nome;
		double nota1, nota2, media;
		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada
		System.out.println("======================");
		System.out.println("== Cálculo da média ==");
		System.out.println("======================");
		System.out.println("");
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a nota1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextDouble();
		// processamento
		media = (nota1 + nota2) / 2;
		// saida
		System.out.println("-------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + formatador.format(media));
		// estrutura de controle condicional
		if (media < 2) {
			System.out.println("REPROVADO");
		} else if (media >= 5) {
			System.out.println("APROVADO");
		} else {
			System.out.println("RECUPERAÇÃO");
		}
		teclado.close();
	}
}
