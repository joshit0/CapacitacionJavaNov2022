package automation.lisset.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumExtractor {

WebDriver driver;
@Test
public void test01(){

    int valor1 = 10;
    setUpWebDriver();

    abcMetodo(valor1);

   String textoEncabezado = extraerTextoEncabezadoH1();
   String textoUrl = extraerUrlLink();
   String textoOculto = extraerTextoOculto();

    System.out.println("Valor Texto Encabezado: " +textoEncabezado);
    System.out.println("Valor Texto Url: " +textoUrl);
    System.out.println("Valor Texto Oculto: " +textoOculto);

}


public void setUpWebDriver(){

    String url = "file:///D:/repositorio01/CapacitacionJavaNov2022/src/test/resources/paginaHtml/Index.html";
    String rutaDriver = "src/test/resources/driver/chromedriver.exe";

    System.setProperty("webdriver.chrome.driver", rutaDriver);
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(url);
    driver.manage().window().maximize();
}



    public String abcMetodo(int numero1){
        //String textoH1 = driver.findElement(By.name("tituloContenedor")).getText();
        String textoH1 = driver.findElement(By.xpath("//h1[@name='tituloContenedor']")).getText();
        return textoH1;
    }


    public String extraerTextoEncabezadoH1(){
        //String textoH1 = driver.findElement(By.name("tituloContenedor")).getText();
        String textoH1 = driver.findElement(By.xpath("//h1[@name='tituloContenedor']")).getText();
        return textoH1;
    }

    public String extraerUrlLink(){

        String textoHref = driver.findElement(By.xpath("//a")).getAttribute("href");
        return textoHref;
    }
    public String extraerTextoOculto(){
        String textoOculto = driver.findElement(By.xpath("//p[@class='hidden']")).getText();
        return textoOculto;
    }


}
