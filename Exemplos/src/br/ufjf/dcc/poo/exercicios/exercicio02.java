package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class exercicio02 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		float lado1,lado2,areac,areat;
		
		System.out.print("Lado1 :");
		lado1 = teclado.nextFloat();
		System.out.print("Lado2 :");
		lado2 = teclado.nextFloat();
		areat = lado1 * lado2;
		
		System.out.print("Lado1 :");
		lado1 = teclado.nextFloat();
		System.out.print("Lado2 :");
		lado2 = teclado.nextFloat();
		areac = lado1* lado2;
		
		System.out.println("area restante :"+ ((areat - areac)/areat)*100+"%");
	}
}