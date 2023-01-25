package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo4Dialog
{
	public static void main(String[] args)
	{
		int km,litros;
		
		km = Integer.parseInt(JOptionPane.showInputDialog(null));
		litros = Integer.parseInt(JOptionPane.showInputDialog(null));
		JOptionPane.showMessageDialog(null, km/litros);
	}
}
