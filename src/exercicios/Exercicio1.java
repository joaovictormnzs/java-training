package exercicios;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.*/

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, hora, valorhora;
		int nf;
		
		nf = sc.nextInt();
		salario = sc.nextDouble();
		hora = sc.nextDouble();
		
		valorhora = salario * hora;
		
		System.out.println("NUMERO: " + nf);
		System.out.printf("SALARIO: R$%.2f", valorhora);
		
		sc.close();
		
	}

}