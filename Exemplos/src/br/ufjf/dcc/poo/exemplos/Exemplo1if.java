package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo1if
{
	public static void main(String[] args)
	{
		double numero;
		numero = Double.parseDouble(JOptionPane.showInputDialog(null));
		
		if(numero < 0)
			numero = -numero;
		numero = numero +1;
		JOptionPane.showMessageDialog(null, "Valor absoluto: "+numero );
		
	}
}
