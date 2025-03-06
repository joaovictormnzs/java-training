package scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x, y, z; 
		
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();

	}

}
