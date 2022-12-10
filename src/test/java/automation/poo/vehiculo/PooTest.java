package automation.poo.vehiculo;

import org.testng.annotations.Test;

public class PooTest {

	
	@Test
	public void vehiculoTest() {
		
		Vehiculo vehiculo = new Vehiculo("ATX-554", "HAVAL", "H6 2016", 90000);
		vehiculo.getInformacionVehiculo();
		vehiculo.arrancar();
		vehiculo.acelerar();
		vehiculo.tocarClaxon();
		vehiculo.frenar();
		
	}
	
	@Test
	public void FerrariTest() {
		
		AutoCarrera autoCarrera = new AutoCarrera("FER-110", "Ferrari", "F1-75", 0);
		autoCarrera.getInformacionVehiculo();
		autoCarrera.arrancar();
		autoCarrera.acelerar();
		autoCarrera.turbo();
		autoCarrera.tocarClaxon();
		autoCarrera.frenar();
		
	}
	
}
