package automation.sentenciasControlFlujo;

import org.testng.annotations.Test;

public class sentenciasDecisionTest {

	@Test
	public void sentenciaIfElse() {
		
		int numero1 = 50;
		int numero2 = 20;
		
		if(numero1>numero2) {
			System.out.println("El numero "+numero1+" es mayor que "+numero2);
		}else
		{
			System.out.println("El numero "+numero1+" es menor que "+numero2);	
		}
		
	}
	
	@Test
	public void sentenciaSwitch() {
		
		int color = 1;
		
		switch(color) {
		case 1: System.out.println("Azul");
				break;
		case 2: System.out.println("Verde");
				break;
		case 3: System.out.println("Rojo");
				break;
		default: System.out.println("Amarillo");
				break;
		
		}		
	}
	
	
	
}
