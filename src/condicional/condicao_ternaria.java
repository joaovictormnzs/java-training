package condicional;

import java.util.Scanner;

public class condicao_ternaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 19;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O valor e " + desconto);
		
		sc.close();
	}

}
