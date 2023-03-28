package projetoJavaGrupo;

public class Ong extends Pessoa{
	//atributos
	private String localizacaoOng;
	//private String produtoOng;
	//construtor
	public Ong(String nomePessoa, String telefone, String documento, String localizacaoOng) {
		super(nomePessoa, telefone, documento);
		this.localizacaoOng = localizacaoOng;
	}
	//metodo getters e setters
	public String getLocalizacaoOng() {
		return localizacaoOng;
	}
	public void setLocalizacaoOng(String localizacaoOng) {
		this.localizacaoOng = localizacaoOng;
	}
	public void exibir() {
		super.exibir();
		System.out.println("Localizcao: "+localizacaoOng);
	}
}