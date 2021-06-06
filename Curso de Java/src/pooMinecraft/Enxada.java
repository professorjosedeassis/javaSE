package pooMinecraft;

public class Enxada extends Bloco {
	//atributos
	boolean conquista;
	//metodos
	void arar() {
		System.out.println("Terra preparada para o plantio");
		conquista = true;
	}
	//polimorfismo
	void minerar() {
		System.out.println("Dano atribuído");
	}
}
