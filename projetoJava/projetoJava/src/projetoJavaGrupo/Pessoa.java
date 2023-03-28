package projetoJavaGrupo;

public class Pessoa {

	private String nomePessoa;
	private String telefone;
	private String documento;
	private String localizacao;

	

	public Pessoa(String nomePessoa, String telefone, String documento, String localizacao) {
		this.nomePessoa = nomePessoa;
		this.telefone = telefone;
		this.documento = documento;
		this.localizacao = localizacao;
	}



	public String getNomePessoa() {
		return nomePessoa;
	}



	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getDocumento() {
		return documento;
	}



	public void setDocumento(String documento) {
		this.documento = documento;
	}



	public String getLocalizacao() {
		return localizacao;
	}



	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}



	public void exibir() {
		System.out.println("\nSeus Dados: "+"Nome: " + nomePessoa + ", telefone de nº: " + telefone
				+ ", identidade de nº: " + documento+ " e Localização: "+localizacao);
	}

}