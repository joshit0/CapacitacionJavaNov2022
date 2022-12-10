package automation.poo.vehiculo;

public class Vehiculo {

	
	private String placa, marca, modelo;
	private int kilometraje;

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getKilometraje() {
		return kilometraje;
	}
	
	Vehiculo(String placa, String marca, String modelo, int kilometraje){
		this.placa = placa;
		this.marca=marca;
		this.modelo=modelo;
		this.kilometraje= kilometraje;
	}
	
	public void getInformacionVehiculo() {
		System.out.println("INFORMACION DEL VEHICULO");
		System.out.println("-----------------------------------");
		System.out.println("Placa: "+this.placa);
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Kilometraje: "+this.kilometraje);
		System.out.println("-----------------------------------");
	}

	public void arrancar() {
		System.out.println("Arrancando...");
	}

	public void frenar() {
		System.out.println("Frenando...");
	}
	
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void tocarClaxon() {
		System.out.println("Ti Tiiiiiiiiiiii...");
	}
	
	
}
