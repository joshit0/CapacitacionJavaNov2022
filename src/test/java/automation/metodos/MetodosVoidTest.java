package automation.metodos;

import org.testng.annotations.Test;

public class MetodosVoidTest {

	@Test
	public void realizarOperacion1() {
		int numero1 = 10;
		int numero2 = 20;
		
		int resultado = numero1+numero2;

		System.out.println("La suma es "+ resultado);
	}
	

	@Test
	public void realizarOperacion2() {
		int numero1 = 10;
		int numero2 = 2;
		
		int resultado = sumar(numero1,numero2);
		
		if(resultado>25) {
			System.out.println("El resultado es mayor a 25");
		} {
			System.out.println("El resultado NO es mayor a 25");
		}
	}
	
	
	public int sumar(int numero1, int numero2) {
		int resultado = numero1+numero2;
		return resultado;
	}
	
	
	
	
}
