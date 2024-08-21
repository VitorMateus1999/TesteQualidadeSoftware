package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAluno {

	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in);
		List<String> dadosAlunos = new ArrayList<String>();
		Aluno aluno = new Aluno();
		while(true) {
		
		System.out.println("\t\tSeja bem Vindo\n\n");
		//NOME
		System.out.println("Informe o Nome");
		String nomeA =  Keyboard.next();
		aluno.nome= nomeA;
		aluno.validarNome();
		
		dadosAlunos.add(nomeA);
		//IDADE
		System.out.println("Informe a Idade");
		int idadeA =  Keyboard.nextInt();
		aluno.idade = idadeA;
		aluno.validarIdade();
		dadosAlunos.add(nomeA);
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
