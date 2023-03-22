package Fila;

public class Main {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<>();
		
		fila.push("Conteudo 1");
		fila.push("Conteudo 2");
		fila.push("Conteudo 3");
		fila.push("Façse");

		fila.imprimirFila();
	}

}
