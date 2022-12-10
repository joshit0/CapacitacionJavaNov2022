package automation.operadores;

import org.testng.annotations.Test;

public class OperadoresAritmeticosTest {

	
	@Test
	public void suma() {
		int numero1 = 10;
		int numero2 = 74;

		int resSuma = numero1+numero2;
		System.out.println("La suma es "+ resSuma);
	}

	@Test
	public void resta() {
		int numero1 = 100;
		int numero2 = 74;
		
		int resResta = numero1-numero2;
		System.out.println("La resta es "+ resResta);
	}
	
	@Test
	public void multiplicacion() {
		int numero1 = 4;
		int numero2 = 11;

		int resMultiplicacion = numero1*numero2;
		System.out.println("La multiplicación es "+ resMultiplicacion);
	}
	
	@Test
	public void division() {
		Integer numero1 = 4;
		Integer numero2 = 11;

		float resDivision = numero1.floatValue()/numero2.floatValue();
		System.out.println("La división es "+ resDivision);
	}
	
	@Test
	public void modulo() {
		Integer numero1 = 18;
		Integer numero2 = 11;

		int resModulo = numero1%numero2;
		System.out.println("El módulo es "+ resModulo);
	}
	
	
	@Test
	public void sumaAsigna() {
		int resValor1 = 100;
		resValor1 += 10;
		System.out.println("El suma y asigna es "+ resValor1);
	}
	
	@Test
	public void restaAsigna() {
		int resValor1 = 100;
		resValor1 -= 10;
		System.out.println("El resta y asigna es "+ resValor1);
	}
	
	@Test
	public void multiplicaAsigna() {
		int resValor1 = 100;
		resValor1 *= 5;
		System.out.println("El multiplica y asigna es "+ resValor1);
	}

	@Test
	public void divideAsigna() {
		float resValor1 = 100;
		resValor1 /= 5;
		System.out.println("El divide y asigna es "+ resValor1);
	}

	@Test
	public void incremento() {

		int resValor1 = 11;
		resValor1++;
		System.out.println("El incremento es "+ resValor1);
		
	}	
	
	@Test
	public void decrememto() {

		int resValor1 = 11;
		resValor1--;
		System.out.println("El decrememto es "+ resValor1);
		
	}
	
	
}
