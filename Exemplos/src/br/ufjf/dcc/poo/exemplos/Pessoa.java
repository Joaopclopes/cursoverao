package br.ufjf.dcc.poo.exemplos;

public class Pessoa 
{
	private String nome;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome, int idade, char sexo)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	public Pessoa(String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa() {
		super();
	}
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}