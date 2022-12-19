package automation.metodos;

import org.testng.annotations.Test;

public class MetodosReturnTest {

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
		int numero2 = 20;
		
		sumar(numero1,numero2);
	}
	
	
	public void sumar(int numero1, int numero2) {
		int resultado = numero1+numero2;
		System.out.println("La suma es "+ resultado);
	}
	
	public void restar(){

	}
	
	
}
