import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void UpdateMyAddress() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        /*Se inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys("fernandocotrena@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();


        /*Se accede a la vista a la opcion MY ADDRESSES y luego a la opcion Update*/
        driver.findElement(By.cssSelector("li:nth-child(3) > a > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".address_update .icon-chevron-right")).click();


        /*
           En la vista "YOUR ADDRESSES", se actualizan los datos:
            phone, phone_mobile,address1,company y alias
         */

        Cambio.Cambio2("1234567890",
                "0987654321",
                "1st Street 36110",
                "casa",
                "UTN AUTOMATION");


        /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
        assertEquals("UTN AUTOMATION", driver.findElement(By.cssSelector(".page-subheading")).getText());
    }

}
