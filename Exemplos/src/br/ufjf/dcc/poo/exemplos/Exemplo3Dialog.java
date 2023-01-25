package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo3Dialog 
{

	public static void main(String[] args) 
	{
		double xa,xb,ya,yb;
		JOptionPane.showMessageDialog(null, "digite o primeiro ponto.");
		xa = Integer.parseInt(JOptionPane.showInputDialog(null));
		ya = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		JOptionPane.showMessageDialog(null, "digite o segundo ponto.");
		xb = Integer.parseInt(JOptionPane.showInputDialog(null));
		yb = Integer.parseInt(JOptionPane.showInputDialog(null));
		
		JOptionPane.showMessageDialog(null, "distancia entre estes pontos: "+ Math.sqrt((Math.pow((xb - xa),2)+Math.pow((yb - ya),2))));
	}

}
