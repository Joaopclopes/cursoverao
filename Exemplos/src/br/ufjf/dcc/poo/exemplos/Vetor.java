package br.ufjf.dcc.poo.exemplos;

import java.util.Scanner;

public class Vetor
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String nomes[] = new String[3];
		int    notas[] = new int[3];
		int    media = 0;
		
		for(int i = 0;i <= 3;i++)
		{
			System.out.print("Informe o nome do aluno "+(i+1)+" : ");
			nomes[i] = teclado.nextLine();
			System.out.print("Informe a nota do aluno "+(i+1)+" : ");
			notas[i] = teclado.nextInt();
		}
		
		media = ((notas[0] + notas[1] + notas[2])/3);
	}

}
