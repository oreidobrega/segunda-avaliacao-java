package registro;

public class Registro {
	private int nivel;
	private long cpf;
	private String dataNascimento, titulacao, instituicao, senha, nome;
	private Artigo artigo;
	
	
	
	public long getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}
		

	public int getNivel() {
		return nivel;
	}


	public Registro(String nome, long cpf, String dataNascimento, String titulacao, String instituicao, String senha, int nivel) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.titulacao = titulacao;
		this.instituicao = instituicao;
		this.senha = senha;
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return 
	"\n" 
	+ nome 
	+  "\n" 
	+ titulacao
	+ "\n" 
	+ instituicao + "\n";
	}
	
	

}
