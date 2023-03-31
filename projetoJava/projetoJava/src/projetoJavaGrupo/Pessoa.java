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
		System.out.println(
				Cor.TEXT_GREEN_BOLD + "\n\tSeus Dados:" + Cor.TEXT_RESET
						+ Cor.TEXT_BLUE_BOLD + "\nNome: " + Cor.TEXT_GREEN_BOLD + nomePessoa + Cor.TEXT_RESET
						+ Cor.TEXT_BLUE_BOLD + "\nTelefone de Nº: " + Cor.TEXT_GREEN_BOLD + telefone + Cor.TEXT_RESET
						+ Cor.TEXT_BLUE_BOLD + "\nIdentidade de Nº: " + Cor.TEXT_GREEN_BOLD + documento + Cor.TEXT_RESET
						+ Cor.TEXT_BLUE_BOLD + "\nLocalização: " + Cor.TEXT_GREEN_BOLD + localizacao + Cor.TEXT_RESET);
	}

}