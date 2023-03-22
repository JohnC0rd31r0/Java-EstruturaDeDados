import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<gato> meusGatos = new ArrayList<>();
		
		gato g1 = new gato("Jorge", "Preto", 11);
		gato g2 = new gato("Jorge", "Preto", 13);
		gato g3 = new gato("Jorge", "Azul", 14);
		gato g4 = new gato("Jorge", "Azul", 6);
		
		meusGatos.add(g1);
		meusGatos.add(g2);
		meusGatos.add(g3);
		meusGatos.add(g4);
		meusGatos.sort(new CompareNomeCorIdade());
		System.out.println(meusGatos);
	}

}
