
public class No {
	
	private No nextNo;
	private String conteudo;
	
	public No(String item) {
		setConteudo(item);
		setNextNo(nextNo);
	}
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public No getNextNo() {
		return nextNo;
	}
	public void setNextNo(No nextNo) {
		this.nextNo = nextNo;
	}
}