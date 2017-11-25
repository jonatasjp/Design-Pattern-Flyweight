package implementacao;

public class StatusItem {

	private final String nome;
	private final boolean podeCancelar;
	private final boolean compraConcluida;
	
	static StatusItem criar(String nome, boolean podeCancelar, boolean compraConcluida) {
		return new StatusItem(nome, podeCancelar, compraConcluida);
	}
	
	private StatusItem(String nome, boolean podeCancelar, boolean compraConcluida) {
		this.nome = nome;
		this.podeCancelar = podeCancelar;
		this.compraConcluida = compraConcluida;
	}

	public String getNome() {
		return nome;
	}

	public boolean isCompraConcluida() {
		return compraConcluida;
	}

	public boolean podeCancelar() {
		return podeCancelar;
	}
}