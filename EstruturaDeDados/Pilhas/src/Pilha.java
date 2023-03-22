
public class Pilha {
	No noTop;
	public Pilha() {
		noTop = null;
	}
	public void pop() {
		
	}
	
	public void push(No no) {
		No noref = noTop;
		no.setNextNo(noref);
		noTop = no;
	}
	
	public No getNoTop() {
		return noTop;
	}
	
	public void imprimirPilha() {
		No noRef = noTop;
		if(isEmpty()) {
			System.out.println("Pilha vazia");
		}
		else {
			while (noRef != null) {
				System.out.println(noRef.getConteudo());
				noRef = noRef.getNextNo();
			}
			System.out.println("A lista chegou ao fim.");
		
		}
	}
	
	public boolean isEmpty() {
		boolean validation;
		validation = noTop == null;
		return validation;
	}
	
	
}
