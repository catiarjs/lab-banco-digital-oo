package edu.dio.cliente;

public abstract class Cliente {
	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	protected void imprimirEndereco() {
		System.out.println("Endereço: " + this.endereco);
	}
	
	public abstract void imprimirInformacoesCadastrais();

	public abstract String getNome();
}
