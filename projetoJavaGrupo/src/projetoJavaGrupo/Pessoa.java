package projetoJavaGrupo;

public class Pessoa {

	private String nomePessoa;
	private String telefone;
	private String documento;

	public Pessoa(String nomePessoa, String telefone, String documento) {
		this.nomePessoa = nomePessoa;
		this.telefone = telefone;
		this.documento = documento;
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

	public void exibir() {
		System.out.println("Dados cadastrados: "+"\nNome: " + nomePessoa + "\nTelefone de nº: " + telefone
				+ "\nIdentidade de nº: " + documento);
	}

}