package automation.lisset;

import org.testng.annotations.Test;

public class ejercicio {

    @Test
    public void realizarOperacion2() {
        int numero1 = 10;
        int numero2 = 20;

        suma(numero1,numero2);
    }

    public void suma(int a, int b){
        int suma;
        suma=a+b;
        System.out.println("La suma es "+ suma);
    }
}
