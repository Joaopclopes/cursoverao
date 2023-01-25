package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		float a,b,c,media;
		System.out.print("valor 1: ");
		a = teclado.nextFloat();
		System.out.print("valor 2: ");
		b = teclado.nextFloat();
		System.out.print("valor 3: ");
		c = teclado.nextFloat();
		media = (a + b + c)/3;
		System.out.println("media : "+ media);
	}

}
