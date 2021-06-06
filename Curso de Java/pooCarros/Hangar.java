package pooCarros;

public class Hangar {

	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		System.out.println("Avião: Boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
	}

}
