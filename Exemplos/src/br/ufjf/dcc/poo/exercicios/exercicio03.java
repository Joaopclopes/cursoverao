package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class exercicio03
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		float x,a = 0,b = 0,c = 0,delta;
		delta = ((b*b)-(4*a*c));
		
		System.out.print("a :");
		a = teclado.nextFloat();
		
		System.out.print("b :");
		b = teclado.nextFloat();
		
		System.out.print("c :");
		c = teclado.nextFloat();
		
		x = (float)((-b+Math.sqrt(delta))/(2*a));
		
		System.out.println("X1: "+ x);
		
		x = (float)((-b-Math.sqrt(delta))/(2*a));
				
		System.out.println("X2: "+ x);
	}

}
