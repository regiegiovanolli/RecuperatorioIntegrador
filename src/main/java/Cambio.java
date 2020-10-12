import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class Cambio {


    public static void Cambio2(String telefono , String celular ,String calle , String compania, String sobrenombre) {

        WebDriver driver = getChromeDriver();

        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(telefono);

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys(celular);

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys(calle);

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys(compania);

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(sobrenombre);

        driver.findElement(By.cssSelector("#submitAddress > span")).click();

    }

}
