import br.com.ti.roberto.factory.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SimpleWebTest {

    public static WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.createDriver();
    }
    /***
     * Testes da funcionalidade de login
     */
    @Test
    public void testSelenium() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("submit-button")).click();
        driver.findElement(By.className("title")).isDisplayed();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
