package pooMinecraft;

public class Itens {

	public static void main(String[] args) {
		Enxada enxada = new Enxada();
		enxada.conquista = false;
		System.out.println("Item: Enxada");
		enxada.minerar();
		enxada.arar();
		if (enxada.conquista == true) {
			System.out.println("---------------------------------");
			System.out.println("Conquista obtida!");
			System.out.println("Dedicação séria. Hora do plantio.");
			System.out.println("---------------------------------");
		}
	}
}