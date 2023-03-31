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
		System.out.println(Cor.TEXT_GREEN_BOLD + "\n\tDados da ONG:\n" + "Nome: " + getNomePessoa()
				+ "\nTelefone de Nº: " + getTelefone()
				+ "\nIdentidade de Nº: " + getDocumento() + "\nLocalização: " + getLocalizacao() + "\nCom produtos: "
				+ Cor.TEXT_RESET);
	}
}