package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo2Dialog 
{
	public static void main(String[] args) 
	{
		int a,b,x;
		a = Integer.parseInt(JOptionPane.showInputDialog(null));
		b = Integer.parseInt(JOptionPane.showInputDialog(null));
		x = a +b;
		JOptionPane.showMessageDialog(null, a + b);
	}
}
