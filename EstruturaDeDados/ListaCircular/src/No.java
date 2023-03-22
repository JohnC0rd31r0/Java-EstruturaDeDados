
public class No<T> {
	private T conteudo;
	private No<T> nextNo;
	
	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getNextNo() {
		return nextNo;
	}

	public void setNextNo(No<T> nextNo) {
		this.nextNo = nextNo;
	}


	public No(T conteudo) {
		this.conteudo = conteudo;
	}

	
	
}
