package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class exercicio8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int numeroA,numeroB;
		System.out.println("digite um intervalo: ");
		numeroA = teclado.nextInt();
		numeroB = teclado.nextInt();
		
		if(numeroA > numeroB)
		{
			for(int i = numeroB;i < numeroA;i++)
			{
				System.out.print(" " +i+ " ");
			}
		}
		else if(numeroB > numeroA)
		{
			for(int i = numeroA;i < numeroB ; i++)
			{
				System.out.print(" " +i+ " ");
			}
		}
	}
}
