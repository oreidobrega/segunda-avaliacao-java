package registro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import meny.Menu;

public class Arquivotxt {

	int nivel;
	long cpf;
	String dataNascimento, titulacao, instituicao, senha, nome;
	boolean cpfLogin = false, senhaLogin = false, logado = false;

	public boolean isLogado() {
		return logado;
	}

	Scanner ler = new Scanner(System.in);
	Menu menu = new Menu();
	List<Registro> registro = new ArrayList<Registro>();
	List<Artigo> artigo = new ArrayList<Artigo>();

	public void criarRegistro() {

		boolean registrando = true;
		while (registrando) {
			System.out.printf("Informe seu nome: ");
			nome = ler.nextLine();
			System.out.printf("Informe seu CPF: ");
			cpf = ler.nextLong();
			ler.nextLine();
			System.out.printf("Informe sua data de nascimento: ");
			dataNascimento = ler.nextLine();
			System.out.printf("Informe sua titulação acadêmica: ");
			titulacao = ler.nextLine();
			System.out.printf("Informe institução de vínculo: ");
			instituicao = ler.nextLine();
			System.out.printf("Informe sua senha para login: ");
			senha = ler.nextLine();

			menu.telaSelecionaNivel();

			boolean selecionaNivel = true;
			while (selecionaNivel) {

				nivel = ler.nextInt();
				ler.nextLine();
				switch (nivel) {
				case 1:
					nivel = 1;
					selecionaNivel = false;
					break;
				case 2:
					nivel = 2;
					selecionaNivel = false;
					break;
				case 3:
					nivel = 3;
					selecionaNivel = false;
					break;
				default:
					nivel = 0;
					System.out.println("Opção errada!");
					break;
				}
			}

			Registro r = new Registro(nome, cpf, dataNascimento, titulacao, instituicao, senha, nivel);

			registro.add(r);

			System.out.println("Continuar cadastrando? 1 - Sim / 0 - Não");
			int continua = ler.nextInt();
			ler.nextLine();

			if (continua == 0) {

				registrando = false;
			} else if (continua == 1) {
				// volta_pro_while
			} else {
				System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
				registrando = false;
			}

		}

	}

	public void loginRegistro() {

		System.out.printf("Informe seu CPF: ");
		cpf = ler.nextLong();
		ler.nextLine();
		System.out.printf("Informe sua senha: ");
		senha = ler.nextLine();

		System.out.println("\nLogado: " + verificaLogin() + " Quantidade de registrados: " + registro.size());

	}

	public boolean verificaLogin() {

		for (int i = 0; i < registro.size(); i++) {
			if (cpf == registro.get(i).getCpf()) {
				cpfLogin = true;
			}
		}

		for (int i = 0; i < registro.size(); i++) {
			if (senha.equals(registro.get(i).getSenha())) {
				senhaLogin = true;
			}
		}

		if (cpfLogin && senhaLogin) {
			logado = true;

		} else {
			System.out.println("Usuario e/ou senha errado");
		}

		return logado;
	}

	public void listaParticipantes() {
		System.out.println(registro);
	}

	
	public long adicionaAutores() {

		boolean adcAutor = true;
		long cpfAutor;

		System.out.println("Informe o cpf do autor: ");
		cpfAutor = ler.nextLong();
		ler.nextLine();

		while (adcAutor) {

			for (int i = 0; i < registro.size(); i++) {
				if (cpfAutor == registro.get(i).getCpf()) {
					System.out.println("Cpf encontrado");
					adcAutor = false;
				} else {
					System.out.println("Cpf não encontrado. Digite novamente");
					System.out.printf("Informe o cpf do autor: ");
					cpfAutor = ler.nextLong();
					ler.nextLine();
				}
			}

		}
		
		return cpfAutor;
	}

	public void criarArtigo() {
		System.out.println("Informe o titulo: ");
		String titulo = ler.nextLine();
		System.out.println("Informe o resumo: ");
		String resumo = ler.nextLine();
		System.out.println("Informe a palavra-chave: ");
		String palavrasChave = ler.nextLine();
		System.out.println("Informe a quantidade de paginas: ");
		int quantidadePaginas = ler.nextInt();
		ler.nextLine();
		LocalDate dataDeEnvio = LocalDate.now();
		
		long cpfAutores = adicionaAutores();

		int id=0;
		Artigo a = new Artigo(cpfAutores, id, quantidadePaginas, titulo, resumo, palavrasChave, dataDeEnvio);
		artigo.add(a);

	}
	

	public void listaArtigosAceitos() {
		
		for (int i = 0; i < artigo.size(); i++) {
			if (artigo.get(i).isAceito() == true) {
				System.out.println(artigo);
			}
		}
		
		System.out.println(artigo);
	}
	
	public void listaArtigosNegados() {
		
		for (int i = 0; i < artigo.size(); i++) {
			if (artigo.get(i).isAceito() == false) {
				System.out.println(artigo);
			}
		}
		
		System.out.println(artigo);
	}
}
