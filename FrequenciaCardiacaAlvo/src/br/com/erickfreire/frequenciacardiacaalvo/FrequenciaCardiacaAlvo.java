package br.com.erickfreire.frequenciacardiacaalvo;

public class FrequenciaCardiacaAlvo {
	
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	public FrequenciaCardiacaAlvo(String nome, String sobrenome, int dia, int mes, int ano) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
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
	
	public int calculaIdade(int anoAtual) {
		
		return anoAtual - ano;		
	}
	
	public int frequenciaMaxima(int anoAtual) {
		return 220 - calculaIdade(anoAtual);
	}
	
	public String frequenciaAlvo(int anoAtual) {
		double cinquenta = frequenciaMaxima(anoAtual) * 0.5;
		double oitenta = frequenciaMaxima(anoAtual) * 0.8;
		String resultado = String.format("%.0f - %.0f", cinquenta, oitenta);
		return resultado;
	}
	

}
