package pooMinecraft;

/**
 * POO - Exemplo 1 (abstracao, herança e polimorfismo)
 * 
 * @author Professor Jose de Assis
 *
 */
public class Bloco {
	//atributos
	int resistencia;
	String textura;
	
	//construtores
	public Bloco() {
		System.out.println("================================");
	}
	
	//metodos
	void construir() {
		System.out.println("Bloco colocado");
	}
	void minerar() {
		System.out.println("Recursos obtidos");
	}
	void craftar() {
		System.out.println("Item criado");
	}
}
