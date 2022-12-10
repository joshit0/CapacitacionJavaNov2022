package automation.metodos;

import org.testng.annotations.Test;

public class MetodosSobrecargaTest {


	@Test
	public void realizarOperacion() {
		int numero1 = 10;
		int numero2 = 20;
		int numero3 = 30;
		int numero4 = 40;

		sumar(numero1,numero2);
		sumar(numero1,numero2,numero3);
		sumar(numero1,numero2,numero3,numero4);
	}
	
	
	public void sumar(int numero1, int numero2) {
		int resultado = numero1+numero2;
		System.out.println("La suma es "+ resultado);
	}

	public void sumar(int numero1, int numero2, int numero3) {
		int resultado = numero1+numero2+numero3;
		System.out.println("La suma es "+ resultado);
	}

	public void sumar(int numero1, int numero2, int numero3, int numero4) {
		int resultado = numero1+numero2+numero3+numero4;
		System.out.println("La suma es "+ resultado);
	}
	
	
	@Test
	public void obtenerNumeroMayor() {
		int numero1 = 10;
		int numero2 = 50;
		int numero3 = 30;

        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);
        System.out.println("numero3: " + numero3);

        int resultado1= mayor(numero1,numero2);
        System.out.println("El mayor de numero1 y numero2 es: "+resultado1);

        int resultado2= mayor(numero1,numero2,numero3);
        System.out.println("El mayor de numero1 y numero2 es: "+resultado2);
	}
	
	
	public int mayor (int numero1, int numero2) {
        return numero1>numero2 ? numero1 : numero2;
    }
	 
	public int mayor(int numero1, int numero2, int numero3) {
        return mayor(mayor(numero1,numero2),numero3);
    }
	
	
	
	

	public void realizarSuma(int numero1, int numero2) {
		
		int resultado = numero1+numero2;
		System.out.println("La suma es "+ resultado);
	
	}
	
	
	
}
