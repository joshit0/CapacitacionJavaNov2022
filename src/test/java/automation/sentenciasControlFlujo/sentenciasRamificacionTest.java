package automation.sentenciasControlFlujo;

import org.testng.annotations.Test;

public class sentenciasRamificacionTest {

	
	@Test
	public void sentenciaBreak() {
		
		int numeroEsperado = 3;
		int i;
		
		for(i = 1; i<=numeroEsperado; i++)  {
			System.out.println("CONTADOR EN NUMERO " + i);
			System.out.println("Lunes");
			System.out.println("Martes");
			if(i==2) {
				break;
			}
			System.out.println("Miercoles");
			System.out.println("Jueves");
			System.out.println("Viernes");

		} 
	}
	
	
	@Test
	public void sentenciaContinue() {
		
		int numeroEsperado = 3;
		int i;
		
		for(i = 1; i<=numeroEsperado; i++)  {
			System.out.println("CONTADOR EN NUMERO " + i);
			System.out.println("Lunes");
			System.out.println("Martes");
			if(i==2) {
				continue;
			}
			System.out.println("Miercoles");
			System.out.println("Jueves");
			System.out.println("Viernes");

		} 
		
	}
	
	
}
