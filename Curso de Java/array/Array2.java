package array;

/**
 * Array Multidimensional (Matriz)
 * 
 * @author Professor Professor Jose de Assis
 * 
 */
public class Array2 {

	public static void main(String[] args) {
		// [][] linhas|colunas
		String[][] agenda = { { "Bill Gates", "22222-2222", "bill@email.com" },
				{ "José de Assis", "29999-9999", "ze@email.com" },
				{ "Linus Torvalds", "98989-1234", "linus@email.com" } };
		// recuperando o E-mail do Bill Gates
		// System.out.println(agenda[0][2]);
		// recuperando a agenda completa
		System.out.println("================================");
		System.out.println("====== Agenda de contatos ======");
		System.out.println("================================");
		System.out.println("");
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("______________________________");
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
	}
}
