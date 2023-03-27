package projetoJavaGrupo;
import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
				String [] Produtos = {"Cesta Básica ", "Agasalho ", "Agua "};
				int [] quantidade = {10, 10,10};
				int idProduto=0, quant=0, opcao=0;

		
		String nome, tel, doc;

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
		Pessoa pessoa1 = new Pessoa(nome, doc, tel);
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
		if(opcao==5){
			System.out.println("Programa Encerrado!");
			leia.close();
			System.exit(5);
		}

		switch (opcao) {
			case 1:
				System.out.println("1 - OFERECER DOAÇÃO.");
				System.out.println("\nFicamos felizes com sua atitude, ela pode salvar vidas.");
				System.out.println("\nPor favor, selecione o produto que deseja doar");
				
				for(int i =0; i<3; i++){
					System.out.println((i+1)+" "+ Produtos[i]);
				}
				while(idProduto<=0 || idProduto>3){
			
					System.out.println("selecione o produto que deseja doar: ");
					idProduto=leia.nextInt();
				}
				
				do{
					System.out.println("selecione a quantidade de produtos deseja doar: ");
					quant=leia.nextInt();
					quantidade[idProduto - 1] += quant;
				
			
				}while(quant<1);

				break;
			case 2:
				System.out.println("2 - SOLICITAR DOAÇÃO.");

				break;
			case 3:
				System.out.println("3 - INFORMAÇÕES ÚTEIS.");

				break;

				case 4:
				System.out.println("3 - INFORMAÇÕES ÚTEIS.");

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
