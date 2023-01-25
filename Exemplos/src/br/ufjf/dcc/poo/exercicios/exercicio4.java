package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio4
{
	public static void main(String[] args)
	{
		int r,x = (int)(Math.random() * 1000);
		
		r = Integer.parseInt(JOptionPane.showInputDialog(null, "um numero de 0 a 1000: "));
		
		if(r < x)
		{
			JOptionPane.showMessageDialog(null, "o numero é menor.");
		}
		else if(r > x)
		{
			JOptionPane.showMessageDialog(null, "o numero é maior.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "acerto.");
		}
		
	}
}
