package br.ufjf.dcc.poo.exercicios;

public class Aluno 
{
	private String matricula;
	private String nome;
	private int    nota1,nota2,notatra;
	
	public float media(float n1,float n2,float n3)
	{
		float media = ((n1+n2+n3)/3);
		return media;
	}
	public float Final(float n1, float n2)
	{
		float n3 = (6*3 - n1 - n2);
		return n3;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNotatra() {
		return notatra;
	}
	public void setNotatra(int notatra) {
		this.notatra = notatra;
	}
	
	
}
