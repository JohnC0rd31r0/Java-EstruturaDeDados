
public class ListaCircular<T> {
	public ListaCircular() {
		this.tamanhoLista = 0;
		this.referenciaEntrada = null;
		this.referenciaUltimoNO = null;
	}

	int tamanhoLista = 0;
	No<T> referenciaEntrada;
	No<T> referenciaUltimoNO;
	
	public int size() {
		return tamanhoLista;
	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	@Override
	public String toString() {
		String text = "";
		int x = 0;
		No<T> noAux = referenciaEntrada;
		do {
			text += noAux.getConteudo() + " -> ";
			noAux = noAux.getNextNo();
			x++;
		}while(x!=9);
		
		return text;
	}

	private No<T> getNo(int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + "");
		}else {
			if(index == 0 )
				return this.referenciaEntrada;
			No<T> noRefEnt = referenciaEntrada;
			for (int i = 0; i < index; i++) {
				noRefEnt = noRefEnt.getNextNo();
			}
			return noRefEnt;
		}
	}
	
	public void remove(int index) {
		if(index>= size()) {
			throw new IndexOutOfBoundsException("Indice é maior que o tamanho da lista");
		}else {
			No<T> noAux = referenciaEntrada;
			if(index ==0) {
				this.referenciaEntrada = referenciaEntrada.getNextNo();
				referenciaUltimoNO.setNextNo(referenciaEntrada);
			}else if(index == 1){
				referenciaEntrada.setNextNo(referenciaEntrada.getNextNo());
			}
			
			{
				for (int i = 0; i < index; i++) {
					noAux = noAux.getNextNo();
				}
				noAux = noAux.getNextNo();
			}
		}
		
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(isEmpty()) {
			referenciaEntrada = novoNo;
			referenciaUltimoNO = novoNo;
			referenciaEntrada.setNextNo(referenciaUltimoNO);
		}else {
			referenciaUltimoNO.setNextNo(novoNo);
			novoNo.setNextNo(referenciaEntrada);
			referenciaEntrada = novoNo;
		}
		this.tamanhoLista++;
	}
}
