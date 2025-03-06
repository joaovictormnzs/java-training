package calculos;


public class baskara {

	public static void main(String[] args) {
		//FORMULA DE BASKARA
		
		int a = 31;
		int b = 8;
		int c = 54;
		double delta, x1, x2;
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.println(delta);
		
		x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(x1);
		System.out.println(x2);	
				

	}

}
