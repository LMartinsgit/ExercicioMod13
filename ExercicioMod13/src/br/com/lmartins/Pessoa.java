package br.com.lmartins;

public abstract class Pessoa {

	private PessoaFisica pessoafisica;
	
	private PessoaJuridica pessoajuridica;
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	private String cep;
	
	private String endereco;
	
	
	
}
