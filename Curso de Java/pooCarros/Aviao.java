package pooCarros;

public class Aviao extends Carro{
	//atributo
	double envergadura;
	//metodo
	void aterrizar() {
		System.out.println("Avião pousou.");
	}
	//polimorfismo (reescrever o metodo acelerar da classe Carro)
	void acelerar() {
		System.out.println("Avião decolou.......");
	}
}
