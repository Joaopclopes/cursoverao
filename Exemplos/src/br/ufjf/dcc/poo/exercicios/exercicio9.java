package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio9
{
	public static void main(String[] args) 
	{
		int i = 0,par = 0,impar = 0;
		
		while(i != -1)
		{
			i = Integer.parseInt(JOptionPane.showInputDialog(null));
			if(i % 2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}
			
			JOptionPane.showMessageDialog(null, "numero pares: "+par+" impares: "+impar);
		}
	}
}
