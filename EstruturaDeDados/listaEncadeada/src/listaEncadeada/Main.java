package listaEncadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaLista = new ListaEncadeada<String>();
		
		
		minhaLista.addNo("1");
		minhaLista.addNo("2");
		minhaLista.addNo("3");
		minhaLista.addNo("4");
		
		minhaLista.remove(2);

		
		System.out.println(minhaLista);
	}

}
