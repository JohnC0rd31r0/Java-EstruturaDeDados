package ListaDuplamenteEncadeada;

public class No<T> {
	private T conteudo;
	private No<T> nextNo;
	private No<T> previousNo;
	
	public No(T conteudo, No<T> nextNo, No<T> previousNo) {
		this.setConteudo(conteudo);
		this.setNextNo(nextNo);
		this.setPreviousNo(previousNo);
	}
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.nextNo = null;
		this.previousNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getPreviousNo() {
		return previousNo;
	}

	public void setPreviousNo(No<T> previousNo) {
		this.previousNo = previousNo;
	}

	public No<T> getNextNo() {
		return nextNo;
	}

	public void setNextNo(No<T> nextNo) {
		this.nextNo = nextNo;
	}
	
	public String toStringIndo() {
		String str = "No [conteudo=" + conteudo + "]";
		
		if(nextNo != null) {
			str += "->" + nextNo.toString();
		}else {
			str += "-> " + "null";
		}
		
		return str;
	}
	
	public String toStringVindo() {
		String str = "No [conteudo=" + conteudo + "]";
		
		if(nextNo != null) {
			str += "->" + previousNo.toString();
		}else {
			str += "-> " + "null";
		}
		
		return str;
	}
	
}
