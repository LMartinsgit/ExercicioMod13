package br.com.lmartins;

public class PessoaJuridica extends Pessoa {
   
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
	private String ramoatuacao;
	
	public String getRamoatuacao() {
		return ramoatuacao;
	}

	public void setRamoatuacao(String ramoatuacao) {
		this.ramoatuacao = ramoatuacao;
	}

	public String getDatafundacao() {
		return datafundacao;
	}

	public void setDatafundacao(String datafundacao) {
		this.datafundacao = datafundacao;
	}

	private String datafundacao;
	
}