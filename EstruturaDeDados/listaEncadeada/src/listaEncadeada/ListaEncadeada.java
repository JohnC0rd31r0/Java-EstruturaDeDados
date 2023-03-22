package listaEncadeada;

public class ListaEncadeada<T> {
	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	public boolean isEmpty() {
		return referenciaEntrada==null;
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getNextNo() != null) {
					referenciaAux = referenciaAux.getNextNo();
				}else {
					break;
				}
			}else {
				break;
			}
			
		}
		return tamanhoLista;
	}
	
	public void addNo(T conteudo) {
		  No<T> novoNo = new No<>(conteudo);
		  if(this.isEmpty()) {
			  referenciaEntrada = novoNo;
			  return;
		  }
		  No<T> noAux = referenciaEntrada;
		  for(int i = 0; i < this.size()-1; i++) {
			  noAux = noAux.getNextNo();
		  }
		  noAux.setNextNo(novoNo);
	}
	
	private No<T> getNo(int index){
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + "");
		}else {
			No<T> noAux = referenciaEntrada;
			No<T> noRetorno = null;
			for(int i = 0; i <= index; i++) {
				noRetorno = noAux;
				noAux = noAux.getNextNo();
			}
			return noRetorno;
		}
	}
	
	public T get(int index){
		return getNo(index).getConteudo();
	}
	
	public T remove(int index) {
		No<T> noPivo = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noPivo.getNextNo();
			return noPivo.getConteudo();
		}
		No<T> noAnterior = getNo(index-1);
		noAnterior.setNextNo(noPivo.getNextNo());
		return noPivo.getConteudo();
	}

	@Override
	public String toString() {
		String strRetorno ="";
		No<T> noAux = referenciaEntrada;
		for(int i =0; i < this.size();i++) {
			strRetorno += " -> " +noAux.getConteudo();
			noAux = noAux.getNextNo();
		}
		
		return strRetorno;
	}
	
	
}
