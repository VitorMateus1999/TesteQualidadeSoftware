package e1;

import java.util.List;

public class Aluno {
	
	public String nome;
	public int idade;
	public int mes;
	public int ano;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void validarNome(){
		
		if( nome == null || nome.length() < 5 || nome.length() > 50)
		{
			System.out.println("Nome invalido");
		}
		 
		
	
					
	}
	
	public void validarIdade()
	{
		if( idade < 1 || idade >150)
		{
			System.out.println("Idade Não Permitida,tente novamente!");
		}
	}
	public void validarMes() {
		
		if( mes <1 || mes >12) {
			System.out.println("Mes Incorreto, valido 1 a 12");
		}
	}
		public void validarAno()
		{
			if( ano <1900 || ano >2024)
			{
				System.out.println("Ano Inccoreto, apartir de 1900 a 2024");
			}
		}
		
		public boolean verificarIdade() {
			
			if( idade > 18 )
			{
				System.out.println("E maior de Idade");
				
			
			}
			
			if ( idade < 18 )
			{
				System.out.println("E menor de Idade");
				
				
			}
		
			return true;
		}

		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", mes=" + mes + ", ano=" + ano + "]";
		}
		
		
	}
	
	
	
	


