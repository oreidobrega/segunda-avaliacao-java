package meny;

import java.util.Scanner;


public class Menu {

	Scanner ler = new Scanner(System.in);


	public void telaPrimeiroMenu() {
		System.out.print("### Congresso Brasileiro de Programação Orientada a Objetos - CBPOO ###\n"
				+ "                  =================================\n"
				+ "                  |   1 -  Fazer login            |\n"
				+ "                  |   2 -  Registrar              |\n"
				+ "                  |   3 -  Sair                   |\n"
				+ "                  =================================\n");
	}

	public void telaSelecionaNivel() {
		System.out.print("### Escolha sua Função ###\n" + "                  =================================\n"
				+ "                  |   1 -  Participante           |\n"
				+ "                  |   2 -  Organizador            |\n"
				+ "                  |   3 -  Especialista           |\n"
				+ "                  =================================\n");

	}

	public void telaSegundoMenu() {
		
		
		
		System.out.println("                  =================================\n" +
			    "                  |                               |\n" +
			    "                  |   OPÇOES                      |\n" +
			    "                  |===============================|\n" +
                "                  |   1 -  Inscrever participante |\n" +
                "                  |   2 -  Validar participante   |\n" +
                "                  |   3 -  Invalidar participante |\n" +
                "                  |   4 -  Emitir certificado     |\n" +
                "                  |   5 -  Submeter artigo        |\n" +
                "                  |   6 -  Enviar avaliação       |\n" +
                "                  |   7 -  Aceitar artigo         |\n" +
	            "                  |   8 -  Rejeitar artigo        |\n" +
                "                  |   9 -  Listar artigos aceitos |\n" +
                "                  |   10 - Listar artigos negados |\n" +
                "                  |   11 - Ver dados de um artigo |\n" +
                "                  |   12 - Listar participantes   |\n" +
                "                  |   13 - Sair                   |\n" +
                "                  =================================\n");
	}

	public int menu() {
		System.out.print("Digite o número de acordo com a opção -->");
		return ler.nextInt();
	}

}
