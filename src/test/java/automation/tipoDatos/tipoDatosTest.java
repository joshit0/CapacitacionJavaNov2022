package automation.tipoDatos;

public class tipoDatosTest {

	
	public void tipoDatosTest() {
		
		/***Tipos de datos Primitivos***/
		//Tipos numéricos enteros		
		byte numeroByte = 0;
		short numeroShort=2500;
		int numeroInt = 100000;	
		long numeroLong = 1000000000;		
		
		//Tipos numéricos en punto flotante	
		double pesoProducto = 4.5; 
		float tipoCambio = 4; 
		
		//Booleanos y caracteres
		boolean tipoBooleano1=true;	
		char tipoChar1 = 'a'; 
		char tipoChar2 = 1; 
				
		/***Tipos de datos Estructurados***/
		//Cadenas de caracteres
		String nombreCurso = "Capacitación de Selenium y Java";
		
		//Vectores o arrays
		int notasAlumnoArray[];
    	notasAlumnoArray = new int[3];
    	notasAlumnoArray[0]=10;
    	notasAlumnoArray[1]=18;
    	notasAlumnoArray[2]=15;
    	notasAlumnoArray[3]=20;
    	
    	String letrasArray[][];
    	letrasArray = new String[2][2];
    	letrasArray[0][0] = "A";
    	letrasArray[0][1] = "B";
    	letrasArray[0][2] = "C";
    	letrasArray[1][0] = "D";
    	letrasArray[1][1] = "E";
    	letrasArray[1][2] = "F";
    	letrasArray[2][0] = "G";
    	letrasArray[2][1] = "H";
    	letrasArray[2][2] = "I";
    					
    	/***Tipos de datos Definidos por el Usuario***/
    	Integer definido01 = 1;
    	float resultado = definido01.floatValue();

	}
	
	public void practicaTipoDatos() {
		
		
	}

}
