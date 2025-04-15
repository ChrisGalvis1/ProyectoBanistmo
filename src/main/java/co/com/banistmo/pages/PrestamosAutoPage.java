package co.com.banistmo.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrestamosAutoPage {

    private PrestamosAutoPage(){
    }

    public static final Target TASAS_TARIFAS = Target.the("Boton de tasas y tarifas")
            .located(By.xpath("//ul[@id='filialTabs']//a[contains(text(),'Tasas y tarifas')]"));

    public static final Target PDF_PROHIBICIONES = Target.the("Boton de tasas y tarifas")
            .located(By.xpath("//div[@id='tab4']//table//tbody//tr[2]//a"));

}
