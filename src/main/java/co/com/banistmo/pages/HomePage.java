package co.com.banistmo.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    private HomePage(){
    }

    public static final Target AVISO_SEGURIDAD = Target.the("Boton de Aviso de seguridad")
            .located(By.xpath("//button[@id='btn-aceptar-cookies']"));

    public static final Target PRODUCTOS_SERVICIOS = Target.the("Boton de Productos y servicios")
            .located(By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown menu-fw']//a[contains(text(),'Productos')]"));

    public static final Target PRESTAMOS = Target.the("Boton de Prestamos")
            .located(By.xpath("(//ul[@class='nav navbar-nav']//li[@class='dropdown menu-fw open']//div)[2]//ul//li//a[contains(text(),'Préstamos')]"));
}
