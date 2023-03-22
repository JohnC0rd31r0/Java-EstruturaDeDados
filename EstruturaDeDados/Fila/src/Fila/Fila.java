package Fila;

public class Fila<T> {
	private No<T> noTop = null;
	private No<T> noRef;
	public void pop() {
		if(isEmpty())
			System.out.println("Fila vazia, sem o que retirar");
		noTop = noTop.getProxNo();
	}
	
	public void push(T obj) {
		No<T> no = new No<T>(obj);
		if(isEmpty()) {
			noTop = no;
		}else {
			noRef.setProxNo(no);
		}
		noRef = no;
	}
	
	public boolean isEmpty(){
		return noTop == null;
	}
	
	public void imprimirFila() {
		No<T> noReferencia = noTop;
		if(isEmpty()) {
			System.out.println("Fila vazia");
		}
		while(noReferencia!=null) {
			System.out.println(noReferencia.getConteudo());
			noReferencia = noReferencia.getProxNo();
		}
		
		
	}


}
