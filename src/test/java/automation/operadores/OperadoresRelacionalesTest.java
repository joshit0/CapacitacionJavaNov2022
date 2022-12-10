package automation.operadores;

import org.testng.annotations.Test;

public class OperadoresRelacionalesTest {

	
	@Test
	public void igualA() {
		
		int numero1 = 10;
		int numero2 = 20;
		
		if(numero1 == numero2) {
			System.out.println("CORRECTO: Los números son iguales");
		}else {
			System.out.println("INCORRECTO: Los números son diferentes");
		}
		
	}
	
	@Test
	public void diferenteA() {
		
		int numero1 = 10;
		int numero2 = 20;
		
		if(numero1 != numero2) {
			System.out.println("CORRECTO: Los números son diferentes");
		}else {
			System.out.println("INCORRECTO: Los números son iguales");
		}
		
	}
	
	@Test
	public void mayorQue() {
		
		int numero1 = 10;
		int numero2 = 20;
		
		if(numero1 > numero2) {
			System.out.println("CORRECTO: El número "+ numero1 + " es mayor que "+ numero2);
		}else {
			System.out.println("INCORRECTO: El número "+ numero1 + " no es mayor que "+ numero2);
		}
		
	}
	
	@Test
	public void menorQue() {
		
		int numero1 = 10;
		int numero2 = 20;
		
		if(numero1 < numero2) {
			System.out.println("CORRECTO: El número "+ numero1 + " es menor que "+ numero2);
		}else {
			System.out.println("INCORRECTO: El número "+ numero1 + " no es menor que "+ numero2);
		}
		
	}
	
	@Test
	public void mayorIgualQue() {
		
		int numero1 = 10;
		int numero2 = 20;
		
		if(numero1 >= numero2) {
			System.out.println("CORRECTO: El número "+ numero1 + " es mayor o igual que "+ numero2);
		}else {
			System.out.println("INCORRECTO: El número "+ numero1 + " no es mayor o igual que "+ numero2);
		}
		
	}
	
	@Test
	public void menorIgualQue() {
		
		int numero1 = 10;
		int numero2 = 10;
		
		if(numero1 <= numero2) {
			System.out.println("CORRECTO: El número "+ numero1 + " es menor o igual que "+ numero2);
		}else {
			System.out.println("INCORRECTO: El número "+ numero1 + " no es menor o igual que "+ numero2);
		}
		
	}
	
	
	
}
