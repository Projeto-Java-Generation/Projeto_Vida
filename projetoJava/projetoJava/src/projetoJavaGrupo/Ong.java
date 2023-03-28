package projetoJavaGrupo;
import java.util.List;

public class Ong extends Pessoa {
	private String localizacao;;
	private List<Estoque> estoque;


	public Ong(String nomePessoa, String telefone, String documento, String localizacao, List<Estoque> estoque) {
		super(nomePessoa, telefone, documento);
		this.localizacao = localizacao;
		this.estoque = estoque;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public List<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Estoque> estoque) {
		this.estoque = estoque;
	}

	public void exibirOngNova() {
		System.out.println("\nSeus Dados:\nNome da ONG: " + getNomePessoa() + ", telefone de nº: " + getTelefone()
				+ ", CNPJ: " + getDocumento() + " e localização: " + localizacao + "com produtos: " + estoque);
	}
}
