package ListaDuplamenteEncadeada;


public class ListaDuplaEncadeada<T> {
	No<T> referenciaEntrada;
	No<T> referenciaUltimoNo;

	private int tamanhoLista;
	
	public ListaDuplaEncadeada(){
		this.referenciaEntrada = null;
		this.referenciaUltimoNo = null;
		tamanhoLista = 0;
	}
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null;
	}
	
	public int size() {
		return tamanhoLista;
	}
	
	private No<T> getNo (int index) {
		if(!isEmpty()) {
			if(index>size()+1) {
				throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + "");
			}
			else {	
			No<T> noAux = referenciaEntrada;
			No<T> noRetorno = null;
			for(int i = 0; i<index ;i++) {
				noRetorno = noAux;
				noAux = noAux.getNextNo();
			}
			return noRetorno;
		}}
		
		return null;
	}
	
	public void addNo(T conteudo) {
		  No<T> novoNo = new No<>(conteudo);
		  if(this.isEmpty()) {
			  referenciaEntrada = novoNo;
		  }else {
			  No<T> noAux = referenciaUltimoNo;
			  noAux.setNextNo(novoNo);
			  novoNo.setPreviousNo(noAux);
		  }
		  referenciaUltimoNo = novoNo;
		  tamanhoLista++;
	}
	
	public void addNo(T conteudo, int index) {
		  if(index < size() && index > 0) {
			  No<T> novoNo = new No<>(conteudo);
			  No<T> noAux = getNo(index);
			  if(noAux != referenciaEntrada)
				  noAux.getPreviousNo().setNextNo(novoNo);
			  novoNo.setNextNo(noAux);
			  tamanhoLista++;
		  }else {
			  if(index == size()+1 ) {
				  addNo(conteudo);
			  }else {
			  throw new NullPointerException("O index "+index + " é inválido");}
		  }
	}
	
	public void remove(int index) {
		if(index == 1) {
			referenciaEntrada = referenciaEntrada.getNextNo();
			if(referenciaEntrada != null) {
				referenciaEntrada.setPreviousNo(null);
			}
		}else {
			No<T> noAux = getNo(index);
			noAux.getPreviousNo().setNextNo(noAux.getNextNo());
			if(noAux != referenciaUltimoNo) {
				noAux.getNextNo().setPreviousNo(noAux.getPreviousNo());
			}else {
				noAux = referenciaUltimoNo;
			}
		}
		tamanhoLista--;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		if(!isEmpty()) {
			No<T> noAux = referenciaEntrada;
			for (int i = 0; i < size(); i++) {
				strRetorno += " -> " + noAux.getConteudo();
				noAux = noAux.getNextNo();
			}
		}
		
		
		return strRetorno;
	}
	
	
	
	
}
