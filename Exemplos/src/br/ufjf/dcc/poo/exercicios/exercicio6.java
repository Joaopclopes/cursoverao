package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class exercicio6 
{

	public static void main(String[] args) 
	{
		float a,b,c;
		
		a = Float.parseFloat(JOptionPane.showInputDialog(null));
		b = Float.parseFloat(JOptionPane.showInputDialog(null));
		c = Float.parseFloat(JOptionPane.showInputDialog(null));
		
		if(Math.abs(b-c) < a && a < (b+c) ||
		   Math.abs(a-c) < b && b < (a+c) ||
		   Math.abs(a-b) < c && c < (a+b))
		{
			JOptionPane.showMessageDialog(null, "E um triangulo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Nao e um triangulo");
		}
	}
}
