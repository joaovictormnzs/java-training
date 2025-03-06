package exercicios;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/

import java.util.Scanner; 

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p1, n1, p2, n2;
		double v1, v2, total; 
		
		p1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		    
		p2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		total = n1*v1 + n2*v2;
		
		System.out.printf("O VALOR A PAGAR E: R$%.2f", total);
		sc.close();
	}

}
