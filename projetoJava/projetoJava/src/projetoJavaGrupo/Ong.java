package projetoJavaGrupo;
import java.util.List;

public class Ong extends Pessoa {
	private List<Estoque> estoque;


	public Ong(String nomePessoa, String telefone, String documento, String string, List<Estoque> estoque) {
		super(nomePessoa, telefone, documento, string);
		this.estoque = estoque;
	}

	public List<Estoque> getEstoque() {
		return estoque;
	}

	public void setEstoque(List<Estoque> estoque) {
		this.estoque = estoque;
	}

	public void exibirOngNova() {
		System.out.println("\nSeus Dados:\nNome da ONG: " + getNomePessoa() + ", telefone de nº: " + getTelefone()
				+ ", CNPJ: " + getDocumento() + " e localização: " + getLocalizacao() + "com produtos: " + estoque);
	}
}
