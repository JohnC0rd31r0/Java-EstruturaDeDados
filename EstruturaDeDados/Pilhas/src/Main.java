
public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push(new No("Carlos"));
		pilha.push(new No("Joao"));
		pilha.push(new No("Flavio"));
		pilha.push(new No("Paulo"));
		pilha.push(new No("Lucas"));
		pilha.push(new No("Mateus"));
		pilha.imprimirPilha();
	}

}
