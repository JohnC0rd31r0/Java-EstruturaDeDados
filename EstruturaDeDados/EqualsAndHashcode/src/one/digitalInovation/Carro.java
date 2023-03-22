package one.digitalInovation;

import java.util.Objects;

public class Carro {
	private String marca;
	private String modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro carro = (Carro) obj;
		return Objects.equals(marca, carro.marca);
	}

	public Carro(String marca,String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	
	
}
