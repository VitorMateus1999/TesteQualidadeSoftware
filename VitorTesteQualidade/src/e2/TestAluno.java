package e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestAluno {
	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in); // SCANNER PRA PEGAR ENTRADA
		List<Aluno> dados = new ArrayList<Aluno>(); //ARRAY PRA LISTAR
		
		while(true) {//Loop em quanto for verdadeiro
			
			//APRESENTAÇÃO
			System.out.println("\t\tSeja Bem vindo -\n ** Codigo Produzido por: Vitor Mateus e Nathan **\n\n");
			System.out.println(" 1- Cadastrar \n 2- Listar");
			int opc = Keyboard.nextInt();
			Aluno objAluno = new Aluno();//OBJETO
			objAluno.limparTela();
			 
			//1 - CADASTRO
			if(opc==1)
			
			{
				
				boolean nomeValido= false;
				
				while(!nomeValido)
				{
				//NOME
				System.out.println("\nInforme o Nome:  ");
				String nomeinf = Keyboard.next();
				if (objAluno.validarNome(nomeinf))
				{
					objAluno.nome = nomeinf;
					nomeValido = true;//Para O loop
				}
				
				}//Chaves do While 
		
				//IDADE
				boolean idadeValida= false;
				while(!idadeValida)//Loop se a idade for inserida errada
				{
				System.out.println("\nInforme a idade:  ");
				int idadeinf = Keyboard.nextInt();
				if( objAluno.validarIdade(idadeinf))
				{
					
					objAluno.idade = idadeinf;
					
					idadeValida= true;//Para O loop
					
				}
				}///Chaves do While 
				
				
				// MES
				boolean mesValido= false;
				while(!mesValido)//Loop se o mes for inserido errada
				{
				System.out.println("\nInforme o Mes de Nascimento");
				int mesinf = Keyboard.nextInt();
				if( objAluno.validarMes(mesinf))
				{
					objAluno.mes = mesinf;
					mesValido= true;//Para O loop
				}
				
				
				}///Chaves do While 
				
				//ANO
				boolean anoValido = false;
				while(!anoValido) {//Loop se o ano for inserido errado
				System.out.println("\nInforme o Ano de Nascimento");
				int anoinf = Keyboard.nextInt();	
				if (objAluno.validarAno(anoinf) )
				{
					objAluno.ano = anoinf;
					anoValido = true; //Para O loop
				}
				
				}
				
				dados.add(objAluno);//ADICIONAR O OBEJTOS NA LISTA
				objAluno.limparTela();
						
			}//CHAVE DO IF OPCAO 1
			
			
			//2 - Listagem
			else if( opc == 2)
			{
				objAluno.limparTela();
				for ( Aluno dadosVizu : dados)
				{
					System.out.println("\n"+dadosVizu.toString() + "\n");
				}
			
			}
					
		}
	
		
		
	}
	
}

