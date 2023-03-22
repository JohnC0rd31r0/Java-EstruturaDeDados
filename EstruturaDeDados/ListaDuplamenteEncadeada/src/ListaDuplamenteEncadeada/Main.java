package ListaDuplamenteEncadeada;


public class Main {

	public static void main(String[] args) {
		ListaDuplaEncadeada<String> lista = new ListaDuplaEncadeada<String>();
		
		lista.addNo("Vaso");
		lista.addNo("Bola");
		lista.addNo("Jornal");		
		lista.addNo("Repolho");
		lista.addNo("Guarfa");
		lista.addNo("as");
		lista.addNo("df");
		lista.remove(1);
		lista.addNo("gf");
		lista.addNo("sd");
		lista.addNo("ds");
		System.out.println(lista);
	}

}
