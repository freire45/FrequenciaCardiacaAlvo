package br.com.erickfreire.frequenciacardiacaalvo;

import java.util.Scanner;

public class FrequenciaCardiacaAlvoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		int anoAtual;
		
		System.out.println("Programa que calcula a Frequencia Cardiáca Alvo: ");		
		System.out.print("Informe o nome: ");
		nome = entrada.nextLine();
		
		System.out.print("Informe o Sobrenome: ");
		sobrenome = entrada.nextLine();
		
		System.out.print("Em que ano estamos? ");
		anoAtual = entrada.nextInt();	
		
		System.out.print("Dia de Nascimento: ");
		dia = entrada.nextInt();
		
		System.out.print("Mês de Nascimento: ");
		mes = entrada.nextInt();
		
		System.out.print("Ano de Nascimento: ");
		ano = entrada.nextInt();
		
		FrequenciaCardiacaAlvo pac1 = new FrequenciaCardiacaAlvo(nome, sobrenome, dia, mes, ano);
		
		System.out.printf("%n%n");
		
		System.out.printf("Nome: %s %s%n", pac1.getNome(), pac1.getSobrenome());
		System.out.printf("Data De Nascimento: %d/%d/%d - Idade: %d%n", pac1.getDia(), pac1.getMes(), pac1.getAno(), pac1.calculaIdade(anoAtual));
		System.out.printf("Frequencia Cardíaca Máxima: %d%n", pac1.frequenciaMaxima(anoAtual));
		System.out.printf("Frequencia Cardíaca Alvo: %s%n", pac1.frequenciaAlvo(anoAtual));

	}

}
