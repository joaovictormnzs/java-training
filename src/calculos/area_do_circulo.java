// AREA DO CIRCULO
package calculos;

import java.util.Scanner;

public class area_do_circulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    double raio, pi, area;
	    
	    pi = 3.14159;
	    
	    raio = sc.nextDouble();
	    
	    raio = Math.pow(raio, 2.0);
	    
	    area = pi * raio;
	    
	    System.out.printf("%.4f", area);
	    
	    sc.close();
	}

}

