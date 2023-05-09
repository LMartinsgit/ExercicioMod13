package br.com.lmartins;
public class Projeto {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub


		
		Pessoa pessoaf = new PessoaFisica();
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		pessoaf.setNome("Ken Adams");
		pessoaf.setCep("23478-164");
		pessoaf.setEndereco("Rua asre 234");
		pessoaFisica.setCpf("213644962-41");
		pessoaFisica.setNascimento("15/11/1999");
		pessoaFisica.setProfissao("Ator");
		
		System.out.println("Pessoa Física:");
		Thread.sleep(250);
		System.out.println("Nome: " + pessoaf.getNome());
		Thread.sleep(250);
		System.out.println("Endereço: " + pessoaf.getEndereco());
		Thread.sleep(250);
		System.out.println("CEP: " + pessoaf.getCep());
		Thread.sleep(250);
		System.out.println("CPF: " + pessoaFisica.getCpf());
		Thread.sleep(250);
		System.out.println("Nascimento: " + pessoaFisica.getNascimento());
		Thread.sleep(250);
		System.out.println("Profissão: " + pessoaFisica.getProfissao());
		Thread.sleep(500);
		
		Pessoa pessoaj = new PessoaJuridica();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		pessoaj.setNome("Rosh Digital");
		pessoaj.setCep("49671-498");
		pessoaj.setEndereco("Av tesuy 1421");
		pessoaJuridica.setCnpj("12.537.061/0001-87");
		pessoaJuridica.setDatafundacao("30/06/1990");
		pessoaJuridica.setRamoatuacao("Marketing/Comunicação");
			
		System.out.println("\nPessoa Jurídica:");
		Thread.sleep(250);
		System.out.println("Nome: " + pessoaj.getNome());
		Thread.sleep(250);
		System.out.println("Endereço: " + pessoaj.getEndereco());
		Thread.sleep(250);
		System.out.println("CEP: " + pessoaj.getCep());
		Thread.sleep(250);
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
		Thread.sleep(250);
		System.out.println("Data de Fundação: " + pessoaJuridica.getDatafundacao());
		Thread.sleep(250);
		System.out.println("Ramo de atuação: " + pessoaJuridica.getRamoatuacao());
		
	}

}
