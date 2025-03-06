package calculos;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Amanda"; 
		int idade = 18;
		double renda = 3.000;
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("Hello Word!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.4f%n", x);
		

		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = "+ x +" METROS");
		System.out.printf("RESULTADO = %f %d metros%n", x, y);
		System.out.printf("%s tem %d anos e ganha %.3f reais", nome, idade, renda);
		System.out.printf("%f", x);
		
	}

}
