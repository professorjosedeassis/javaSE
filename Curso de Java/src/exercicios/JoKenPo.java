package exercicios;

import java.util.Scanner;

/**
 * Exercicio
 * 
 * @author Professor Jose de Assis
 *
 */
public class JoKenPo {

	public static void main(String[] args) {
		int jogador, computador;
		// variaveis usadas para criar um score e "melhor de 3"
		int scoreJogador = 0;
		int scoreComputador = 0;
		int rodada = 1;
		Scanner leia = new Scanner(System.in);
		System.out.println("    __     _____         _____  ");
		System.out.println(" __|  |___|  |  |___ ___|  _  |___ _ _ _ ");
		System.out.println("|  |  | . |    -| -_|   |   __| . | | | |");
		System.out.println("|_____|___|__|__|___|_|_|__|  |___|_____|");
		System.out.println("");
		// uso da estrutura while para "fazer" um melhor de 3
		while (rodada < 4) {
			System.out.println("Rodada: " + rodada);
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.print("Digite a opção desejada: ");
			jogador = leia.nextInt();
			System.out.println("");
			// logica do jogador
			switch (jogador) {
			case 1:
				System.out.println("Jogador escolheu: Pedra");
				break;
			case 2:
				System.out.println("Jogador escolheu: Papel");
				break;
			case 3:
				System.out.println("Jogador escolheu: Tesoura");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			// logica do computador
			computador = (int) (Math.random() * 3 + 1);
			switch (computador) {
			case 1:
				System.out.println("Computador escolheu: Pedra");
				break;
			case 2:
				System.out.println("Computador escolheu: Papel");
				break;
			case 3:
				System.out.println("Computador escolheu: Tesoura");
				break;
			}
			// logica para determinar o vencedor
			if (jogador == computador) {
				System.out.println("EMPATE");
			} else {
				if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
						|| (jogador == 3 && computador == 2)) {
					System.out.println("JOGADOR VENCEU");
					scoreJogador = scoreJogador + 1;
				} else {
					System.out.println("COMPUTADOR VENCEU");
					scoreComputador = scoreComputador + 1;
				}
			}
			// placar
			System.out.println("");
			System.out.println("--------------------------");
			System.out.println("         PLACAR");
			System.out.println("--------------------------");
			System.out.println(" Jogador " + scoreJogador + " x Computador " + scoreComputador);
			System.out.println("--------------------------");
			System.out.println("");
			rodada = rodada + 1;
		}
		leia.close();
	}
}