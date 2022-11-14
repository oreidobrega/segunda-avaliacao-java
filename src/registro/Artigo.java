package registro;

import java.time.LocalDate;

public class Artigo {
	
	private int id, quantidadePaginas;
	private String titulo, palavrasChaves, resumo;
	private LocalDate dataDeEnvio = LocalDate.now();
	private long cpfAutor;
	private boolean aceito = false;
	
	//construtor_
	
	public Artigo(long cpfAutor, int id, int quantidadePaginas, String titulo, String palavrasChaves, String resumo, LocalDate dataDeEnvio) {
		this.cpfAutor = cpfAutor;
		this.id = id;
		this.quantidadePaginas = quantidadePaginas;
		this.titulo = titulo;
		this.palavrasChaves = palavrasChaves;
		this.resumo = resumo;
		this.dataDeEnvio = dataDeEnvio;
	}


	
	//métodos_
	
	@Override
	public String toString() {
		return "\n[" + id + "]" + "\n" + titulo
				+ "\n" + palavrasChaves + "\n" + resumo + "\nData de submissão :" + dataDeEnvio
				+ "\nCPF do Autor: " + cpfAutor + "\n";
	}



	public boolean isAceito() {
		return aceito;
	}



	public void setAceito(boolean aceito) {
		this.aceito = aceito;
	}

}
