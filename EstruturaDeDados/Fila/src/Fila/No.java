package Fila;

public class No<T> {
	private T conteudo;
	private No<T> proxNo;
	
	
	public No(T obj) {
		this.conteudo = obj;
	}
	
	
	public Object getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No<T> getProxNo() {
		return proxNo;
	}
	public void setProxNo(No<T> proxNo) {
		this.proxNo = proxNo;
	}
}
