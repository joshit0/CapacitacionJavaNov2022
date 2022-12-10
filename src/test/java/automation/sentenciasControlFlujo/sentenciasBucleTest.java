package automation.sentenciasControlFlujo;

import org.testng.annotations.Test;

public class sentenciasBucleTest {

	@Test
	public void sentenciaWhile() {
	
		int numeroActual = 0;
		int numeroEsperado = 5;
		
		while(numeroActual<10) {
			System.out.println("El numero "+numeroActual+" es menor que "+numeroEsperado);
			numeroActual++;
		}
		
	}
	
	@Test
	public void sentenciaDoWhile() {
	
		int numeroActual = 3;
		
	   do{    
	        System.out.println(numeroActual);    
	        numeroActual++;    
	    }while(numeroActual<=3);    
		
	}
	
	@Test
	public void sentenciaFor() {
		
		int numeroEsperado = 3;
		int i;
		
		for(i = 1; i<=numeroEsperado; i++)  {
			System.out.println(i);

		} 
		
	}
	
	
	
}
