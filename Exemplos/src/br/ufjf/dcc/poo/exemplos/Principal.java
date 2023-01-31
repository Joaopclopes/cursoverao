package br.ufjf.dcc.poo.exemplos;

import java.util.ArrayList;

public class Principal 
{

	public static void main(String[] args) 
	{
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for(int i = 0;i < 3;i++)
		{
			
		}
		
		for(Pessoa p :pessoas)
		{
			System.out.println("---> "+p.getNome());
			System.out.println("---> "+p.getIdade());
			System.out.println("---> "+p.getSexo());
		}
	}

}
