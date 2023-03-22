package one.digitalInovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Carro> listaCarro = new ArrayList<>();
		listaCarro.add(new Carro("Honda Civic","Do John"));
		listaCarro.add(new Carro("Ford","Ka"));
		listaCarro.add(new Carro("Monza", "M"));
		

		Carro carro1 = new Carro("Jota","Ka");
		Carro carro2 = new Carro("Ford","Ka");
		

		System.out.println(carro1.equals(carro2));

		
	}
	
	

}
