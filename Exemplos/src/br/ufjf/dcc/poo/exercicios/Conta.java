package br.ufjf.dcc.poo.exercicios;

public class Conta 
{
	private String titular,agencia,data;
	private int    numero;
	private double saldo;
	
	public void saca(double valor)
	{
		if(getSaldo()< valor)
			System.out.println("saldo insuficiente.");
		else
		{
			setSaldo(getSaldo()-valor);
			System.out.println("transação aprovada.");
		}
	}
	public void deposita(double valor)
	{
		setSaldo(getSaldo()+ valor);
	}
	public void rendimento()
	{
		double valor = getSaldo()*0.1;
		deposita(valor);
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
