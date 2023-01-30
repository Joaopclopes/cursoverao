package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio7
{

//	public static void main(String[] args)
//	{
//		int i = 0,cont = 0, total = 0;
//		float media;
//		
//		while(i != -1)
//		{
//			i = Integer.parseInt(JOptionPane.showInputDialog(null));
//			total = total + i;
//			cont++;
//		}
//		media = total/cont;
//		JOptionPane.showMessageDialog(null, "Media : "+ media);
//	}
	
	public static void main(String[] args)
	{
		int i = 0,cont = 0, total = 0;
		float media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("------> ");
		
		while(i != -1)
		{
			i = teclado.nextInt();
			total = total + i;
			cont++;
		}
		media = total/cont;
		System.out.println("Media: "+ media);
	}

}
