package e2;

public class Aluno {
	
	public String nome;
	public int idade;
	public int mes;
	public int ano;
	
	public boolean validarNome(String nome)
	{
		if( nome == null || nome.length() <5 || nome.length() >150)
		{
			System.out.println("Erro= Nome Invalido, tente novamente ");
			
			return false;
			}
		
		
		return true;
		}
		
	public boolean validarIdade( int idade)
	
	{
		if( idade <1 || idade >150 )
		{
			System.out.println("Erro= Informe entre 1 a 150");
			return false;
		}
		
		return true;
	}
	
	public boolean validarMes( int mes)
	{
		if( mes <1 || mes >12)
		{
			System.out.println("Erro: Informe entre 1 e 12");
			return false;
		}
		
		return true;
	}
		
	
	public boolean validarAno( int ano) {
		
		if( ano <1900 || ano > 2024)
		{
			System.out.println("Erro: Informe Ano entre 1900 a 2024");
			return false;
		}
		
		
		
		return true;
	}
	
	public String  validarMaioridade()
	{
		if( idade >= 18 )
		{
			return "E maior de Idade";
		}
		
		else 
		{
			return "E menor de idade";
		}
		
	}
	
	public void limparTela()
	{
		for( int i = 0 ; i <50; i++) {
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return "Aluno: nome=" + nome + ", idade=" + idade + ", " + validarMaioridade() +"";
	}
	
	
	
	
	
	
	
	
	}

