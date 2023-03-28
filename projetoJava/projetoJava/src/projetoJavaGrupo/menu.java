package projetoJavaGrupo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] Produtos = { "Cesta Básica ", "Agasalho ", "Agua " };
		int[] quantidade = { 10, 10, 10 };
		int idProduto = 0, quant = 0;

		String zona = "1 - Zona Leste\n2 - Centro\n3 - Zona Oeste\n4 - Zona Sul\n5 - Zona Norte";
		String nome, tel, doc, localizacao = "";
		int opcao, localb;

		List<Estoque> estoqueZonaLeste = new ArrayList<Estoque>();
		estoqueZonaLeste.add(new Estoque("Cesta Básica", 10));
		estoqueZonaLeste.add(new Estoque("Agasalho", 5));
		List<Estoque> estoqueZonaSul = new ArrayList<Estoque>();
		estoqueZonaSul.add(new Estoque("Água", 1));
		estoqueZonaSul.add(new Estoque("Agasalho", 5));

		List<Ong> ongs = new ArrayList<Ong>();
		ongs.add(new Ong("nomeA", "telefoneA", "documentoA", "localizacaoA", estoqueZonaLeste));
		ongs.add(new Ong("nomeB", "telefoneB", "documentoB", "localizacaoB", estoqueZonaSul));
		/*for (Ong ong : ongs) {
			System.out.println("Nome: " + ong.getNomePessoa());
			System.out.println("Telefone: " + ong.getTelefone());
			System.out.println("CNPJ: " + ong.getDocumento());
			System.out.println("Localização: " + ong.getLocalizacao());
			System.out.println("Estoque:");
			List<Estoque> estoqueOng = ong.getEstoque();
			for (Estoque estoque : estoqueOng) {
				System.out.println("- " + estoque.getNome() + ": " + estoque.getQuantidade());
			}
			System.out.println();
		}
		*/

		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("             Bem-vinde ao Projeto Vida!              ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("\nDigite seu nome:                                   ");
		nome = leia.nextLine();
		System.out.println("\nDigite o nº do documento de identidade:            ");
		doc = leia.nextLine();
		System.out.println("\nDigite o nº do telefone:                           ");
		tel = leia.nextLine();
		System.out.println(zona);
		System.out.println("\nEscolha sua localização                            ");
		localb = leia.nextInt();
		if (localb == 1) {
			localizacao = "Zona Leste";
		}

		Pessoa pessoa1 = new Pessoa(nome, doc, tel, localizacao);
		pessoa1.exibir();

		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("                      Bem-vinde!                     ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("            1 - OFERECER DOAÇÃO.                     ");
		System.out.println("            2 - SOLICITAR DOAÇÃO.                    ");
		System.out.println("            3 - INFORMAÇÕES ÚTEIS.                   ");
		System.out.println("            4 - CADASTRO DE ONGS.                    ");
		System.out.println("            5 - ENCERRAR.                            ");
		System.out.println("-----------------------------------------------------");
		System.out.println("                                                     ");
		System.out.println("            Digite a opção desejada:                 ");
		System.out.println("-----------------------------------------------------");

		opcao = leia.nextInt();

		switch (opcao) {
			case 1:
				System.out.println("1 - OFERECER DOAÇÃO.");
				System.out.println("\nFicamos felizes com sua atitude, ela pode salvar vidas.");
				System.out.println("\nPor favor, selecione o produto que deseja doar");

				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i]);
				}
				while (idProduto <= 0 || idProduto > 3) {

					System.out.println("selecione o produto que deseja doar: ");
					idProduto = leia.nextInt();

				}

				do {
					System.out.println("\nInsira quantas unidades do produto (" + Produtos[idProduto - 1]
							+ ") você deseja doar: ");
					quant = leia.nextInt();

				} while (quant < 1);

				quantidade[idProduto - 1] += quant;
				estoqueZonaLeste.add(new Estoque(Produtos[idProduto - 1], quant));

				for (Ong ong : ongs) {
					List<Estoque> estoqueOng = ong.getEstoque();
					for (Estoque estoque : estoqueOng) {
						if (estoque.getNome().equals(Produtos[idProduto - 1])) {
							System.out.println("\nObrigade! " + nome
									+ " por sua contribuicao, ela vai fazer a diferenca na vida de alguem!");
							System.out.println(
									"\nFoi doado " + estoque.getQuantidade() + " do produto " + estoque.getNome());
							System.out.println("\nVeja como ficou nosso estoque depois da sua contribuicao");

							// System.out.println("O item " + estoque.getNome() + " está disponível na ONG "
							// + ong.getNomePessoa());

						}
					}
				}
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + " " + Produtos[i] + quantidade[i]);
				}
				break;
			case 2:
				System.out.println("2 - SOLICITAR DOAÇÃO.");
				break;

			case 3:
				System.out.println("3 - INFORMAÇÕES ÚTEIS.");
				break;

			case 4:
				leia.nextLine();
				System.out.println("4 - CADASTRO DE ONGS.");
				System.out.println("Digite o nome da ONG:");
				String nomeOng = leia.nextLine();
				System.out.println("Digite o telefone da ONG:");
				String telOng = leia.nextLine();
				System.out.println("Digite o nº o CNPJ da ONG:");
				String docOng = leia.nextLine();
				System.out.println(zona + "\nDigite o nº referente a  localização da ONG:");
				int localizacaoZ = leia.nextInt();
				localizacao = "";
				switch (localizacaoZ) {
					case 1:
						localizacao = "Zona Leste";
						break;
					case 2:
						localizacao = "Centro";
						break;
					case 3:
						localizacao = "Zona Oeste";
						break;
					case 4:
						localizacao = "Zona Sul";
						break;
					case 5:
						localizacao = "Zona Norte";
						break;
				}
				Ong ong = new Ong(nomeOng, docOng, telOng, localizacao, estoqueZonaSul);
				ong.exibirOngNova();
				break;
			case 5:
				System.out.println("\nSoftware finalizado.");
				leia.close();
				System.exit(4);
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;

		}
	}
}
