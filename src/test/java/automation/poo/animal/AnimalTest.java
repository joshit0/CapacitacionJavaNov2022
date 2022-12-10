package automation.poo.animal;

import org.testng.annotations.Test;

public class AnimalTest {

	
	@Test
	public void AnimalTest01() {
		Gato gato = new Gato();
		gato.makeSound();
	}
	
	@Test
	public void AnimalTest02() {
		Perro perro = new Perro();
		perro.makeSound();
	}
	
}
