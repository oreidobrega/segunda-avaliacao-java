package meny;

import registro.Arquivotxt;

public class Main {
	static Menu programa = new Menu();
	static Arquivotxt arquivo = new Arquivotxt();

	static boolean execute = true;

	public static void rodaParteLogado() {
		if (arquivo.isLogado()) {
			programa.telaSegundoMenu();
			int opcao = programa.menu();
			if (opcao == 1) {
				rodaParteLogado();
			} else if (opcao == 2) {

				rodaParteLogado();
			} else if (opcao == 3) {

				rodaParteLogado();
			} else if (opcao == 4) {

				rodaParteLogado();

			} else if (opcao == 5) {
				arquivo.criarArtigo();
				rodaParteLogado();

			} else if (opcao == 6) {
				rodaParteLogado();
			} else if (opcao == 7) {
				rodaParteLogado();
			} else if (opcao == 8) {
				rodaParteLogado();
			} else if (opcao == 9) {
				arquivo.listaArtigosAceitos();
				rodaParteLogado();
			} else if (opcao == 10) {
				arquivo.listaArtigosNegados();
				rodaParteLogado();
			} else if (opcao == 11) {
				rodaParteLogado();
			} else if (opcao == 12) {
				arquivo.listaParticipantes();
				voltaMenuLogado();

			} else if (opcao == 13) {
				execute = false;
			}

		}
	}

	public static void voltaMenuLogado() {
		System.out.println("\nVoltar (1) / Sair (2)");

		int continua = programa.menu();

		if (continua == 1) {
			rodaParteLogado();

		} else if (continua == 2) {
			System.out.println("Saindo...");
			execute = false;
		} else {
			System.out.println("Opção inválida seu noob !!!");
			voltaMenuLogado();

		}
	}
	
	public static void main(String[] args) {

		// primeiro_menu
		programa.telaPrimeiroMenu();

		// rodando_programa
		while (execute) {

			int continua = programa.menu();

			// login
			if (continua == 1) {
				arquivo.loginRegistro();
				rodaParteLogado();

			}
			// registra_
			else if (continua == 2) {
				arquivo.criarRegistro();

			} else if (continua == 3) {
				System.out.println("Saindo...");
				execute = false;
			} else {
				System.out.println("Opção inválida!!!");
			}
		}

	}

}
