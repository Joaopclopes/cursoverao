package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio5 
{
	public static void main(String[] args)
	{
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		if(x <= 3)
		{
			JOptionPane.showMessageDialog(null, "bebe");
		}
		else if(x <= 13 && x > 3)
		{
			JOptionPane.showMessageDialog(null, "crianca");
		}
		else if(x <= 20 && x > 13)
		{
			JOptionPane.showMessageDialog(null, "adolescente");
		}
		else if(x <= 65 && x > 20)
		{
			JOptionPane.showMessageDialog(null, "adulto");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "idoso");
		}
	}
}
