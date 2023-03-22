import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class gato{
		private String nome;
		private String cor;
		private int idade;
		
		public String getNome() {
			return nome;
		}

		public String getCor() {
			return cor;
		}

		public int getIdade() {
			return idade;
		}

		public gato(String nome, String cor, int idade) {
			this.nome = nome;
			this.cor = cor;
			this.idade = idade;
		}

		@Override
		public String toString() {
			return "[nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
		}

}

class CompareNome implements Comparator<gato>{
	@Override
	public int compare(gato o1, gato o2) {
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}
}

class CompareCor implements Comparator<gato>{
	@Override
	public int compare(gato o1, gato o2) {
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}
}

class CompareIdade implements Comparator<gato>{
	@Override
	public int compare(gato o1, gato o2) {
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
}

class CompareNomeCorIdade implements Comparator<gato>{
	@Override
	public int compare(gato o1, gato o2) {
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		if(nome != 0) return nome;
		int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
		if(cor != 0) return cor;
		int idade = Integer.compare(o1.getIdade(), o2.getIdade());
		if(idade != 0) return idade;
		
		return 0;
	}
	
	
}




