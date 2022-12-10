package automation.operadores;

import org.testng.annotations.Test;

public class OperadoresLogicosTest {

	
	@Test
	public void operadorY() {
		
		int numero1 = 10;
		String dia = "Lunes";
		
		if(numero1==10 && dia.equals("Lunes")) {
			System.out.println("COINCIDEN LAS 2 CONDICIONES");
		} else {
			System.out.println("NO COINCIDEN LAS 2 CONDICIONES");
			
		}
		
	}
	
	@Test
	public void operadorO() {
		
		int numero1 = 10;
		String dia = "Martes";
		
		if(numero1==10 || dia.equals("Lunes")) {
			System.out.println("UNA O TODAS LAS CONDICIONES COINCIDEN");
		} else {
			System.out.println("NINGUNA CONDICION COINCIDE");
			
		}
		
	}
}
